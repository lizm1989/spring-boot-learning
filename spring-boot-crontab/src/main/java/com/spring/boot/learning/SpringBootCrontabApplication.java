package com.spring.boot.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootCrontabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrontabApplication.class, args);
	}
}
