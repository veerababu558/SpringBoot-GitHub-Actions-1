package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceA {
	@GetMapping("/Hai")
		
		String display() {
			return "Hai from Controller Version-2";
		}
	}
	

