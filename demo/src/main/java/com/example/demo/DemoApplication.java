package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import controller.UserController;
import repository.IUserRepository;
import services.UseServices;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses={IUserRepository.class})
@ComponentScan(basePackages= {"repository","services","controller"})
@EntityScan("entities")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
