package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String addDepartment(Department dept) {
		
		String msg= "";
		
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(dept);
		
		em.getTransaction().commit();
		
		msg="Department Added....";
		
		return msg;
		
	}

	@Override
	public String addEmployee(Employee emp) {
		String msg= "";
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		msg="Employee Added....";
		
		return msg;
	}

}
