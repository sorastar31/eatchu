package com.eatchu.web.controller.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store/")
public class StoreController {
	
	@RequestMapping("detail")
	public String detail() {
		return "/WEB-INF/views/store/detail.jsp";
	}
	@RequestMapping("list")
	public String list() {
		return "/WEB-INF/views/store/list.jsp";
	}
	@RequestMapping("reviews")
	public String reviews() {
		return "/WEB-INF/views/store/reviews.jsp";
	}
}
