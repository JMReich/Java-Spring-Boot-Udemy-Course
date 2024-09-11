package com.jacobreich.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { };
record Address (String firstLine, String city) { };


@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Reich";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		return new Person("Jacob", 23);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Home 123", "Detroit");
	}

}
