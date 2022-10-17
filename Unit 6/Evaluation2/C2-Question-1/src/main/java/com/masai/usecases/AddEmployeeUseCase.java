package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Address;
import com.masai.entities.Employee;

public class AddEmployeeUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao= new EmployeeDaoImpl();
		
		Employee emp= new Employee();
		
		emp.setEmpName("Washim");
		emp.setSalary(12000.00);
		emp.setAddress(new Address("Kolkata", "WB", "711119"));
		
		dao.addEmployee(emp);
		
		System.out.println("Done...");
		
	}

}
