package com.masai.assignment2;

public class Dog extends Animal{
	
	String breed;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Dog(String breed) {
		super();
		this.breed = breed;
	}
	
	public Dog(String breed, String name) {
		super();
		this.breed = breed;
		this.name=name;
	}




	public String getBreed() {
		return breed;
	}




	public void setBreed(String breed) {
		this.breed = breed;
	}




	@Override
	void makNoise() {
		System.out.println("Dog is making nosise");
		
	}




	@Override
	void eat() {
		System.out.println("Dog is eating");
		
	}
	
	void play() {
		System.out.println("Dog is playing...");
	}





}
