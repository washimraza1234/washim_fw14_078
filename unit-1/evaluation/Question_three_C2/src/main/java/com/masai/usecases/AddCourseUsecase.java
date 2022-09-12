package com.masai.usecases;

import com.masai.dao.TrainingDao;
import com.masai.dao.TrainingDaoImpl;
import com.masai.entities.Course;

public class AddCourseUsecase {

	public static void main(String[] args) {
		
		TrainingDao dao= new TrainingDaoImpl();
		
		Course courses= new Course();
		
		courses.setCourseName("JAVA");
		courses.setDuration("2 years");
		courses.setFee(3000);
		
		String status= dao.addCourse(courses);
		System.out.println(status);
	}
}
