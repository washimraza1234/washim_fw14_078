package com.masai;

public class Clerk implements ControllerInterface{

	public void registerStudent() {
		System.out.println("enroll the Student in Collage");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		registerStudent();
		
	}

}
