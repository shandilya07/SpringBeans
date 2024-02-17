package com.shandilya.codes.runner;

import com.shandilya.codes.beans.Car;
import com.shandilya.codes.config.CarConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(CarConfiguration.class);

        //var car = context.getBean(Car.class);
        var car = context.getBean("xuv700", Car.class);
        System.out.println("I love " + car.getBrand());
    }
}
