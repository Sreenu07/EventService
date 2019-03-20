package com.events;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EventServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EventServiceApplication.class, args);
	}
	 @Bean
	 public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
	        return new Jackson2JsonMessageConverter();
	    }
}
