package com.assignment7;

import java.util.Scanner;
//Abstraction
public class Child extends Parent {
	public Child(int number) {
		super(number);
		System.out.println("Inside parent class"+number);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println(Parent.nm);
		
		int number=sc.nextInt();
		
		new Child(number);
		sc.close();
	}
}
