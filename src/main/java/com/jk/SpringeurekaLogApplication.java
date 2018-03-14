package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableEurekaClient
public class SpringeurekaLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringeurekaLogApplication.class, args);
	}
}
