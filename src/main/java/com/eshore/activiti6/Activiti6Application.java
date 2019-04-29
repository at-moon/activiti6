package com.eshore.activiti6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
		org.activiti.spring.boot.SecurityAutoConfiguration.class,
		LiquibaseAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})
public class Activiti6Application {

	public static void main(String[] args) {
		SpringApplication.run(Activiti6Application.class, args);
	}

}
