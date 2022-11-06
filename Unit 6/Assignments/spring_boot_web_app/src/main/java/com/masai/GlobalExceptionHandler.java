package com.masai;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidRollException.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(InvalidRollException ie,WebRequest req){
		System.out.println("inside Exception handler");
		
		MyErrorDetails err= new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noHandlerexp(NoHandlerFoundException ie, WebRequest req){
		System.out.println("inside Exception handler 2");
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false) );
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> methodArgumentNV(MethodArgumentNotValidException ie, WebRequest req){
		System.out.println("inside invalid Argument exception");
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false) );
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler2(Exception ie, WebRequest req){
		System.out.println("inside Exception handler 2");
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), req.getDescription(false) );
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
}
