package com.masai.services;

import com.masai.entities.Employee;
import com.masai.entities.Manager;
import com.masai.exceptions.EmployeeException;

public interface EmployeeService {

	public Employee getEmployeeById(Integer id) throws EmployeeException ;
	
	public Manager findEmployeeReportingManager(Integer id) throws EmployeeException;
}
