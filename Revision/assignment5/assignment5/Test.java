package com.masai.assignment5;

public class Test {

	public static void main(String[] args) {
		
		Thread th= new Thread(new ThreadImpl2());
		
		Thread th2= new Thread(new ThreadImpl1());
		th2.start();
		th.start();
		
		
	}
}
