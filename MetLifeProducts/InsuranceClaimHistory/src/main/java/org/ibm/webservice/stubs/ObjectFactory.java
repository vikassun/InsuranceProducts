//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.30 at 11:16:47 AM IST 
//


package org.ibm.webservice.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ibm.webservice.stubs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _User_QNAME = new QName("http://claims.webservices.ibm.org", "User");
    private final static QName _Claims_QNAME = new QName("http://claims.webservices.ibm.org", "Claims");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ibm.webservice.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Claims }
     * 
     */
    public Claims createClaims() {
        return new Claims();
    }

    /**
     * Create an instance of {@link ClaimsRequest }
     * 
     */
    public ClaimsRequest createClaimsRequest() {
        return new ClaimsRequest();
    }

    /**
     * Create an instance of {@link ClaimDetailsResponse }
     * 
     */
    public ClaimDetailsResponse createClaimDetailsResponse() {
        return new ClaimDetailsResponse();
    }

    /**
     * Create an instance of {@link ClaimsList }
     * 
     */
    public ClaimsList createClaimsList() {
        return new ClaimsList();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UserDetailsRequest }
     * 
     */
    public UserDetailsRequest createUserDetailsRequest() {
        return new UserDetailsRequest();
    }

    /**
     * Create an instance of {@link UserDetailsResponse }
     * 
     */
    public UserDetailsResponse createUserDetailsResponse() {
        return new UserDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://claims.webservices.ibm.org", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Claims }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://claims.webservices.ibm.org", name = "Claims")
    public JAXBElement<Claims> createClaims(Claims value) {
        return new JAXBElement<Claims>(_Claims_QNAME, Claims.class, null, value);
    }

}
