package com.app.web;

import java.security.Principal;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.TodoForm;
import com.app.validator.TodoFormValidator;

@Controller
@RequestMapping(value = "/todos")
public class TodoController {

	@Autowired
	private TodoFormValidator todoFormValidator;

	/*
	 
	//---------------------------------------------------------------
	 
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String getAllTodos() {
		System.out.println("GET : /todos");
		return "/todos - handled";
	}

	
	
	//---------------------------------------------------------------
	 
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String addNewTodo(HttpServletRequest req) {
		System.out.println("POST : /todos");

		String id = req.getParameter("id");
		String title = req.getParameter("title");
		String completed = req.getParameter("completed");

		System.out.println(id);
		System.out.println(title);
		System.out.println(completed);

		return "/todos - handled";
	}
	
	//---------------------------------------------------------------

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String addNewTodo(@RequestParam int id,
			@RequestParam(name = "title") String title,
			@RequestParam(required = false) boolean completed) {
		System.out.println("POST : /todos");

		System.out.println(id);
		System.out.println(title);
		System.out.println(completed);

		return "/todos - handled";
	}
	
	//---------------------------------------------------------------

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String addNewTodo(@ModelAttribute TodoForm todoForm, BindingResult result) {
		System.out.println("POST : /todos");

		todoFormValidator.validate(todoForm, result);

		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println(error);
			}
			return "Invalid Input";
		}

		System.out.println(todoForm);

		return "/todos - handled";
	}

	//---------------------------------------------------------------
	

	@RequestMapping(method = RequestMethod.POST,consumes={"application/xml","application/json"})
	public @ResponseBody String addNewTodo(@RequestBody TodoForm todoForm) {
		System.out.println("POST : /todos");
		System.out.println(todoForm);
		return "/todos - handled";
	}
	
	//---------------------------------------------------------------
	

	@RequestMapping(params={"!filterBy"})
	public @ResponseBody String m3() {
		System.out.println("GET : /todos");
		return "/todos - handled";
	}
	
	//---------------------------------------------------------------
	

	@RequestMapping(headers={"!Accept"})
	public @ResponseBody String m4() {
		System.out.println("GET : /todos");
		return "/todos - handled";
	}
	
	
	
	
	

	@RequestMapping()
	public @ResponseBody String m4(@RequestHeader(name="Accept",defaultValue="text/html") String accept) {
		System.out.println("GET : /todos");
		return "/todos - handled";
	}

	

	@RequestMapping()
	public @ResponseBody String m5(@CookieValue(name="JSESSIONID",required=false) String sessionID) {
		System.out.println("GET : /todos");
		System.out.println(sessionID);
		return "/todos - handled";
	}
	
	
	
	

	@RequestMapping()
	public @ResponseBody String m6(Locale locale) {
		System.out.println("GET : /todos");
		System.out.println(locale.getCountry());
		return "/todos - handled";
	}
	
	
	

	@RequestMapping()
	public @ResponseBody String m6(Principal principal) {
		System.out.println("GET : /todos");
		System.out.println(principal.getName());
		return "/todos - handled";
	}
	
	*/
	
	
	//------------------------------------------------------------------
	/*
	@RequestMapping()
	public ModelAndView m7() {
		System.out.println("GET : /todos");
		ModelAndView mav=new ModelAndView();
		mav.addObject("model","model-value");
		mav.setViewName("view-name");
		return mav;
	}
	

	@RequestMapping()
	public String  m7(Model model) {
		System.out.println("GET : /todos");
		model.addAttribute("model","model-value");
		return "view-name";
	}
	

	@RequestMapping()
	public String  m7(Map<String, String> model) {
		System.out.println("GET : /todos");
		model.put("model","model-value");
		return "view-name";
	}
	
	//------------------------------------------------------------------
	
	@RequestMapping("/api-call")
	public @ResponseBody String getData() {
		return "response-data";
	}
	
	*/
	
	@RequestMapping("/{todoId}/path/{otherId}")
	public @ResponseBody TodoForm getData(@PathVariable int todoId) {
		
		TodoForm todoForm=new TodoForm();
		todoForm.setId(todoId);
		todoForm.setTitle("Live Life");
		todoForm.setCompleted(false);
		
		return todoForm;
	}
	 
	
	
}
