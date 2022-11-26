package com.masai.assignment4;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMpl implements StudentService{

	//private StudentService sSer;
	String name="washim";
	@Override
	public List<Student> addStudent(Student std) {
		
		
		List<Student> students= new ArrayList<>();
		students.add(std);
		
		
		return  students;
	}
	
	
	public static void main(String[] args) {
		StudentService sser= new StudentServiceIMpl();
		
		List<Student> s= sser.addStudent(new Student(1, "Washim", 200, "ASEC", new Address("WB", "Kolkata", "12345")));
		
		System.out.println(s.toString());
	}

}
