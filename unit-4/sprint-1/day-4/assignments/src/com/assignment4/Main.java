package com.assignment4;

public class Main {
//	Student res= new Student();
	
	
	public static void main(String[] args) {
		Student std= new Student();
		std.setRoll(002);
		std.setName("Amit");
		std.setAge(15);
		std.setMarks(250);
		
		
		std.details();
		System.out.println("---------------------------------");
		Student std2 =new Student(001,"rahul",16,200);
		std2.details();
	}
}
