package com.example.demo.Exception;

import javax.management.AttributeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionalHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(AttributeNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(AttributeNotFoundException exception, WebRequest request) {

		ErrorDetails errorDetails = new ErrorDetails
				();
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}

}


