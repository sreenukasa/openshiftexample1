package com.example.openshift.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Example1Application {
    
	@GetMapping("/kasa")
	 public String welcome() {
		return "Welcome to the Kasa API";
	}
	public static void main(String[] args) {
		SpringApplication.run(Example1Application.class, args);
	}

}
