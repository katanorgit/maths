package com.handson.maths.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


	@GetMapping
	public String welcometoCalService() {
		return "welcome to calculator service!";
	}
}
