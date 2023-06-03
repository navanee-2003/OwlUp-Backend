package com.owlup.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@SpringBootApplication
public class OwlUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwlUpApplication.class, args);
	}

}
