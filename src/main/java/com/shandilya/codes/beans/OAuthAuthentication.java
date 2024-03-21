package com.shandilya.codes.beans;

import org.springframework.stereotype.Component;

@Component
public class OAuthAuthentication implements AuthenticationService{
    public OAuthAuthentication() {
        System.out.println("Calling OAuth authentication service!");
    }

    @Override
    public void auth() {
        System.out.println("Authenticated using OAuth");
    }
}