package com.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CiCdDemoApplication {

	@GetMapping("/")
	String home(){

		return "<h1>Hello! Welcome to home page<h1>";

	}
	public static void main(String[] args) {
		SpringApplication.run(CiCdDemoApplication.class, args);
	}

}
