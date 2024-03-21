package com.shandilya.codes.runner;

import com.shandilya.codes.beans.Person;
import com.shandilya.codes.config.HotelConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HotelConfiguration.class);
        Person person = context.getBean(Person.class);
        person.setName("Shandilya");
        System.out.println(person.getName());
    }
}