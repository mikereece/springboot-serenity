package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootSerenityApplication {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(SpringBootSerenityApplication.class).properties("spring.config.name:serenity").build().run(args);
	}
}
