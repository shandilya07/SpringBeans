package com.shandilya.codes.runner;

import com.shandilya.codes.beans.MobilePhone;
import com.shandilya.codes.config.MobilePhoneConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobilePhoneDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MobilePhoneConfiguration.class);

        var mob1 = context.getBean("iPhone", MobilePhone.class);
        var mob2 = context.getBean("galaxy", MobilePhone.class);
        var mob3 = context.getBean("pixel", MobilePhone.class);

        System.out.println("Mob1 brand : " + mob1.getBrand());
        System.out.println("Mob2 brand : " + mob2.getBrand());
        System.out.println("Mob3 brand : " + mob3.getBrand());
    }
}
