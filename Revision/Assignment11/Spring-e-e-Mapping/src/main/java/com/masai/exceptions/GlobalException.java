package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {
	
	
	
	//Data vAlidation Handler
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> studentExceptionHandler(StudentException me, WebRequest req) {
		
		MyErrorDetails err= new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CourseException.class)
	public ResponseEntity<MyErrorDetails> courseExceptionHandler(CourseException me, WebRequest req) {
		
		MyErrorDetails err= new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception me, WebRequest req) {
		
		MyErrorDetails err= new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> NoHandlerexceptionHandler(NoHandlerFoundException me, WebRequest req) {
		
		MyErrorDetails err= new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}

}
