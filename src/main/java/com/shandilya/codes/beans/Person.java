package com.shandilya.codes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    @Autowired(required = false)
    private Address address;

    //@Autowired(required = false)
    /*public Person(Address address) {
        this.address = address;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
}