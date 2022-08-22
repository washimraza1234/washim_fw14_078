package com.masai.exceptions;

//Unchecked Exception RuntimeException, So that no error in the compile time.
public class StudentException extends RuntimeException{

	public StudentException() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentException(String message) {
		super(message);
	}
}
