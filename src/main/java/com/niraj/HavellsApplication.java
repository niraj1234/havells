package com.niraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HavellsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HavellsApplication.class, args);
		System.out.println("||||||===> Spring Boot Project HAVELLS START ");
		System.out.println("This micro Service will handle all the order for Havells");
	}

}
