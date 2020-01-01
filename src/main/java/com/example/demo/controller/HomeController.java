package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/welcome")
	public String home() {
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}
