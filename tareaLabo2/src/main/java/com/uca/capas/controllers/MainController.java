package com.uca.capas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.User;

@Controller
public class MainController {

	@GetMapping("/login")
	public String sendForm(User u) {
		return "Login";
	}

	@PostMapping("/login")
	public String login(User u) {
		if (u.getName().equals("hello") && u.getPassword().equals("world")) {
			return "Valid";
		} else {
			return "Invalid";
		}
	}
}
