package com.byteme.sanitise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SanitiseApplication {
	public static void main(String[] args) {
		SpringApplication.run(SanitiseApplication.class, args);
	}
}