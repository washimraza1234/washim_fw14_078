package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;

public class RegisterEmployeeToDeptUsecase {
	
	public static void main(String[] args) throws EmployeeException, DepartmentException {
		
		EmployeeDao dao= new EmployeeDaoImpl();
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Please enter valid Employee ID and Department ID");
		
		int empid=sc.nextInt();
		int deptid=sc.nextInt();
		
		dao.registerEmployeeTODepartment(empid, deptid);
		
		System.out.println("Done...");
		
		
	}

}
