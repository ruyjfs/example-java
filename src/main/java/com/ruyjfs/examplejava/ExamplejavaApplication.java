package com.ruyjfs.examplejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExamplejavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamplejavaApplication.class, args);
	}
}