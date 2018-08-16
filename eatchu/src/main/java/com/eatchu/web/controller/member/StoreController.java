package com.eatchu.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/store/")
public class StoreController {

	@RequestMapping("home")
	public String home() {
		
		return "/WEB-INF/views/member/store/home.jsp";
	}
	@RequestMapping("reg")
	public String reg() {
		
		return "/WEB-INF/views/member/store/reg.jsp";
	}
}
