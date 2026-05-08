package ru.job4j.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		System.out.println("Go to http://localhost:8080/Hello");
	}
}
