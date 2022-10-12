package com.helloworld.service;

import javax.jws.WebService;

/**
 * The implementation of the CalculatorService
 */
@WebService(serviceName = "HelloService",  portName = "HelloPort", name = "Hello", endpointInterface = "com.helloworld.service.HelloPortType", targetNamespace = "http://www.helloworld.com/Service/")
public class HelloPortTypeServiceImpl implements HelloPortType {
    @Override
    public String hello(String helloInputPart) {
        return "Hello " + helloInputPart;
    }

    @Override
    public PersonResponseType person(PersonRequestType personInputPart) {
        PersonResponseType response = new PersonResponseType();
        response.setGreeting("Hello");
        response.setFirstName(personInputPart.getFirstName());
        response.setLastName(personInputPart.getLastName());
        return response;
    }
}
