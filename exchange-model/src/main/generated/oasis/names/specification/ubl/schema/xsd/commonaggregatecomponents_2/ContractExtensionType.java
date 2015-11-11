//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumNumberNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumNumberNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OptionsDescriptionType;
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
 * <p>Java class for ContractExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OptionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OptionValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Renewal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractExtensionType", propOrder = {
    "optionsDescription",
    "minimumNumberNumeric",
    "maximumNumberNumeric",
    "optionValidityPeriod",
    "renewal"
})
public class ContractExtensionType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "OptionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<OptionsDescriptionType> optionsDescription;
    @XmlElement(name = "MinimumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumNumberNumericType minimumNumberNumeric;
    @XmlElement(name = "MaximumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumNumberNumericType maximumNumberNumeric;
    @XmlElement(name = "OptionValidityPeriod")
    protected PeriodType optionValidityPeriod;
    @XmlElement(name = "Renewal")
    protected List<RenewalType> renewal;

    /**
     * Gets the value of the optionsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionsDescriptionType }
     * 
     * 
     */
    public List<OptionsDescriptionType> getOptionsDescription() {
        if (optionsDescription == null) {
            optionsDescription = new ArrayList<OptionsDescriptionType>();
        }
        return this.optionsDescription;
    }

    /**
     * Gets the value of the minimumNumberNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumNumberNumericType }
     *     
     */
    public MinimumNumberNumericType getMinimumNumberNumeric() {
        return minimumNumberNumeric;
    }

    /**
     * Sets the value of the minimumNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumNumberNumericType }
     *     
     */
    public void setMinimumNumberNumeric(MinimumNumberNumericType value) {
        this.minimumNumberNumeric = value;
    }

    /**
     * Gets the value of the maximumNumberNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumNumberNumericType }
     *     
     */
    public MaximumNumberNumericType getMaximumNumberNumeric() {
        return maximumNumberNumeric;
    }

    /**
     * Sets the value of the maximumNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumNumberNumericType }
     *     
     */
    public void setMaximumNumberNumeric(MaximumNumberNumericType value) {
        this.maximumNumberNumeric = value;
    }

    /**
     * Gets the value of the optionValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getOptionValidityPeriod() {
        return optionValidityPeriod;
    }

    /**
     * Sets the value of the optionValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setOptionValidityPeriod(PeriodType value) {
        this.optionValidityPeriod = value;
    }

    /**
     * Gets the value of the renewal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renewal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenewal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RenewalType }
     * 
     * 
     */
    public List<RenewalType> getRenewal() {
        if (renewal == null) {
            renewal = new ArrayList<RenewalType>();
        }
        return this.renewal;
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
            List<OptionsDescriptionType> theOptionsDescription;
            theOptionsDescription = (((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty()))?this.getOptionsDescription():null);
            strategy.appendField(locator, this, "optionsDescription", buffer, theOptionsDescription);
        }
        {
            MinimumNumberNumericType theMinimumNumberNumeric;
            theMinimumNumberNumeric = this.getMinimumNumberNumeric();
            strategy.appendField(locator, this, "minimumNumberNumeric", buffer, theMinimumNumberNumeric);
        }
        {
            MaximumNumberNumericType theMaximumNumberNumeric;
            theMaximumNumberNumeric = this.getMaximumNumberNumeric();
            strategy.appendField(locator, this, "maximumNumberNumeric", buffer, theMaximumNumberNumeric);
        }
        {
            PeriodType theOptionValidityPeriod;
            theOptionValidityPeriod = this.getOptionValidityPeriod();
            strategy.appendField(locator, this, "optionValidityPeriod", buffer, theOptionValidityPeriod);
        }
        {
            List<RenewalType> theRenewal;
            theRenewal = (((this.renewal!= null)&&(!this.renewal.isEmpty()))?this.getRenewal():null);
            strategy.appendField(locator, this, "renewal", buffer, theRenewal);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContractExtensionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContractExtensionType that = ((ContractExtensionType) object);
        {
            List<OptionsDescriptionType> lhsOptionsDescription;
            lhsOptionsDescription = (((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty()))?this.getOptionsDescription():null);
            List<OptionsDescriptionType> rhsOptionsDescription;
            rhsOptionsDescription = (((that.optionsDescription!= null)&&(!that.optionsDescription.isEmpty()))?that.getOptionsDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionsDescription", lhsOptionsDescription), LocatorUtils.property(thatLocator, "optionsDescription", rhsOptionsDescription), lhsOptionsDescription, rhsOptionsDescription)) {
                return false;
            }
        }
        {
            MinimumNumberNumericType lhsMinimumNumberNumeric;
            lhsMinimumNumberNumeric = this.getMinimumNumberNumeric();
            MinimumNumberNumericType rhsMinimumNumberNumeric;
            rhsMinimumNumberNumeric = that.getMinimumNumberNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumNumberNumeric", lhsMinimumNumberNumeric), LocatorUtils.property(thatLocator, "minimumNumberNumeric", rhsMinimumNumberNumeric), lhsMinimumNumberNumeric, rhsMinimumNumberNumeric)) {
                return false;
            }
        }
        {
            MaximumNumberNumericType lhsMaximumNumberNumeric;
            lhsMaximumNumberNumeric = this.getMaximumNumberNumeric();
            MaximumNumberNumericType rhsMaximumNumberNumeric;
            rhsMaximumNumberNumeric = that.getMaximumNumberNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumNumberNumeric", lhsMaximumNumberNumeric), LocatorUtils.property(thatLocator, "maximumNumberNumeric", rhsMaximumNumberNumeric), lhsMaximumNumberNumeric, rhsMaximumNumberNumeric)) {
                return false;
            }
        }
        {
            PeriodType lhsOptionValidityPeriod;
            lhsOptionValidityPeriod = this.getOptionValidityPeriod();
            PeriodType rhsOptionValidityPeriod;
            rhsOptionValidityPeriod = that.getOptionValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionValidityPeriod", lhsOptionValidityPeriod), LocatorUtils.property(thatLocator, "optionValidityPeriod", rhsOptionValidityPeriod), lhsOptionValidityPeriod, rhsOptionValidityPeriod)) {
                return false;
            }
        }
        {
            List<RenewalType> lhsRenewal;
            lhsRenewal = (((this.renewal!= null)&&(!this.renewal.isEmpty()))?this.getRenewal():null);
            List<RenewalType> rhsRenewal;
            rhsRenewal = (((that.renewal!= null)&&(!that.renewal.isEmpty()))?that.getRenewal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "renewal", lhsRenewal), LocatorUtils.property(thatLocator, "renewal", rhsRenewal), lhsRenewal, rhsRenewal)) {
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
            List<OptionsDescriptionType> theOptionsDescription;
            theOptionsDescription = (((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty()))?this.getOptionsDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionsDescription", theOptionsDescription), currentHashCode, theOptionsDescription);
        }
        {
            MinimumNumberNumericType theMinimumNumberNumeric;
            theMinimumNumberNumeric = this.getMinimumNumberNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumNumberNumeric", theMinimumNumberNumeric), currentHashCode, theMinimumNumberNumeric);
        }
        {
            MaximumNumberNumericType theMaximumNumberNumeric;
            theMaximumNumberNumeric = this.getMaximumNumberNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumNumberNumeric", theMaximumNumberNumeric), currentHashCode, theMaximumNumberNumeric);
        }
        {
            PeriodType theOptionValidityPeriod;
            theOptionValidityPeriod = this.getOptionValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionValidityPeriod", theOptionValidityPeriod), currentHashCode, theOptionValidityPeriod);
        }
        {
            List<RenewalType> theRenewal;
            theRenewal = (((this.renewal!= null)&&(!this.renewal.isEmpty()))?this.getRenewal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "renewal", theRenewal), currentHashCode, theRenewal);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}