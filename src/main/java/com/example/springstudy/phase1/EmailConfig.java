package com.example.springstudy.phase1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

@Configuration
public class EmailConfig {

//    @Bean
//    @Profile("!dev")
//    public JavaMailSender email() throws IOException {
//        return new JavaMailSenderImpl();
//    }

//    @Bean
//    @Profile("dev")
//    public JavaMailSender emailDev(){
//        System.out.println("Dev");
//        return new JavaMailSenderImpl();
//    }
}
