package eu.europa.ec.grow.espd.xml.response.importing.selection
import eu.europa.ec.grow.espd.domain.AvailableElectronically
import eu.europa.ec.grow.espd.domain.EconomicFinancialStandingCriterion
import eu.europa.ec.grow.espd.domain.EspdDocument
import eu.europa.ec.grow.espd.xml.base.AbstractXmlFileImport
import org.apache.commons.io.IOUtils
/**
 * Created by ratoico on 1/12/16 at 3:35 PM.
 */
class FinancialRatioImportTest extends AbstractXmlFileImport {

    def "10. should import all fields of 'Financial ratio'"() {
        given:
        def espdResponseXml = importXmlResponseFile("selection/financial_ratio_import.xml")

        when:
        EspdDocument espd = marshaller.importEspdResponse(IOUtils.toInputStream(espdResponseXml))

        then:
        espd.financialRatio.exists == true

        then:
        espd.financialRatio.description1 == "description1"
        espd.financialRatio.ratio1 == 11.1

        then:
        espd.financialRatio.description2 == "description2"
        espd.financialRatio.ratio2 == 22.2

        then:
        espd.financialRatio.description3 == "description3"
        espd.financialRatio.ratio3 == 33.3

        then:
        espd.financialRatio.description4 == "description4"
        espd.financialRatio.ratio4 == 44.4

        then:
        espd.financialRatio.description5 == "description5"
        espd.financialRatio.ratio5 == 55.5

        then: "info electronically"
        espd.financialRatio.availableElectronically.exists == true
        espd.financialRatio.availableElectronically.url == "www.hodor.com"
        espd.financialRatio.availableElectronically.code == "PROF_REGISTER"
    }

    def "all fields needed to generate a XML sample"() {
        given:
        def espd = new EspdDocument(financialRatio: new EconomicFinancialStandingCriterion(exists: true,
                description1: "description1", description2: "description2", description3: "description3", description4: "description4", description5: "description5",
                ratio1: 11.1, ratio2: 22.2, ratio3: 33.3, ratio4: 44.4, ratio5: 55.5,
                availableElectronically: new AvailableElectronically(exists: true, url: "www.hodor.com", code: "PROF_REGISTER")))
                saveEspdAsXmlResponse(espd, "/home/ratoico/Downloads/espd-request.xml")

        expect:
        1 == 1
    }

}