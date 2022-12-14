package com.helloworld.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-10-07T14:51:24.694+02:00
 * Generated source version: 3.5.3
 *
 */
@WebService(targetNamespace = "http://www.helloworld.com/Service/", name = "HelloPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HelloPortType {

    @WebMethod(operationName = "Hello", action = "https://www.helloworld.com/Service/Hello")
    @WebResult(name = "HelloResponse", targetNamespace = "http://www.helloworld.com/Service/", partName = "helloOutputPart")
    public java.lang.String hello(

        @WebParam(partName = "helloInputPart", name = "HelloRequest", targetNamespace = "http://www.helloworld.com/Service/")
        java.lang.String helloInputPart
    );

    @WebMethod(operationName = "Person", action = "https://www.helloworld.com/Service/Person")
    @WebResult(name = "PersonResponse", targetNamespace = "http://www.helloworld.com/Service/", partName = "personOutputPart")
    public PersonResponseType person(

        @WebParam(partName = "personInputPart", name = "PersonRequest", targetNamespace = "http://www.helloworld.com/Service/")
        PersonRequestType personInputPart
    );
}
