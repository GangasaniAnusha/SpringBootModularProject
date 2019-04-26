package com.capG.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.capG.exceptions.InvalidUserException;
import com.capG.model.ErrorUserDetails;

//handles multiple controllers by single exception handler 
@ControllerAdvice
@RestController
public class ExceptionHandlerClass extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = InvalidUserException.class)
	public final ResponseEntity<ErrorUserDetails> handleNotFoundException(ErrorUserDetails errorUserDetailsObj,WebRequest request){
		ErrorUserDetails errorUserDetails= new ErrorUserDetails(new Date(), errorUserDetailsObj.getMessage(),request.getDescription(false));
				return new ResponseEntity<>(errorUserDetails, HttpStatus.NOT_FOUND);
		
	}
}
