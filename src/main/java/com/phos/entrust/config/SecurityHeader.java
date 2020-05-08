package com.phos.entrust.config;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class SecurityHeader implements WebServiceMessageCallback {

    private Authentication authentication;

    public SecurityHeader(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException, TransformerException {
        SoapHeader soapHeader = ((SoapMessage)webServiceMessage).getSoapHeader();

        try{
            JAXBContext context = JAXBContext.newInstance(Authentication.class);

            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(authentication, soapHeader.getResult());
        }
        catch (JAXBException e){
            throw new IOException("Error while marshalling authentication");
        }
    }
}
