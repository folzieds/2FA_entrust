
package com.uba.waei.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOrCreateuserContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOrCreateuserContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://ws.waei.uba.com/}userContactDetailList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOrCreateuserContactInfo", propOrder = {
    "request"
})
public class UpdateOrCreateuserContactInfo {

    protected UserContactDetailList request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link UserContactDetailList }
     *     
     */
    public UserContactDetailList getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserContactDetailList }
     *     
     */
    public void setRequest(UserContactDetailList value) {
        this.request = value;
    }

}
