package com.tcs.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringQuoraReactiveAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuoraReactiveAppApplication.class, args);
		System.out.println("Hello Mongo");
	}

}
