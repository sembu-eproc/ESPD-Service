package eu.europa.ec.grow.espd.business.response.exclusion

import eu.europa.ec.grow.espd.business.AbstractEspdXmlMarshalling

/**
 * Created by ratoico on 11/27/15 at 10:42 AM.
 */
class EspdResponseExclusionCriteriaMarshallingTest extends AbstractEspdXmlMarshalling {

    def "bogus"() {
        expect:
        1 == 1
    }

//    def "criterion responses should appear only once"() {
//        given:
//        def espd = new EspdDocument(criminalConvictions: new CriminalConvictions(exists: true), corruption: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//
//        then: "only one criterion response per criterion"
//        resp.Criterion[0].CriterionResponse.size() == 1
//        resp.Criterion[0].CriterionResponse.CriterionFulfillmentIndicator == true
//
//        resp.Criterion[1].CriterionResponse.size() == 1
//        resp.Criterion[1].CriterionResponse.CriterionFulfillmentIndicator == true
//    }
//
//    def "00. should contain the 'Grounds relating to criminal convictions' criterion"() {
//        given:
//        def espd = new EspdDocument(criminalConvictions: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseResponseXml(espd)
//        def idx = 0
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "005eb9ed-1347-4ca3-bb29-9bc0db64e1ab")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CRIMINAL_CONVICTIONS")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Grounds relating to criminal convictions"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Within the past five years, has the economic operator itself or any person who is a member of its administrative, management or supervisory body or has powers of representation, decision or control therein been the subject of a conviction by final judgment for criminal conviction, such as participation in a criminal organisation, as defined in Article 2 of Council Framework Decision 2008/841/JHA?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(1)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        // we only test here the schemeAgencyID, schemeID and schemeVersionID
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "802f9b05-b463-4455-b92b-35ef2ac4af68"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.@schemeAgencyID.text() == "EU-COM-GROW"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.@schemeID.text() == "CriterionRelatedIDs"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.@schemeVersionID.text() == "1.0"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes indicate: a) Date of conviction; b) Reason; c) Who has been convicted; d) Length of the period of exclusion."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "fba0982a-6d69-41aa-8494-8d46e2eb97ca"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.@schemeAgencyID.text() == "EU-COM-GROW"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.@schemeID.text() == "CriterionRelatedIDs"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.@schemeVersionID.text() == "1.0"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "4b435c95-3de7-43dc-ae8d-6e7028e95a38"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.@schemeAgencyID.text() == "EU-COM-GROW"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.@schemeID.text() == "CriterionRelatedIDs"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.@schemeVersionID.text() == "1.0"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "01. should contain the 'Corruption' criterion"() {
//        given:
//        def espd = new EspdDocument(corruption: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 1
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "c27b7c4e-c837-4529-b867-ed55ce639db5")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CRIMINAL_CONVICTIONS")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Corruption"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Within the past five years, has the economic operator itself or any person who is a member of its administrative, management or supervisory body or has powers of representation, decision or control therein been the subject of a conviction by final judgment for corruption, as defined in Article 3 of the Convention on the fight against corruption involving officials of the European Communities or officials of Member States of the European Union and Article 2(1) of Council Framework Decision 2003/568/JHA, as well as corruption as defined in the national law of the contracting authority or the economic operator?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(1)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "6daa0604-d8d3-451d-8e72-9a8743437629"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes indicate: a) Date of conviction; b) Reason; c) Who has been convicted; d) Length of the period of exclusion."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "21bc3c38-4797-41cf-a9da-f57275615cc9"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "ae160e97-ef2b-4ac9-95cb-1c346890766b"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "02. should contain the 'Fraud' criterion"() {
//        given:
//        def espd = new EspdDocument(fraud: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 2
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "297d2323-3ede-424e-94bc-a91561e6f320")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CRIMINAL_CONVICTIONS")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Fraud"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Within the past five years, has the economic operator itself or any person who is a member of its administrative, management or supervisory body or has powers of representation, decision or control therein been the subject of a conviction by final judgment for fraud within the meaning of Article 1 of the Convention on the protection of the European Communities'' financial interests?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(1)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "f8da1acf-af6e-4433-9342-10b246281207"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes indicate: a) Date of conviction; b) Reason; c) Who has been convicted; d) Length of the period of exclusion."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "679be0c0-5ef7-4edb-b600-f4e751e9b238"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "f954cb48-fd3a-46b6-93b4-dbd98ddd8ab8"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "03. should contain the 'Terrorist offences or offences linked to terrorist activities' criterion"() {
//        given:
//        def espd = new EspdDocument(terroristOffences: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 3
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "d486fb70-86b3-4e75-97f2-0d71b5697c7d")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CRIMINAL_CONVICTIONS")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Terrorist offences or offences linked to terrorist activities"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Within the past five years, has the economic operator itself or any person who is a member of its administrative, management or supervisory body or has powers of representation, decision or control therein been the subject of a conviction by final judgment for terrorist offences or offences linked to terrorist activities, as defined in Articles 1 and 3 of Council Framework Decision 2002/475/JHA respectively, or inciting or aiding or abetting or attempting to commit an offence, as referred to in Article 4 of that Framework Decision?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(1)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "6ce51802-2dfd-4a43-aaf8-b2fdaada0466"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes indicate: a) Date of conviction; b) Reason; c) Who has been convicted; d) Length of the period of exclusion."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "1134da12-b3d2-45ad-80b1-37d635e1d6e0"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "02615e92-f733-4a62-a6ee-08c324abb8d1"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "04. should contain the 'Money laundering or terrorist financing' criterion"() {
//        given:
//        def espd = new EspdDocument(moneyLaundering: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 4
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "47112079-6fec-47a3-988f-e561668c3aef")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CRIMINAL_CONVICTIONS")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Money laundering or terrorist financing"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Within the past five years, has the economic operator itself or any person who is a member of its administrative, management or supervisory body or has powers of representation, decision or control therein been the subject of a conviction by final judgment for Money laundering or terrorist financing, as defined in Article 1 of Directive 2005/60/EC of the European Parliament and of the Council?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(1)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "20238d99-4fbb-48b0-aba0-dd06489d14ef"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes indicate: a) Date of conviction; b) Reason; c) Who has been convicted; d) Length of the period of exclusion."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "9f0d8862-02fe-45ae-9e39-ebb235cfbaf1"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "25f57c43-f472-4532-a99e-8950052f276a"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "05. should contain the 'Child labour and other forms of trafficking in human beings' criterion"() {
//        given:
//        def espd = new EspdDocument(childLabour: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 5
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "d789d01a-fe03-4ccd-9898-73f9cfa080d1")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CRIMINAL_CONVICTIONS")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Child labour and other forms of trafficking in human beings"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Within the past five years, has the economic operator itself or any person who is a member of its administrative, management or supervisory body or has powers of representation, decision or control therein been the subject of a conviction by final judgment for child labour and other forms of trafficking in human beings as defined in Article 2 of Directive 2011/36/EU of the European Parliament and of the Council?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(1)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "29049af7-65cc-4314-851b-afa06cac6108"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes indicate: a) Date of conviction; b) Reason; c) Who has been convicted; d) Length of the period of exclusion."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "790374f1-9c94-4267-93bb-fcaba9ca6a7d"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "e8b2a4e1-38a0-494d-89c6-484c0f0dc983"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "06. should contain the 'Payment of taxes' criterion"() {
//        given:
//        def espd = new EspdDocument(paymentTaxes: new Taxes(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 6
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "b61bbeb7-690e-4a40-bc68-d6d4ecfaa3d4")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.PAYMENT_OF_TAXES")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Payment of taxes"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Has it been established by a judicial or administrative decision having final and binding effect in accordance with the legal provisions in the country in which you are established or in the Member State of the contracting authority, that your organisation is in breach of obligations related to the payment of tax contributions?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(2)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 4
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "d30637e4-f7ec-43da-962d-b1d48fd161e7"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please indicate the country or Member State concerned and the amount concerned."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "2d39df06-2c5b-40bd-b5d1-86d377384baa"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "Has this breach of obligations been established through judicial or administrative decision?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "fe04e6fe-af83-4896-ad0c-7983e5138aea"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[3].CriterionRequirementID.text() == "2b7e912b-7343-493d-99e0-5483e944a7e0"
//        resp.Criterion[idx].CriterionRequirement[3].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "07. should contain the 'Payment of social security contributions' criterion"() {
//        given:
//        def espd = new EspdDocument(paymentSocialSecurity: new Taxes(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 7
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "7d85e333-bbab-49c0-be8d-c36d71a72f5e")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.PAYMENT_OF_SOCIAL_SECURITY")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Payment of social security contributions"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Has it been established by a judicial or administrative decision having final and binding effect in accordance with the legal provisions in the country in which you are established or in the Member State of the contracting authority, that your organisation is in breach of obligations related to the payment of social security contributions?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(2)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 4
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "82133444-f458-4100-878c-f43e02efb6a6"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please indicate the country or Member State concerned and the amount concerned."
//
//        // TODO test CriterionRequirement[1]
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "1efc023b-0cd3-49d1-b646-0c9ba5b9b888"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[3].CriterionRequirementID.text() == "ac9c530a-07b8-4a9d-b82b-c40ad5373eec"
//        resp.Criterion[idx].CriterionRequirement[3].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "08. should contain the 'Breaching of obligations in the fields of environmental, social and labour law' criterion"() {
//        given:
//        def espd = new EspdDocument(breachingObligations: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 8
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "a80ddb62-d25b-4e4e-ae22-3968460dc0a9")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.ENVIRONMENTAL")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Breaching of obligations in the fields of environmental, social and labour law"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Has the economic operator, to its knowledge, breached its obligations in the fields of environmental, social and labour law? As referred to for the purposes of this procurement in national law, in the relevant notice or the procurement documents or in Article 18(2) of Directive 2004/18/EU?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 2
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "20000170-bc67-4536-9420-01ea0f90db7a"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//
//
//        // TODO test CriterionRequirement[1] id
////        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "1efc023b-0cd3-49d1-b646-0c9ba5b9b888"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//    }
//
//    def "09. should contain the 'Bankrupt, the subject of insolvency or winding-up' criterion"() {
//        given:
//        def espd = new EspdDocument(bankruptcy: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 9
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "d3732c09-7d62-4edc-a172-241da6636e7c")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.BANKRUPTCY_INSOLVENCY")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Bankrupt, the subject of insolvency or winding-up"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Is the economic operator in any of the following situations: Bankrupt, or the subject of insolvency or winding-up proceedings, or in an arrangement with creditors, or in any analogous situation arising from a similar procedure under national laws and regulations. See national law, the relevant notice or the procurement documents, or that its assets are being administered by a liquidator or by the court, or that its business activities are suspended?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "d2e52b5d-2e34-4166-9d40-21470af8eb7c"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "638e1e4b-863b-4768-b718-f6dde9601983"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, indicate reasons for being nevertheless to perform the contract."
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "44387dd3-5b75-43f6-8562-9615bb913cde"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "10. should contain the 'Guilty of grave professional misconduct' criterion"() {
//        given:
//        def espd = new EspdDocument(guiltyGrave: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 10
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "396f288a-e267-4c20-851a-ed4f7498f137")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.MISCONDUCT")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Guilty of grave professional misconduct"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Is the economic operator  guilty of grave professional misconduct? Where applicable, see definitions in national law, the relevant notice or the procurement documents."
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 2
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "b9dfe216-7c6d-4ca5-b1a4-793015399eb1"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "ff6f6761-2d7f-47f6-ade3-757639cb7a5d"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//    }
//
//    def "11. should contain the 'Agreements with other economic operators aimed at distorting competition' criterion"() {
//        given:
//        def espd = new EspdDocument(agreementsEo: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 11
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "68918c7a-f5bc-4a1a-a62f-ad8983600d48")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.MISCONDUCT")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Agreements with other economic operators aimed at distorting competition"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Has the economic operator entered into agreements with other economic operators aimed at distorting competition?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 2
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "139c0bc8-4341-4328-94c3-b5182e468b6e"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "05c4f8c9-2bed-43ef-847b-0e9bb67b66dd"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//    }
//
//    def "12. should contain the 'Conflict of interest due to its participation in the procurement procedure' criterion"() {
//        given:
//        def espd = new EspdDocument(conflictInterest: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 12
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "b1b5ac18-f393-4280-9659-1367943c1a2e")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CONFLICT_OF_INTEREST")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Conflict of interest due to its participation in the procurement procedure"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Is the economic operator aware of any conflict of interest, as indicated in national law, the relevant notice or the procurement documents due to its participation in the procurement procedure?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 3
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "e1cc66aa-1406-4719-98e5-ab0ca08e5092"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "e1f3c3a0-0b30-48ce-8a14-bb8e8ee78808"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementID.text() == "a7631f4e-fd36-4184-93dc-a5367f843ba5"
//        resp.Criterion[idx].CriterionRequirement[2].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "13. should contain the 'Direct or indirect involvement in the preparation of this procurement procedure' criterion"() {
//        given:
//        def espd = new EspdDocument(involvementPreparationProcurement: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 13
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "61874050-5130-4f1c-a174-720939c7b483")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CONFLICT_OF_INTEREST")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Direct or indirect involvement in the preparation of this procurement procedure"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Has the economic operator or an undertaking related to it advised the contracting authority or contracting entity or otherwise been involved in the preparation of the procurement procedure?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 1
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "d51b51c0-44d5-44a4-85df-736dec6f351e"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//    }
//
//    def "14. should contain the 'Early termination, damages or other comparable sanctions' criterion"() {
//        given:
//        def espd = new EspdDocument(earlyTermination: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 14
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "3293e92b-7f3e-42f1-bee6-a7641bb04251")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CONFLICT_OF_INTEREST")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Early termination, damages or other comparable sanctions"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Has the economic operator experienced that a prior public contract, a prior contract with a contracting entity or a prior concession contract was terminated early, or that damages or other comparable sanctions were imposed in connection with that prior contract?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 2
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "d1104636-f3c3-48f5-95eb-2db9c6d9e7c2"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "80d631f0-d6cd-47cc-874c-e8c4706d5cfb"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If yes, have you taken measures to demonstrate your reliability (\"Self-Cleaning\")?"
//    }
//
//    def "15. should contain the 'Guilty of misinterpretation, withheld information, [...]' criterion"() {
//        given:
//        def espd = new EspdDocument(guiltyMisinterpretation: new BreachOfObligations(exists: true))
//
//        when:
//        def resp = parseRequestXml(espd)
//        def idx = 15
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "696a75b2-6107-428f-8b74-82affb67e184")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.CONFLICT_OF_INTEREST")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Guilty of misinterpretation, withheld information, [...]"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Can the economic operator confirm that it has not been guilty of serious misrepresentation in supplying the information required for the verification of the absence of grounds for exclusion or the fulfilment of the selection criteria, it has not withheld such information, it has been able, without delay, to submit the supporting documents required by a contracting authority or contracting entity, and it has not undertaken to unduly influence the decision making process of the contracting authority or contracting entity, to obtain confidential information that may confer upon it undue advantages in the procurement procedure or to negligently provide misleading information that may have a material influence on decisions concerning exclusion, selection or award?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//
//        then: "CriterionRequirement"
//        resp.Criterion[idx].CriterionRequirement.size() == 2
//
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementID.text() == "6c44b54c-f598-4ad9-bc0f-4133d55bd7c9"
//        resp.Criterion[idx].CriterionRequirement[0].CriterionRequirementDescription.text() == "If yes, please describe them."
//
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementID.text() == "d9502d1f-6447-47e0-9cc0-601b7cded065"
//        resp.Criterion[idx].CriterionRequirement[1].CriterionRequirementDescription.text() == "If the relevant documentation is available electronically, please indicate where to obtain the evidences: web address, issuing authority or body, precise reference of the documentation."
//    }
//
//    def "16. should contain the 'Purely national exclusion grounds' criterion"() {
////        given:
////        def espd = new EspdDocument(breachingObligations: new CriminalConvictions(exists: true))
//
//        when:
//        def resp = parseRequestXml()
//        def idx = 16
//
//        then: "CriterionID element"
//        checkCriterionId(resp, idx, "df81025e-6aa0-4665-8807-ee317e5f928e")
//
//        then: "CriterionTypeCode element"
//        checkCriterionTypeCode(resp, idx, "EXCLUSION.OTHER")
//
//        then: "CriterionName element"
//        resp.Criterion[idx].Name.text() == "Purely national exclusion grounds"
//
//        then: "CriterionDescription element"
//        resp.Criterion[idx].Description.text() == "Do the purely national grounds of exclusion, which are specified in the relevant notice or in the procurement documents, apply?"
//
//        then: "CriterionLegislationReference element"
//        checkLegislationReference(resp, idx, "57(4)")
//    }

}