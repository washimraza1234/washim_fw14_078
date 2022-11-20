package com.masai.assignment3;

public class BlueCar extends Car {

	{
		System.out.print("4");
	}

	public BlueCar() {
		super("blue");
		System.out.print("5");
	}

	public static void main(String[] gears) {
		new BlueCar();
	}
	
	// Answer is 13245

}
