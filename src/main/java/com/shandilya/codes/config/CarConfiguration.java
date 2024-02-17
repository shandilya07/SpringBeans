package com.shandilya.codes.config;

import com.shandilya.codes.beans.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {

    @Bean
    Car xuv700() {
        var car = new Car();
        car.setBrand("MAHINDRA");
        return car;
    }

    @Bean
    Car harrier() {
        var car = new Car();
        car.setBrand("TATA");
        return car;
    }
}