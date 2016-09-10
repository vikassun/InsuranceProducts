
package com.ibm.insurance.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Prod" type="{http://product.insurance.ibm.com}Prod"/>
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
    "prod"
})
@XmlRootElement(name = "ProductResponse")
public class ProductResponse {

    @XmlElement(name = "Prod", required = true)
    protected Prod prod;

    /**
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link Prod }
     *     
     */
    public Prod getProd() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prod }
     *     
     */
    public void setProd(Prod value) {
        this.prod = value;
    }

}
