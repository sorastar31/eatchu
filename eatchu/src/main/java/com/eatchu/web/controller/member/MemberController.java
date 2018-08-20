package com.eatchu.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@RequestMapping("detail")
	public String detail() {
		
		return "member.detail";
	}
	@RequestMapping("list")
	public String friendList() {
		
		return "member.list";
	}
	@RequestMapping("mypage")
	public String mypage() {
		
		return "member.mypage";
	}

	@RequestMapping("store/reg")
	public String reg() {
		
		return "member.store.reg";
	}
}
