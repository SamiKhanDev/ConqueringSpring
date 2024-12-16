package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.demo.rest", "com.example.demo.test"}
)
public class SpringPracticeApplication {

	public static void main(String[] args) {


		SpringApplication.run(SpringPracticeApplication.class, args);
	}

}
