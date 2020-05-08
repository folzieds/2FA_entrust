package com.phos.entrust.controller;

import com.phos.entrust.services.TwoFactorAuthenticationService;
import com.uba.waei.ws.AuthenticateTokenRequest;
import com.uba.waei.ws.AuthenticateTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoFactorAuthenticationController {

    @Autowired
    private TwoFactorAuthenticationService twoFactorAuthenticationService;

    @PostMapping("/authenticate_token")
    public AuthenticateTokenResponse authenticateToken(@RequestBody AuthenticateTokenRequest request){
        return twoFactorAuthenticationService.authenticate(request);
    }
}
