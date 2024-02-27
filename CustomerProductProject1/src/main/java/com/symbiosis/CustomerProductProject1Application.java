package com.symbiosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.symbiosis","com.controller","com.repository","com.model","com.service"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.repository")
public class CustomerProductProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerProductProject1Application.class, args);
	}

}
