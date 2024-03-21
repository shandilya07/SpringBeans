package com.shandilya.codes.beans;

import org.springframework.stereotype.Component;

@Component
public class VanillaAuthentication implements AuthenticationService {
    public VanillaAuthentication() {
        System.out.println("Calling Vanilla Auth Service!");
    }

    @Override
    public void auth() {
        System.out.println("Authenticated using Vanilla Authentication!");
    }
}