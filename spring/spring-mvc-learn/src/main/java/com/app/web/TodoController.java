package com.app.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.TodoForm;
import com.app.validator.TodoFormValidator;

@Controller
@RequestMapping(value = "/todos")
public class TodoController {

	@Autowired
	private TodoFormValidator todoFormValidator;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String getAllTodos() {
		System.out.println("GET : /todos");
		return "/todos - handled";
	}

	/*@RequestMapping(method = RequestMethod.POST)
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
*/
	
	

	@RequestMapping(method = RequestMethod.POST,consumes={"application/xml","application/json"})
	public @ResponseBody String addNewTodo(@RequestBody TodoForm todoForm) {
		System.out.println("POST : /todos");
		System.out.println(todoForm);
		return "/todos - handled";
	}
	
	
}
