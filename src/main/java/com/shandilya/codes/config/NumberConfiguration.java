package com.shandilya.codes.config;

import com.shandilya.codes.beans.Number;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumberConfiguration {

    @Bean
    Number number() {
        return new Number();
    }
}
