
package com.helloworld.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.helloworld.service package. 
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

    private final static QName _HelloRequest_QNAME = new QName("http://www.helloworld.com/Service/", "HelloRequest");
    private final static QName _HelloResponse_QNAME = new QName("http://www.helloworld.com/Service/", "HelloResponse");
    private final static QName _PersonRequest_QNAME = new QName("http://www.helloworld.com/Service/", "PersonRequest");
    private final static QName _PersonResponse_QNAME = new QName("http://www.helloworld.com/Service/", "PersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.helloworld.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonRequestType }
     * 
     */
    public PersonRequestType createPersonRequestType() {
        return new PersonRequestType();
    }

    /**
     * Create an instance of {@link PersonResponseType }
     * 
     */
    public PersonResponseType createPersonResponseType() {
        return new PersonResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.helloworld.com/Service/", name = "HelloRequest")
    public JAXBElement<String> createHelloRequest(String value) {
        return new JAXBElement<String>(_HelloRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.helloworld.com/Service/", name = "HelloResponse")
    public JAXBElement<String> createHelloResponse(String value) {
        return new JAXBElement<String>(_HelloResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.helloworld.com/Service/", name = "PersonRequest")
    public JAXBElement<PersonRequestType> createPersonRequest(PersonRequestType value) {
        return new JAXBElement<PersonRequestType>(_PersonRequest_QNAME, PersonRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.helloworld.com/Service/", name = "PersonResponse")
    public JAXBElement<PersonResponseType> createPersonResponse(PersonResponseType value) {
        return new JAXBElement<PersonResponseType>(_PersonResponse_QNAME, PersonResponseType.class, null, value);
    }

}
