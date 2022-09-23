package com.masai;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class B {

	public void funB() {
		System.out.println("Inside funB of class B");
	}
	
	
	
	
	//we can also apply bean to register its object in any class
	//use bean when we dont use stero type annotation in classes,, use @bean to register the object
	// with spring container
	
	
	
}
