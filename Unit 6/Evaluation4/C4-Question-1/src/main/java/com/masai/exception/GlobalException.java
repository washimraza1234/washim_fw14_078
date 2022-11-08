package com.masai.exception;

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

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyErrorDetails> studentExceptionHandler(EmployeeException me, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();

		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

	}

	

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> NoHandlerexceptionHandler(NoHandlerFoundException me, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();

		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> muMNVEhandler(MethodArgumentNotValidException me) {
		
		MyErrorDetails err= new MyErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Validation error");
		err.setDescription(me.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception me, WebRequest req) {

		MyErrorDetails err = new MyErrorDetails();

		err.setTimestamp(LocalDateTime.now());
		err.setMessage(me.getMessage());
		err.setDescription(req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

	}

	

}
