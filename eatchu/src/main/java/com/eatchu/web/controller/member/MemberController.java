package com.eatchu.web.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@RequestMapping("detail")
	public String detail() {
		
		return "/WEB-INF/views/member/detail.jsp";
	}
	@RequestMapping("list")
	public String friendList() {
		
		return "/WEB-INF/views/member/list.jsp";
	}
	@RequestMapping("mypage")
	public String mypage() {
		
		return "/WEB-INF/views/member/mypage.jsp";
	}

	@RequestMapping("store/list")
	public String storeList() {
		
		return "/WEB-INF/views/member/store/list.jsp";
	}
	@RequestMapping("store/reg")
	public String reg() {
		
		return "/WEB-INF/views/member/store/reg.jsp";
	}
}
