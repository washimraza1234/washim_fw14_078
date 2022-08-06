package com.masai;

public class Circle implements Shape{
	
	public void circle() {
		System.out.println("You have drawn Circle...!");
	}

	@Override
	public void draw() {
		circle();
		
	}
	
	

}
