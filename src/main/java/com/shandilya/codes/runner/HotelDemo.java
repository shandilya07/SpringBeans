package com.shandilya.codes.runner;

import com.shandilya.codes.beans.Hotel;
import com.shandilya.codes.config.HotelConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HotelConfiguration.class);

        Hotel hotel = context.getBean(Hotel.class);
        System.out.println(hotel.getName());
        hotel.welcomeToHotel();
        hotel.showHotelDetails();
        context.close();
    }
}
