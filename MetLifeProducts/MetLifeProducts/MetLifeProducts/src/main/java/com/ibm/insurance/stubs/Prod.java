
package com.ibm.insurance.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Prod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Prod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="product-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="premium" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prod", propOrder = {
    "productId",
    "productName",
    "productDescription",
    "premium",
    "status"
})
public class Prod {

    @XmlElement(name = "product_id")
    protected int productId;
    @XmlElement(name = "product-name", required = true)
    protected String productName;
    @XmlElement(name = "product_description", required = true)
    protected String productDescription;
    protected int premium;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the productId property.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     */
    public int getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     */
    public void setPremium(int value) {
        this.premium = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
