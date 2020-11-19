package com.vikash.springjpalearning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAController {
	
	@Value("${message}")
	private String message;

	@RequestMapping("/message")
	public String message() {
		return this.message;
	}
}
