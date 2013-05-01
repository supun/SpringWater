package com.supun.springwater.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(ModelMap model){
		model.addAttribute("message","This is login page");
		return "login";
		}

}
