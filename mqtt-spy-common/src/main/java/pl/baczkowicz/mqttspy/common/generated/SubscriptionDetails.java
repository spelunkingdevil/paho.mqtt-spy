//
// Copyright (c) 2015 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SubscriptionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="topic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="qos" type="{http://baczkowicz.pl/mqtt-spy/common}qos" default="0" /&gt;
 *       &lt;attribute name="scriptFile" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
*/
@SuppressWarnings("all")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionDetails")
public class SubscriptionDetails implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "topic", required = true)
    protected String topic;
    @XmlAttribute(name = "qos")
    protected Integer qos;
    @XmlAttribute(name = "scriptFile")
    protected String scriptFile;

    /**
     * Default no-arg constructor
     * 
     */
    public SubscriptionDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubscriptionDetails(final String topic, final Integer qos, final String scriptFile) {
        this.topic = topic;
        this.qos = qos;
        this.scriptFile = scriptFile;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the qos property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getQos() {
        if (qos == null) {
            return  0;
        } else {
            return qos;
        }
    }

    /**
     * Sets the value of the qos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQos(Integer value) {
        this.qos = value;
    }

    /**
     * Gets the value of the scriptFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptFile() {
        return scriptFile;
    }

    /**
     * Sets the value of the scriptFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptFile(String value) {
        this.scriptFile = value;
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
            String theTopic;
            theTopic = this.getTopic();
            strategy.appendField(locator, this, "topic", buffer, theTopic);
        }
        {
            int theQos;
            theQos = ((this.qos!= null)?this.getQos(): 0);
            strategy.appendField(locator, this, "qos", buffer, theQos);
        }
        {
            String theScriptFile;
            theScriptFile = this.getScriptFile();
            strategy.appendField(locator, this, "scriptFile", buffer, theScriptFile);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SubscriptionDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SubscriptionDetails that = ((SubscriptionDetails) object);
        {
            String lhsTopic;
            lhsTopic = this.getTopic();
            String rhsTopic;
            rhsTopic = that.getTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                return false;
            }
        }
        {
            int lhsQos;
            lhsQos = ((this.qos!= null)?this.getQos(): 0);
            int rhsQos;
            rhsQos = ((that.qos!= null)?that.getQos(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qos", lhsQos), LocatorUtils.property(thatLocator, "qos", rhsQos), lhsQos, rhsQos)) {
                return false;
            }
        }
        {
            String lhsScriptFile;
            lhsScriptFile = this.getScriptFile();
            String rhsScriptFile;
            rhsScriptFile = that.getScriptFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scriptFile", lhsScriptFile), LocatorUtils.property(thatLocator, "scriptFile", rhsScriptFile), lhsScriptFile, rhsScriptFile)) {
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
            String theTopic;
            theTopic = this.getTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
        }
        {
            int theQos;
            theQos = ((this.qos!= null)?this.getQos(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qos", theQos), currentHashCode, theQos);
        }
        {
            String theScriptFile;
            theScriptFile = this.getScriptFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scriptFile", theScriptFile), currentHashCode, theScriptFile);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof SubscriptionDetails) {
            final SubscriptionDetails copy = ((SubscriptionDetails) draftCopy);
            if (this.topic!= null) {
                String sourceTopic;
                sourceTopic = this.getTopic();
                String copyTopic = ((String) strategy.copy(LocatorUtils.property(locator, "topic", sourceTopic), sourceTopic));
                copy.setTopic(copyTopic);
            } else {
                copy.topic = null;
            }
            if (this.qos!= null) {
                int sourceQos;
                sourceQos = ((this.qos!= null)?this.getQos(): 0);
                int copyQos = strategy.copy(LocatorUtils.property(locator, "qos", sourceQos), sourceQos);
                copy.setQos(copyQos);
            } else {
                copy.qos = null;
            }
            if (this.scriptFile!= null) {
                String sourceScriptFile;
                sourceScriptFile = this.getScriptFile();
                String copyScriptFile = ((String) strategy.copy(LocatorUtils.property(locator, "scriptFile", sourceScriptFile), sourceScriptFile));
                copy.setScriptFile(copyScriptFile);
            } else {
                copy.scriptFile = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SubscriptionDetails();
    }

}