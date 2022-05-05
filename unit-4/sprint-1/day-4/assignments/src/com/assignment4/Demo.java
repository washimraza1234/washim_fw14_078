package com.assignment4;

public class Demo {
	Demo(){
		this("Waseem");
		System.out.println("inside non paramaterized constructor");
	}
	
	Demo(String s){
		this(10);
		System.out.println("inside paramaterized constructor of sring");
	}
	
	Demo(int i){
		this(10.55f);
		System.out.println("inside paramaterized constructor of integer");
	}
	
	Demo(float f){
		System.out.println("inside paramaterized constructor of float");
	}
	
	public static void main(String[] args) {
		Demo dm= new Demo();
	}
}
