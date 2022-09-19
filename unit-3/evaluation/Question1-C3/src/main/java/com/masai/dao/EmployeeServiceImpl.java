package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.masai.beans.Employee;
import com.masai.exceptions.EmployeeException;
import com.masai.utility.EMUtil;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public boolean saveEmployee(Employee emp) {
		boolean flag=false;
		EntityManager em= EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		flag= true;
		
		em.close();
		return flag;
	}

	@Override
	public List getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
