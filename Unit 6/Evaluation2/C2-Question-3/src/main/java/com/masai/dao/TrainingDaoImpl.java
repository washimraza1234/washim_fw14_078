package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Course;
import com.masai.entities.Student;
import com.masai.exceptions.CourseException;
import com.masai.utility.EMUtil;

public class TrainingDaoImpl implements TrainingDao{

	@Override
	public void addCourse(Course course) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(course);
		
		System.out.println("Courses added...");
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public void registerStudent(Student student, Course courseId) throws CourseException {
		// TODO Auto-generated method stub
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Course course= em.find(Course.class, courseId.getCourseId());
		
		if(course != null) {
			em.getTransaction().begin();
			
			student.getCourses().add(course);
			System.out.println("Student registered");
			
			em.getTransaction().commit();
			
			em.close();
		}
		else {
			throw new CourseException("NO COurses available enter valid course id");
		}
		
		
	}

}
