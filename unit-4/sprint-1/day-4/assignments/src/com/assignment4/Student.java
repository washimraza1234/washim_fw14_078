package com.assignment4;

public class Student {
	
// Java Bean Class 
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}
	
	

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
//	Make validation checks before setting the age and marks of the Student
	//	(i.e. are they in the valid range,18<age<60, 0<marks<500).

	public void setAge(int age) {
		
		if(age>18 && age<60) {
			this.age = age;
		}
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
	}
	
	void details() {
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Marks is: "+marks);
	}
	
	
	
}
