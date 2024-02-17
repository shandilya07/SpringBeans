package com.shandilya.codes.runner;

import com.shandilya.codes.beans.Number;
import com.shandilya.codes.config.NumberConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class NumberDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(NumberConfiguration.class);

        Supplier<Number> evenNumber = () -> {
            Number number = new Number();
            number.setType("EVEN");
            return number;
        };

        Supplier<Number> oddNumber = () -> {
            Number number  = new Number();
            number.setType("ODD");
            return number;
        };

        Random random = new Random();
        int number = random.nextInt(100);

        if (number % 2 == 0) {
            context.registerBean("EVEN_BEAN", Number.class, evenNumber);
            System.out.println("Number is : " + number + " and number type is " + context.getBean("EVEN_BEAN", Number.class).getType());
        } else {
            context.registerBean("ODD_BEAN", Number.class, oddNumber);
            System.out.println("Number is : " + number + " and number type is " + context.getBean("ODD_BEAN", Number.class).getType());
        }
    }
}
