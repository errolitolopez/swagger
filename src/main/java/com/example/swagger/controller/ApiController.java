package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/swagger")
public class ApiController {

	@GetMapping
	public String hello() {

		System.out.println("Hello!");
		return "Hello!";
	}
}
