package com.becoder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/api")

public class HomeController {
	
	@GetMapping(value ="/hello")
	public String sayHello()
	{
		return "Hello Spring boot Security";
	}
}
