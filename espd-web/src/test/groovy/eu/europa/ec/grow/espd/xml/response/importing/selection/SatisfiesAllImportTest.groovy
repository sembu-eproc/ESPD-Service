package eu.europa.ec.grow.espd.xml.response.importing.selection
import eu.europa.ec.grow.espd.domain.EspdDocument
import eu.europa.ec.grow.espd.domain.SatisfiesAllCriterion
import eu.europa.ec.grow.espd.xml.base.AbstractXmlFileImport
import org.apache.commons.io.IOUtils
/**
 * Created by ratoico on 1/26/16 at 9:20 AM.
 */
class SatisfiesAllImportTest extends AbstractXmlFileImport {

    def "1. should import all fields of 'Satisfies all'"() {
        given:
        def espdResponseXml = importXmlResponseFile("selection/satisfies_all_import.xml")

        when:
        EspdDocument espd = marshaller.importEspdResponse(IOUtils.toInputStream(espdResponseXml)).get()

        then:
        espd.selectionSatisfiesAll.exists == true

        then: "satisfies all has no answer so it is set to false"
        espd.selectionSatisfiesAll.answer == false
    }

    def "all fields needed to generate a XML sample"() {
        given:
        def espd = new EspdDocument(selectionSatisfiesAll: new SatisfiesAllCriterion(exists: false, answer: null,))
//                saveEspdAsXmlResponse(espd, "/home/ratoico/Downloads/espd-response.xml")

        expect:
        1 == 1
    }

}