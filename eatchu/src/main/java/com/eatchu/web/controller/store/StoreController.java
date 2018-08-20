package com.eatchu.web.controller.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("store/")
public class StoreController {
	
	@RequestMapping("detail")
	public String detail() {
		return "store.detail";
	}
	@RequestMapping("list")
	public String list() {
		return "store.list";
	}
	@RequestMapping("reviews")
	public String reviews() {
		return "store.reviews";
	}
}
