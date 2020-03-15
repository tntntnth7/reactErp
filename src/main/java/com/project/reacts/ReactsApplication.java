package com.project.reacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project")
@EnableAutoConfiguration
public class ReactsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactsApplication.class, args);
	}

}
