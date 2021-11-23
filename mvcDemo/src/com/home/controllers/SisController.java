package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeup() {
		return "Here is the makeup kit.";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks() {
		System.out.println("return the books");
		return "Here are the books you asked";
		
	}
}
