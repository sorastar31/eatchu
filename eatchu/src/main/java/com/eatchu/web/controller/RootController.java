package com.eatchu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {
	
	@GetMapping("signup")
	public String signup() {
		return "home.signup";
	}
	
	@GetMapping("index")
	public String index() {
		return "home.index";
	}
	
	@GetMapping("recommend")
	public String recommend() {
		return "home.recommend";
	}
}
