package com.masai.assignment2;

public class Cat extends Animal{
	
	String nickName;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	

	public Cat(String nickName) {
		super();
		this.nickName = nickName;
	}


	public Cat(String nickName, String name) {
		super();
		this.nickName = nickName;
		this.name=name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	void makNoise() {
		System.out.println("Cat is making noise");
		
	}

	@Override
	void eat() {
		System.out.println("Cat is eating");
		
	}
	
	void jump() {
		System.out.println("Cat is Jumping");
	}
	
	

}
