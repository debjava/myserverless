package com.ddlab.rnd.fn;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CoreFunctions {
	
	@Bean //GET http://localhost:8080/supply
	public Function<String, String> function() {
		return input -> input;
	}

	@Bean
	public Consumer<String> consume() {
		return input -> System.out.println("Input: " + input);
	}

	@Bean
	public Supplier<String> supply() {
		return () -> "Hello Guys";
	}
}
