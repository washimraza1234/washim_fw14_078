package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Department;
import com.masai.exceptions.DepartmentException;

public class GetDepartmentDetailsUsecase {

	public static void main(String[] args) throws DepartmentException {

		EmployeeDao dao = new EmployeeDaoImpl();

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter valid Employee ID");

	    Integer empid = sc.nextInt();

		Department dept= dao.getDepartmentDetailsByEmployeeId(empid);

		System.out.println(dept);
		
		System.out.println("Done");
	}

}
