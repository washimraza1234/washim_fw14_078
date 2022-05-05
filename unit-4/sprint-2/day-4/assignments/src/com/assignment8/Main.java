package com.assignment8;

public class Main implements Intr {
//	@Override
//	public void funI() {
//		System.out.println("Inside fun of Intrwewerw");
//	}

	@Override
	public void draw() {
		System.out.println("inside fun of Main draw");
		
	}
	
	@Override
	public String toString() {
		return "Main []";
	}

	public static void main(String[] args) {
		Main m= new Main();
		m.draw();
		System.out.println(m);
		Intr in= new Main();
		
		in.draw();
//		in.funI();
		
		Intr.funI();
		
		
	}

	
}
