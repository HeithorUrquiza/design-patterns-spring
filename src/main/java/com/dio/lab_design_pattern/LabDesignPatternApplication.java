package com.dio.lab_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Allow make requets
@EnableFeignClients
@SpringBootApplication
public class LabDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDesignPatternApplication.class, args);
	}

}
