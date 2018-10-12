package com.narasimha.angularspringboot.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(DataSourceConfiguration.class)
@SpringBootApplication(scanBasePackages = "com.narasimha.angularspringboot")
public class AngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringBootApplication.class, args);
	}
}
