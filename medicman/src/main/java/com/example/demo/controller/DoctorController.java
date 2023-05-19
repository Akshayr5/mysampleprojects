package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	
	@RequestMapping
	public String display() {
		return "doctor";
	}

}
