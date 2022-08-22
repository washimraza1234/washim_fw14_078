package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(StudentException ie, WebRequest wr){
		System.out.println("Inside my exception handler method");
		
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	
	//Invalid URI
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> myHandlerNotFoundExp(NoHandlerFoundException ie, WebRequest wr){
		System.out.println("Inside my exception handler method NHFE...");
		
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExpHandlerMain(Exception e, WebRequest wr){
		System.out.println("Inside my Main exception handler method");
		
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), e.getMessage(), wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}

}
