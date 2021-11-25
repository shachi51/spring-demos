package com.acc.home.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyCafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		//String myName="Shachi";
		//model.addAttribute("value", myName);
		model.addAttribute("titlevalue", "MOM'S CAFE");
		return "cafe";
	}
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		
		String userEnteredValue= request.getParameter("foodType");
		model.addAttribute("userInput",userEnteredValue );
		return "process-order";
	}
}
