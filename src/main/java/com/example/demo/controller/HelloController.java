package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private String name;

	public String getName() {
		String mn="ccc";
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
