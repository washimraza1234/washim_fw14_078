package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Department;

public class AddDepartmentUseCase {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		
		Department dept= new Department();
		
		dept.setDeptName("IT");
		dept.setLocation("Kolkata");
		
		String status= dao.addDepartment(dept);
		
		System.out.println(status);
		
	}
}
