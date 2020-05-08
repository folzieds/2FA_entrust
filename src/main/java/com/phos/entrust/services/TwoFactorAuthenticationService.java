package com.phos.entrust.services;

import com.phos.entrust.config.Authentication;
import com.phos.entrust.config.SecurityHeader;
import com.uba.waei.ws.AuthenticateTokenRequest;
import com.uba.waei.ws.AuthenticateTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class TwoFactorAuthenticationService {

    @Autowired
    private Jaxb2Marshaller marshaller;

    @Value("${uba.entrust.url:http://172.20.236.2:7808/entrust3/service?wsdl}")
    private String entrustUrl;

    @Value("${uba.client.entrust.username:GUPAY}")
    private String username;
    @Value("${uba.client.entrust.secret:waterfall}")
    private String password;
    @Value("${uba.client.entrust.authenticationType:Preemptive}")
    private String authenticationType;

    private WebServiceTemplate template;

    public AuthenticateTokenResponse authenticate(AuthenticateTokenRequest request){
        template = new WebServiceTemplate(marshaller);

        AuthenticateTokenResponse response = (AuthenticateTokenResponse) template.marshalSendAndReceive(entrustUrl,request,
                new SecurityHeader(new Authentication(username,password,authenticationType)));

        return response;
    }


}
