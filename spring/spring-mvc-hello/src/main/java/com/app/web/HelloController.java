package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/*
 *  uri
 *  
 *  /accounts
 *  /accounts/{id}
 *  /accounts/{id}/txns
 *  /accounts/{id}/txns/{id}
 * 
 * 
 * 
 */

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView doHello(@RequestParam("userName") String user) {
		//
		String model = " Hello " + user + " ! welcome spring web-world";

		System.out.println(model);
		ModelAndView mav = new ModelAndView();
		mav.addObject("greet", model); // request.setAttribute()
		mav.setViewName("greet");

		return mav;
	}

}
