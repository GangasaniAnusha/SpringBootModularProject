package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


//which maps to all the packages
@ComponentScan("com.capG.controller")
@ComponentScan("com.capG.dao")
@ComponentScan("com.capG.service")
@ComponentScan("com.capG.model")
@EntityScan(basePackages = {"com.capG.model"})
@SpringBootApplication
public class TdsApplication {
//it is spring boot application
	public static void main(String[] args) {
		SpringApplication.run(TdsApplication.class, args);
	}

}
