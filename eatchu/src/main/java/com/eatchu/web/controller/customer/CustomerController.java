package com.eatchu.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	@GetMapping("signup")
	public String signup() {
		return "customer.signup";
	}
	
	@GetMapping("login")
	public String login() {
		return "customer.login";
	}
	
	@GetMapping("memberDetail")
	public String memberDetail() {
		return "customer.memberDetail";
	}
	
	@GetMapping("recommend")
	public String recommend() {
		return "customer.recommend";
	}
	
	@GetMapping("friend")
	public String friend() {
		return "customer.friend";
	}
}