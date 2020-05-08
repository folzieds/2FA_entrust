
package com.uba.waei.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAuthenticationSecreet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAuthenticationSecreet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parequest" type="{http://ws.waei.uba.com/}paRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAuthenticationSecreet", propOrder = {
    "parequest"
})
public class CreateAuthenticationSecreet {

    protected PaRequest parequest;

    /**
     * Gets the value of the parequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaRequest }
     *     
     */
    public PaRequest getParequest() {
        return parequest;
    }

    /**
     * Sets the value of the parequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaRequest }
     *     
     */
    public void setParequest(PaRequest value) {
        this.parequest = value;
    }

}
