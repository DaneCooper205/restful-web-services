package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomizedResponseEntityExceptionHAndler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = new ErrorDetails( LocalDate.now(),ex.getMessage(), request.getDescription(false) );
		
		return new ResponseEntity<Object>( errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	

}