package com.shandilya.codes.runner;

import com.shandilya.codes.beans.Login;
import com.shandilya.codes.config.HotelConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoginDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HotelConfiguration.class);
        Login login = context.getBean(Login.class);
        login.message();
    }
}
