package com.app.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.TodoForm;

@Component
public class TodoFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return arg0.getName().equals(TodoForm.class.getName());
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "title", "todo.title.required");
	}

}
