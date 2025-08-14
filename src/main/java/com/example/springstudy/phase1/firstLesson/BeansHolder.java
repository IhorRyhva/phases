package com.example.springstudy.phase1.firstLesson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeansHolder {

    @Bean
    @Profile("!dev")
    public Car car(){
        return new Car();
    }

    @Bean
    @Profile("dev")
    public Car carDev(){
        System.out.println("DEV");
        return new Car();
    }
}
