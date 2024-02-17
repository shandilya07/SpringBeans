package com.shandilya.codes.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
    private String name;
    private String location;
    private String userReviewRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserReviewRating() {
        return userReviewRating;
    }

    public void setUserReviewRating(String userReviewRating) {
        this.userReviewRating = userReviewRating;
    }

    public void showHotelDetails() {
        System.out.println("Hotel - " + this.name + " at location - " + location + "is rated :" + userReviewRating);
    }

    public void welcomeToHotel() {
        System.out.println("Hello, welcome to the hotel!");
    }

    @PostConstruct
    public void init() {
        this.name = "Some Hotel";
        this.location = "Some Location";
        this.userReviewRating = "Good rating";
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Hotel getting destroyed!");
    }
}