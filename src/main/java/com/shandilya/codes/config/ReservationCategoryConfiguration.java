package com.shandilya.codes.config;

import com.shandilya.codes.beans.ReservationCategory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ReservationCategoryConfiguration {

    @Bean
    ReservationCategory firstClass() {
        var category = new ReservationCategory();
        category.setCategoryName("First Class");
        return category;
    }

    @Bean
    ReservationCategory secondClass() {
        var category = new ReservationCategory();
        category.setCategoryName("Second Class");
        return category;
    }

    @Bean
    @Primary
    ReservationCategory economyClass() {
        var category = new ReservationCategory();
        category.setCategoryName("Economy Class");
        return category;
    }
}
