package eu.europa.ec.grow.espd.controller;

import com.google.common.base.Optional;
import eu.europa.ec.grow.espd.domain.EconomicOperatorImpl;
import eu.europa.ec.grow.espd.domain.EspdDocument;
import eu.europa.ec.grow.espd.domain.enums.other.Country;
import eu.europa.ec.grow.espd.ted.TedRequest;
import eu.europa.ec.grow.espd.ted.TedResponse;
import eu.europa.ec.grow.espd.ted.TedService;
import eu.europa.ec.grow.espd.xml.EspdExchangeMarshaller;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.output.CountingOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@SessionAttributes("espd")
@Slf4j
class EspdController {

    private final EspdExchangeMarshaller exchangeMarshaller;

    private final TedService tedService;

    @Autowired
    EspdController(EspdExchangeMarshaller exchangeMarshaller, TedService tedService) {
        this.exchangeMarshaller = exchangeMarshaller;
        this.tedService = tedService;
    }

    @ModelAttribute("espd")
    public EspdDocument newDocument() {
        return new EspdDocument();
    }

    @RequestMapping("/")
    public String index() {
        return "welcome";
    }

    @RequestMapping("/{page:filter|print|contact}")
    public String getPage(@PathVariable String page) {
        return page;
    }

    @RequestMapping(value = "/welcome")
    public String cancel(SessionStatus status) {
        try {
            return "welcome";
        } finally {
            status.setComplete();
        }
    }

    @RequestMapping(value = "/filter", params = "action", method = POST)
    public String whoAreYouScreen(
            @RequestParam("authority.country") Country country,
            @RequestParam String action,
            @RequestPart List<MultipartFile> attachments,
            @ModelAttribute("espd") EspdDocument document,
            Model model,
            BindingResult result) throws IOException {
        if ("ca_create_espd_request".equals(action)) {
            return createNewRequestAsCA(country, document);
        } else if ("ca_reuse_espd_request".equals(action)) {
            return reuseRequestAsCA(attachments.get(0), model, result);
        } else if ("ca_review_espd_response".equals(action)) {
            return reviewResponseAsCA(attachments.get(0), model, result);
        } else if ("eo_import_espd".equals(action)) {
            return importEspdAsEo(country, attachments.get(0), model, result);
        } else if ("eo_merge_espds".equals(action)) {
            return mergeTwoEspds(attachments, model, result);
        }
        return "filter";
    }

    private String createNewRequestAsCA(Country country, EspdDocument document) {
        document.getAuthority().setCountry(country);
        copyTedInformation(document);
        return "redirect:/request/ca/procedure";
    }

    private void copyTedInformation(EspdDocument document) {
        TedResponse tedResponse = tedService
                .getContractNoticeInformation(TedRequest.builder().receptionId(document.getTedReceptionId()).build());
        document.setOjsNumber(tedResponse.getNoDocOjs());
        TedResponse.TedNotice notice = tedResponse.getFirstNotice();
        document.getAuthority().setName(notice.getOfficialName());
        document.setProcedureTitle(notice.getTitle());
        document.setProcedureShortDesc(notice.getShortDescription());
        document.setFileRefByCA(notice.getReferenceNumber());
        document.setTedUrl(notice.getTedUrl());
    }

    private String reuseRequestAsCA(MultipartFile attachment, Model model,
            BindingResult result) throws IOException {
        try (InputStream is = attachment.getInputStream()) {
            Optional<EspdDocument> espd = exchangeMarshaller.importEspdRequest(is);
            if (espd.isPresent()) {
                model.addAttribute("espd", espd.get());
                return "redirect:/request/ca/procedure";
            }
        }

        result.rejectValue("attachments", "espd_upload_request_error");
        return "filter";
    }

    private String reviewResponseAsCA(MultipartFile attachment, Model model,
            BindingResult result) throws IOException {
        try (InputStream is = attachment.getInputStream()) {
            Optional<EspdDocument> espd = exchangeMarshaller.importEspdResponse(is);
            if (espd.isPresent()) {
                model.addAttribute("espd", espd.get());
                return "redirect:/print";
            }
        }

        result.rejectValue("attachments", "espd_upload_response_error");
        return "filter";
    }

    private String importEspdAsEo(Country country, MultipartFile attachment, Model model, BindingResult result)
            throws IOException {
        try (InputStream is = attachment.getInputStream()) {
            Optional<EspdDocument> wrappedEspd = exchangeMarshaller.importAmbiguousEspdFile(is);

            if (wrappedEspd.isPresent()) {
                EspdDocument espd = wrappedEspd.get();
                if (espd.getEconomicOperator() == null) {
                    espd.setEconomicOperator(new EconomicOperatorImpl());
                }
                if (needsToLoadProcurementProcedureInformation(espd)) {
                    // in this case we need to contact TED again to load the procurement information
                    copyTedInformation(espd);
                }
                espd.getEconomicOperator().setCountry(country);
                model.addAttribute("espd", espd);
                return "redirect:/response/eo/procedure";
            }
        }

        result.rejectValue("attachments", "espd_upload_error");
        return "filter";
    }

    private String mergeTwoEspds(List<MultipartFile> attachments, Model model, BindingResult result)
            throws IOException {
        try (InputStream reqIs = attachments.get(1).getInputStream();
                InputStream respIs = attachments.get(2).getInputStream()) {
            Optional<EspdDocument> wrappedEspd = exchangeMarshaller.mergeEspdRequestAndResponse(reqIs, respIs);
            if (wrappedEspd.isPresent()) {
                model.addAttribute("espd", wrappedEspd.get());
                return "redirect:/response/eo/procedure";
            }
        }

        result.rejectValue("attachments", "espd_upload_error");
        return "filter";
    }

    private boolean needsToLoadProcurementProcedureInformation(EspdDocument espdDocument) {
        return isBlank(espdDocument.getOjsNumber()) && isNotBlank(espdDocument.getTedReceptionId());
    }

    @RequestMapping("/{flow:request|response}/{agent:ca|eo}/{step:procedure|exclusion|selection|finish}")
    public String view(
            @PathVariable String flow,
            @PathVariable String agent,
            @PathVariable String step,
            @ModelAttribute("espd") EspdDocument espd) {
        return flow + "_" + agent + "_" + step;
    }

    @RequestMapping(value = "/{flow:request|response}/{agent:ca|eo}/{step:procedure|exclusion|selection|finish}", method = POST, params = "prev")
    public String previous(
            @PathVariable String flow,
            @PathVariable String agent,
            @PathVariable String step,
            @RequestParam String prev,
            @ModelAttribute("espd") EspdDocument espd,
            BindingResult bindingResult) {
        return bindingResult.hasErrors() ?
                flow + "_" + agent + "_" + step : "redirect:/" + flow + "/" + agent + "/" + prev;
    }

    @RequestMapping(value = "/{flow:request|response}/{agent:ca|eo}/{step:procedure|exclusion|selection|finish|generate}", method = POST, params = "next")
    public String next(
            @PathVariable String flow,
            @PathVariable String agent,
            @PathVariable String step,
            @RequestParam String next,
            @ModelAttribute("espd") EspdDocument espd,
            HttpServletResponse response,
            BindingResult bindingResult) throws IOException {
        if (bindingResult.hasErrors()) {
            return flow + "_" + agent + "_" + step;
        }

        if (!"generate".equals(next)) {
            return "redirect:/" + flow + "/" + agent + "/" + next;
        }

        downloadEspdFile(agent, espd, response);

        return null;
    }

    private void downloadEspdFile(@PathVariable String agent, @ModelAttribute("espd") EspdDocument espd,
            HttpServletResponse response) throws IOException {
        try (CountingOutputStream out = new CountingOutputStream(response.getOutputStream())) {
            response.setContentType(APPLICATION_XML_VALUE);
            if ("eo".equals(agent)) {
                response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"espd-response.xml\"");
                exchangeMarshaller.generateEspdResponse(espd, out);
            } else {
                response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"espd-request.xml\"");
                exchangeMarshaller.generateEspdRequest(espd, out);
            }
            response.setHeader(HttpHeaders.CONTENT_LENGTH, String.valueOf(out.getByteCount()));
            out.flush();
        }
    }

    @InitBinder
    private void dateBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, editor);
    }
}
