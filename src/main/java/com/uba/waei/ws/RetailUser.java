
package com.uba.waei.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retailUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retailUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.waei.uba.com/}user">
 *       &lt;sequence>
 *         &lt;element name="contactList" type="{http://ws.waei.uba.com/}userContactDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retailUser", propOrder = {
    "contactList"
})
public class RetailUser
    extends User
{

    @XmlElement(nillable = true)
    protected List<UserContactDetails> contactList;

    /**
     * Gets the value of the contactList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserContactDetails }
     * 
     * 
     */
    public List<UserContactDetails> getContactList() {
        if (contactList == null) {
            contactList = new ArrayList<UserContactDetails>();
        }
        return this.contactList;
    }

}
