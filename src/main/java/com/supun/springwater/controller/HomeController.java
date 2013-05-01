package com.supun.springwater.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/profile")
public class HomeController {
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(ModelMap model){
		model.addAttribute("message","Hello User");
		return "hello";
		}

}
