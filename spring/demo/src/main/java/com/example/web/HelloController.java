package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.CustomConfig;

@Controller("helloController")
public class HelloController {
 
	@Autowired
	private CustomConfig customProperties;

	@RequestMapping("/hello")
	public @ResponseBody String sayHello() {
		return "Hello , welcome again to spring boot : " + customProperties.getCompName();
	}
	
	@RequestMapping("/link")
	public String doLink(Model model) {
		System.out.println("link method..");
		model.addAttribute("attrName", "Happy weekend");
		return "view";
	}
	
	

}
