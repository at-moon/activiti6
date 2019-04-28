package com.eshore.activiti6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.activiti.spring.boot.SecurityAutoConfiguration.class})
public class Activiti6Application {

	public static void main(String[] args) {
		SpringApplication.run(Activiti6Application.class, args);
	}

}
