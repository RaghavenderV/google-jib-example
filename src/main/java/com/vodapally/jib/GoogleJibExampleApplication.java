package com.vodapally.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleJibExampleApplication {

	@GetMapping("/")
	public String message(){
		return "Dockerize java application using Google jib plug-in";
	}

	public static void main(String[] args) {
		SpringApplication.run(GoogleJibExampleApplication.class, args);
	}

}
