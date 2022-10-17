package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.TrainingDao;
import com.masai.dao.TrainingDaoImpl;
import com.masai.entities.Course;
import com.masai.entities.Student;
import com.masai.exceptions.CourseException;

public class RegisterStudentUsecase {
	
	public static void main(String[] args) throws CourseException {
		
		
		TrainingDao dao= new TrainingDaoImpl();
		
		Student students= new Student();
		
		Course course= new Course();
		
		
		students.setEmail("abc@gmail.com");
		students.setMobile("8977678");
		students.setName("WAshim");
		
		dao.registerStudent(students, course);
		
		System.out.println("Done...");
	
		
		
	}

}
