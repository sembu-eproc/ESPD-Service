//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonsignaturecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.signatureaggregatecomponents_2.SignatureInformationType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for UBLDocumentSignaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UBLDocumentSignaturesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2}SignatureInformation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLDocumentSignaturesType", propOrder = {
    "signatureInformation"
})
public class UBLDocumentSignaturesType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SignatureInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2", required = true)
    protected List<SignatureInformationType> signatureInformation;

    /**
     * Gets the value of the signatureInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureInformationType }
     * 
     * 
     */
    public List<SignatureInformationType> getSignatureInformation() {
        if (signatureInformation == null) {
            signatureInformation = new ArrayList<SignatureInformationType>();
        }
        return this.signatureInformation;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<SignatureInformationType> theSignatureInformation;
            theSignatureInformation = (((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty()))?this.getSignatureInformation():null);
            strategy.appendField(locator, this, "signatureInformation", buffer, theSignatureInformation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UBLDocumentSignaturesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UBLDocumentSignaturesType that = ((UBLDocumentSignaturesType) object);
        {
            List<SignatureInformationType> lhsSignatureInformation;
            lhsSignatureInformation = (((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty()))?this.getSignatureInformation():null);
            List<SignatureInformationType> rhsSignatureInformation;
            rhsSignatureInformation = (((that.signatureInformation!= null)&&(!that.signatureInformation.isEmpty()))?that.getSignatureInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatureInformation", lhsSignatureInformation), LocatorUtils.property(thatLocator, "signatureInformation", rhsSignatureInformation), lhsSignatureInformation, rhsSignatureInformation)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<SignatureInformationType> theSignatureInformation;
            theSignatureInformation = (((this.signatureInformation!= null)&&(!this.signatureInformation.isEmpty()))?this.getSignatureInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatureInformation", theSignatureInformation), currentHashCode, theSignatureInformation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}