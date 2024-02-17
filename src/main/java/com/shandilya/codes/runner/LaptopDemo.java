package com.shandilya.codes.runner;

import com.shandilya.codes.beans.Laptop;
import com.shandilya.codes.config.LaptopConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDemo {
    public static void main(String[] args) {
        // Normal way of creating an object
        Laptop laptop = new Laptop();
        laptop.setBrand("DELL");
        System.out.println("Laptop fetched from non Spring context : " + laptop.getBrand());

        var context = new AnnotationConfigApplicationContext(LaptopConfiguration.class);
        Laptop contextLaptop = context.getBean(Laptop.class);
        System.out.println("Laptop fetched from Spring context : " + contextLaptop.getBrand());

        var message = context.getBean(String.class);
        var year = context.getBean(Integer.class);
        System.out.println("Message :" + message + " from year : " + year);
    }
}
