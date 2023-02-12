package com.carchoiceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class CarChoiceAppApplication {

	@Autowired
	CarRepo carRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CarChoiceAppApplication.class, args);
	}
	

}
