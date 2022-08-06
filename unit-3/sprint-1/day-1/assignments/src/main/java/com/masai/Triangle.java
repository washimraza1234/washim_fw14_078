package com.masai;

public class Triangle implements Shape {

	public void triangle() {
		System.out.println("You have drawn Triangle...!");
	}

	@Override
	public void draw() {
		
		triangle();
		
	}
	
}
