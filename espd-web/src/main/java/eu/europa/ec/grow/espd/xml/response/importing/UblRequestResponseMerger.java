package eu.europa.ec.grow.espd.xml.response.importing;

import eu.europa.ec.grow.espd.domain.EspdDocument;
import eu.europa.ec.grow.espd.domain.enums.criteria.AwardCriterion;
import eu.europa.ec.grow.espd.xml.common.importing.CriteriaToEspdDocumentPopulator;
import eu.europa.ec.grow.espd.xml.common.importing.EconomicOperatorImplTransformer;
import eu.europa.ec.grow.espd.xml.common.importing.PartyImplTransformer;
import grow.names.specification.ubl.schema.xsd.espdrequest_1.ESPDRequestType;
import grow.names.specification.ubl.schema.xsd.espdresponse_1.ESPDResponseType;
import isa.names.specification.ubl.schema.xsd.ccv_commonaggregatecomponents_1.CriterionType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * Class that imports a ESPD request and a ESPD response and create a new merged ESPD domain object.
 * <p/>
 * The new object includes:
 * <ul>
 *     <li>Information on the EO</li>
 *     <li>All mandatory Exclusion grounds</li>
 *     <li>Selection criteria that where asked for in the new ESPD request that were answered in the old ESPD response</li>
 * </ul>
 * <p/>
 * Created by ratoico on 3/8/16 at 11:12 AM.
 */
@Component
@Slf4j
public class UblRequestResponseMerger extends UblResponseImporter {

    @Autowired
    public UblRequestResponseMerger(PartyImplTransformer partyImplTransformer,
            EconomicOperatorImplTransformer economicOperatorImplTransformer,
            CriteriaToEspdDocumentPopulator criteriaToEspdDocumentPopulator) {
        super(partyImplTransformer, economicOperatorImplTransformer, criteriaToEspdDocumentPopulator);
    }

    /**
     * Build an instance of a {@link EspdDocument} populated with data coming from a UBL Request and Response.
     *
     * @return A ESPD domain object with the information merge from the Request and Response
     */
    public EspdDocument mergeRequestAndResponse(ESPDRequestType requestType, ESPDResponseType responseType) {
        return buildEspdDocument(requestType, responseType);
    }

    @Override
    protected List<CriterionType> selectCriteria(ESPDRequestType requestType, ESPDResponseType responseType) {
        List<CriterionType> toKeep = new ArrayList<>(responseType.getCriterion().size());

        // a request contains only exclusion and selection criteria
        // and we need to keep only the criteria specified in the request
    	for (CriterionType reqCrit : requestType.getCriterion()) {
    		CriterionType toAdd = null;

    		// if criteria exists in response then use it
    		for (CriterionType respCrit : responseType.getCriterion()) {
    			 if (Objects.equals(respCrit.getID().getValue(), reqCrit.getID().getValue())) {
    				 toAdd = respCrit;
                     break;
                 }
    		}

    		toKeep.add(toAdd == null ? reqCrit : toAdd);
    	}
    	
    	// economic operator criteria are not part of the request but we will get them from the response
    	for (AwardCriterion awardCrit : AwardCriterion.values()) {
    		for (CriterionType respCrit : responseType.getCriterion()) {
    			if (awardCrit.getUuid().equals(respCrit.getID().getValue())) {
    				toKeep.add(respCrit);
    				break;
    			}
    		}
    	}
    	 
    	return toKeep;
    }

}
