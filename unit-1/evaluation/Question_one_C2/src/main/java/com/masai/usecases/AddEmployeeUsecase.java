package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Address;
import com.masai.entities.Employee;

public class AddEmployeeUsecase {
	
	public static void main(String[] args) {
		EmployeeDao dao= new EmployeeDaoImpl();
		
		
		Employee emp= new Employee();
		emp.setEmpName("Washim");
		emp.setSalary(10000);
		emp.getAddress().add(new Address("Kolkata", "West Bengal", 700001));
		
		String status= dao.addEmployee(emp);
		
		System.out.println(status);
	}
	
	
	


}
