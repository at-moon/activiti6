package com.eshore.activiti6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.eshore.activiti6.repository")
@EntityScan("com.eshore.activiti6.entity.*")
@SpringBootApplication(exclude = {
		org.activiti.spring.boot.SecurityAutoConfiguration.class,
		LiquibaseAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.servlet.SecurityRequestMatcherProviderAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration.class
})
public class Activiti6Application {

	public static void main(String[] args) {
		SpringApplication.run(Activiti6Application.class, args);
	}

}
