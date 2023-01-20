package com.project.exception;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPFault;

public class TrainNotFoundException extends SOAPFaultException {

    public TrainNotFoundException(SOAPFault fault) {
        super(fault);
    }

    public static TrainNotFoundException create(String message) {
        try {
            SOAPFault fault = SOAPFactory.newInstance().createFault();
            fault.setFaultString(message);
            fault.setFaultCode(new QName(SOAPConstants.URI_NS_SOAP_1_2_ENVELOPE, "Client"));
            return new TrainNotFoundException(fault);
        } catch (SOAPException e) {
            throw new RuntimeException(e);
        }
    }
}
