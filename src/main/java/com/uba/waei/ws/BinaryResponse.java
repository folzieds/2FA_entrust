
package com.uba.waei.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for binaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="binaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binaryResponse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="errorResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSuccessful" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binaryResponse", propOrder = {
    "binaryResponse",
    "errorResponseCode",
    "errorResponseMessage",
    "isSuccessful",
    "response"
})
public class BinaryResponse {

    protected byte[] binaryResponse;
    protected String errorResponseCode;
    protected String errorResponseMessage;
    protected String isSuccessful;
    protected String response;

    /**
     * Gets the value of the binaryResponse property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryResponse() {
        return binaryResponse;
    }

    /**
     * Sets the value of the binaryResponse property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryResponse(byte[] value) {
        this.binaryResponse = value;
    }

    /**
     * Gets the value of the errorResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorResponseCode() {
        return errorResponseCode;
    }

    /**
     * Sets the value of the errorResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorResponseCode(String value) {
        this.errorResponseCode = value;
    }

    /**
     * Gets the value of the errorResponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorResponseMessage() {
        return errorResponseMessage;
    }

    /**
     * Sets the value of the errorResponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorResponseMessage(String value) {
        this.errorResponseMessage = value;
    }

    /**
     * Gets the value of the isSuccessful property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSuccessful() {
        return isSuccessful;
    }

    /**
     * Sets the value of the isSuccessful property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSuccessful(String value) {
        this.isSuccessful = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

}
