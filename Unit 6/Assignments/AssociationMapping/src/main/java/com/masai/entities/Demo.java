package com.masai.entities;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee emp= new Employee();
		
		emp.setName("Washim");
		emp.setSalary(12000);
		
		
		Employee emp1= new Employee();
		emp1.setName("Raza");
		emp1.setSalary(10000);
		
		Department dept= new Department();
		
		dept.setDname("HR");
		dept.setLocation("Kol");
		
		
		dept.getEmps().add(emp);
		dept.getEmps().add(emp1);
		
		em.getTransaction().begin();
		
//		em.persist(emp);
//		em.persist(emp1);
		
		//no need to persist the child objects due to the use of cascade type ALL;
		em.persist(dept);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");
		
	}
}
