package com.shandilya.codes.config;

import com.shandilya.codes.beans.MobilePhone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobilePhoneConfiguration {

    @Bean(name = "iPhone")
    MobilePhone phone1() {
        var phone = new MobilePhone();
        phone.setBrand("Apple");
        return phone;
    }

    @Bean(value = "galaxy")
    MobilePhone phone2() {
        var phone = new MobilePhone();
        phone.setBrand("Samsung");
        return phone;
    }

    @Bean("pixel")
    MobilePhone phone3() {
        var phone = new MobilePhone();
        phone.setBrand("Google");
        return phone;
    }
}
