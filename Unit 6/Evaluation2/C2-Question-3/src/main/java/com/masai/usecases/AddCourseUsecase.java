package com.masai.usecases;

import com.masai.dao.TrainingDao;
import com.masai.dao.TrainingDaoImpl;
import com.masai.entities.Course;

public class AddCourseUsecase {

	public static void main(String[] args) {
		
		TrainingDao dao= new TrainingDaoImpl();
		
		Course course= new Course();
		
		course.setCourseName("JAVA");
		course.setDuration("2 years");
		course.setFee(1200);
		
		dao.addCourse(course);
		
		System.out.println("Done...");
		
	}
}
