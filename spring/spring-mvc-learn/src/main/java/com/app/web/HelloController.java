package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView doHello(@RequestParam String userName) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("greet");
		mav.addObject("greetModel", "Hello "+userName+", Welcome to Spring-web");
		return mav;

	}

}
