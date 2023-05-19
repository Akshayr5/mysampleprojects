package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InavlidCredentialException extends RuntimeException{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public InavlidCredentialException() {
		// TODO Auto-generated constructor stub
		super("invalid credentials");
	}

}
