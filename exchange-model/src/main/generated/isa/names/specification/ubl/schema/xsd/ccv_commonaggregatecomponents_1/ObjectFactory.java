//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package isa.names.specification.ubl.schema.xsd.ccv_commonaggregatecomponents_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import isa.names.specification.ubl.schema.xsd.cev_commonaggregatecomponents_1.EvidenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the isa.names.specification.ubl.schema.xsd.ccv_commonaggregatecomponents_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContextualDependency_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "ContextualDependency");
    private final static QName _Criterion_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "Criterion");
    private final static QName _CriterionFulfillmentAffectedParty_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "CriterionFulfillmentAffectedParty");
    private final static QName _CriterionFulfillmentPeriod_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "CriterionFulfillmentPeriod");
    private final static QName _CriterionFulfillmentEventLocation_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "CriterionFulfillmentEventLocation");
    private final static QName _CriterionRegulationReference_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "CriterionRegulationReference");
    private final static QName _CriterionRequirement_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "CriterionRequirement");
    private final static QName _CriterionResponse_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "CriterionResponse");
    private final static QName _EvidenceDocumentReference_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "EvidenceDocumentReference");
    private final static QName _EvidenceIssuerParty_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "EvidenceIssuerParty");
    private final static QName _RequiredTypeOfEvidence_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "RequiredTypeOfEvidence");
    private final static QName _ProposedCriterionEvidence_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", "ProposedCriterionEvidence");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: isa.names.specification.ubl.schema.xsd.ccv_commonaggregatecomponents_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CriterionType }
     * 
     */
    public CriterionType createCriterionType() {
        return new CriterionType();
    }

    /**
     * Create an instance of {@link ContextualDependencyType }
     * 
     */
    public ContextualDependencyType createContextualDependencyType() {
        return new ContextualDependencyType();
    }

    /**
     * Create an instance of {@link RegulationType }
     * 
     */
    public RegulationType createRegulationType() {
        return new RegulationType();
    }

    /**
     * Create an instance of {@link CriterionRequirementType }
     * 
     */
    public CriterionRequirementType createCriterionRequirementType() {
        return new CriterionRequirementType();
    }

    /**
     * Create an instance of {@link CriterionResponseType }
     * 
     */
    public CriterionResponseType createCriterionResponseType() {
        return new CriterionResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextualDependencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "ContextualDependency")
    public JAXBElement<ContextualDependencyType> createContextualDependency(ContextualDependencyType value) {
        return new JAXBElement<ContextualDependencyType>(_ContextualDependency_QNAME, ContextualDependencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "Criterion")
    public JAXBElement<CriterionType> createCriterion(CriterionType value) {
        return new JAXBElement<CriterionType>(_Criterion_QNAME, CriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "CriterionFulfillmentAffectedParty")
    public JAXBElement<PartyType> createCriterionFulfillmentAffectedParty(PartyType value) {
        return new JAXBElement<PartyType>(_CriterionFulfillmentAffectedParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "CriterionFulfillmentPeriod")
    public JAXBElement<PeriodType> createCriterionFulfillmentPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_CriterionFulfillmentPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "CriterionFulfillmentEventLocation")
    public JAXBElement<LocationType> createCriterionFulfillmentEventLocation(LocationType value) {
        return new JAXBElement<LocationType>(_CriterionFulfillmentEventLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "CriterionRegulationReference")
    public JAXBElement<RegulationType> createCriterionRegulationReference(RegulationType value) {
        return new JAXBElement<RegulationType>(_CriterionRegulationReference_QNAME, RegulationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionRequirementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "CriterionRequirement")
    public JAXBElement<CriterionRequirementType> createCriterionRequirement(CriterionRequirementType value) {
        return new JAXBElement<CriterionRequirementType>(_CriterionRequirement_QNAME, CriterionRequirementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriterionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "CriterionResponse")
    public JAXBElement<CriterionResponseType> createCriterionResponse(CriterionResponseType value) {
        return new JAXBElement<CriterionResponseType>(_CriterionResponse_QNAME, CriterionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "EvidenceDocumentReference")
    public JAXBElement<DocumentReferenceType> createEvidenceDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_EvidenceDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "EvidenceIssuerParty")
    public JAXBElement<PartyType> createEvidenceIssuerParty(PartyType value) {
        return new JAXBElement<PartyType>(_EvidenceIssuerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "RequiredTypeOfEvidence")
    public JAXBElement<EvidenceType> createRequiredTypeOfEvidence(EvidenceType value) {
        return new JAXBElement<EvidenceType>(_RequiredTypeOfEvidence_QNAME, EvidenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CCV-CommonAggregateComponents-1", name = "ProposedCriterionEvidence")
    public JAXBElement<EvidenceType> createProposedCriterionEvidence(EvidenceType value) {
        return new JAXBElement<EvidenceType>(_ProposedCriterionEvidence_QNAME, EvidenceType.class, null, value);
    }

}