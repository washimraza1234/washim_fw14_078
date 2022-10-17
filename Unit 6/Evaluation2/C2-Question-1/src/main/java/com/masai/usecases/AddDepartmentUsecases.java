package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Department;

public class AddDepartmentUsecases {
	
	public static void main(String[] args) {
		
		EmployeeDao dao= new EmployeeDaoImpl();
		
		Department dept = new Department();
		
		dept.setDeptName("HR");
		dept.setLocation("Kolkata");
		
		dao.addDepartment(dept);
		
		System.out.println("Done");
		
	}

}
