package com.docker.springboot.helloworld.java11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Java11Application {
	@SuppressWarnings("unused")
	@RestController
	public static class HelloRestController {
        @RequestMapping("/")
        public String index() {
            return "Greetings from Spring Boot!";
        }
	}

	public static void main(String[] args) {
		SpringApplication.run(Java11Application.class, args);
	}
}

