package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import com.example.demo.core.DataResult;
import com.example.demo.core.ErrorDataResult;
import com.example.demo.core.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}


	@GetMapping("/getAll")
	public DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("/add")
 	Result add(@RequestBody User user){
		return this.userService.add(user);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException
	(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}

		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, null);
		return errors;
	}
}


