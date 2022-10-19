package com.masai;

public class Teacher implements ControllerInterface{

	public void teaches() {
		System.out.println("Teacher teaches");
	}

	@Override
	public void go() {
		teaches();
		
	}

}
