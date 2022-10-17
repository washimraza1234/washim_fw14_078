package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exceptions.EmployeeException;

public class GetAllEmployeeUsecase {
	
	public static void main(String[] args) throws EmployeeException {
		
		EmployeeDao dao= new EmployeeDaoImpl();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter valid department name");
		
		String deptName= sc.next();
		
		List<Employee> emps= dao.getAllEmployeeWithDeptName(deptName);
		
		emps.forEach(emp->System.out.println(emp));
		
		System.out.println("Done");
		
	}

}
