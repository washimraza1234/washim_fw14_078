package com.masai.dao;

import java.util.List;

import com.masai.beans.Employee;
import com.masai.exceptions.EmployeeException;

public interface EmployeeService {

	public boolean saveEmployee(Employee emp);

	public List getAllEmployee();

	public Employee getEmployeeById(int empId)throws EmployeeException;

	public String deleteEmployeeById(int empId)throws EmployeeException;

}
