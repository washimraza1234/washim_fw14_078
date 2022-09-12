package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Course;
import com.masai.utility.EMUtil;

public class TrainingDaoImpl implements TrainingDao{

	@Override
	public String addCourse(Course course) {
		String msg="";
		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
		msg="Course added...";
		
		
		return msg;
	}

}
