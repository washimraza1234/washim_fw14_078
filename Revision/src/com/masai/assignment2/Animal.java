package com.masai.assignment2;


public abstract class Animal {

	String name;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract void makNoise();
	
	abstract void eat();
	
	
	public void sleep() {
		System.out.println("Animal is Sleeping");
	}
}
