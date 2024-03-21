package com.shandilya.codes.beans;

import org.springframework.stereotype.Component;

//@Component
public class Address {
    private final String type = "Default Address";

    public Address() {
        System.out.println("Address bean getting created!");
    }

    public String getType() {
        return type;
    }
}