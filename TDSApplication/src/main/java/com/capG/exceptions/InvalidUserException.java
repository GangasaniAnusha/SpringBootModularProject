package com.capG.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
//Custom Exception Class to print the custom message when ever the id is not found
public class InvalidUserException extends RuntimeException {
	
	public InvalidUserException(String data) {
		super(data);
	}

}
