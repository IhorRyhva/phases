package com.example.springstudy;

import com.example.springstudy.phase1.EmailService;
import com.example.springstudy.phase1.firstLesson.Car;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Data
public class SpringStudyApplication {
	private final EmailService emailService;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringStudyApplication.class, args);
		Car car = applicationContext.getBean(Car.class);
		car.sound();
	}

}
