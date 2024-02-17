package com.shandilya.codes.runner;

import com.shandilya.codes.beans.ReservationCategory;
import com.shandilya.codes.config.ReservationCategoryConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReservationCategoryDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ReservationCategoryConfiguration.class);

        var defaultCategory = context.getBean(ReservationCategory.class);
        System.out.println("Default reservation category is : " + defaultCategory.getCategoryName());
    }
}
