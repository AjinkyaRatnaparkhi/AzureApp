package com.cts.dev.azapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/")
	public String helloApp() {
		return "Welcome to New Spring Boot App !! ";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Boot App";
	}
}
