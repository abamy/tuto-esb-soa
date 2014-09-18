
package org.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="expectedShipDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderID",
    "expectedShipDate"
})
@XmlRootElement(name = "OrderConfirmationType")
public class OrderConfirmationType {

    @XmlSchemaType(name = "unsignedInt")
    protected Long orderID;
    protected String expectedShipDate;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderID(Long value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the expectedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedShipDate() {
        return expectedShipDate;
    }

    /**
     * Sets the value of the expectedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedShipDate(String value) {
        this.expectedShipDate = value;
    }

}
