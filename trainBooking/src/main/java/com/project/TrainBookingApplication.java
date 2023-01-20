package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class TrainBookingApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrainBookingApplication.class, args);
	}

}
