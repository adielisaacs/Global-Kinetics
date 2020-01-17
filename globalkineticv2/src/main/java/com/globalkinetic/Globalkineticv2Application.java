package com.globalkinetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Globalkineticv2Application {

	public static void main(String[] args) {
		SpringApplication.run(Globalkineticv2Application.class, args);
	}
	 @Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}
	 
}
