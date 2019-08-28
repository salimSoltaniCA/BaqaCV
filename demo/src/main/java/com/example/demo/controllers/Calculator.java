package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class Calculator {

	@RequestMapping("/add")
	public int add(int a, int b) {
		return a + b;
	}

	@RequestMapping("/sub")
	public int substr(int a, int b) {
		return a - b;
	}

	@RequestMapping("/div")
	public int devide(int a, int b) {
		return a / b;
	}

	@RequestMapping("/mul")
	public int multiply(int a, int b) {
		return a * b;
	}

}
