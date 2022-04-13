package com.assignment3;

public class Student {
//	roll: int
//	name: String
//	marks: int
	
	int roll;
	String name;
	int marks;
	
//	displayStudentDetails: void
	void displayStudentDetails() {
//		Roll is :
//			Name is :
//			Marks is :
		
		System.out.println("Roll is: "+ roll);
		System.out.println("Name is: "+ name);
		System.out.println("Marks is: "+ marks);
		
		
	}
	
	public static void main(String[] args) {
		Student d1= new Student();
		Student d2= new Student();
		
		d1.roll=1;
		d1.name="Washim";
		d1.marks=90;
		
		
		
		d2.roll=2;
		d2.name="Amit";
		d2.marks=98;
		
		
		d1.displayStudentDetails();
		System.out.println("-----------------------");
		d2.displayStudentDetails();
		
		d1=null;
		d2=null;
	}
}
