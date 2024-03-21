package com.shandilya.codes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Login {
    private AuthenticationService authenticationService;
    /*@Autowired
    @Qualifier("vanillaAuthentication")
    private AuthenticationService authenticationService;*/

    @Autowired
    public Login(@Qualifier("vanillaAuthentication") AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public void message() {
        authenticationService.auth();
    }
}