package com.shandilya.codes.config;

import com.shandilya.codes.beans.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaptopConfiguration {
    @Bean
    Laptop laptop() {
        var laptop = new Laptop();
        laptop.setBrand("Apple");
        return laptop;
    }

    @Bean
    String hello() {
        return "Hello!";
    }

    @Bean
    Integer year() {
        return 2024;
    }
}