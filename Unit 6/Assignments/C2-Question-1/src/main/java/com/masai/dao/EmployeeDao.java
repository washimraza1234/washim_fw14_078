package com.masai.dao;

import java.util.List;

import com.masai.entities.Department;
import com.masai.entities.Employee;
import com.masai.exceptions.DepartmentException;
import com.masai.exceptions.EmployeeException;

public interface EmployeeDao {

	public void addDepartment(Department dept);

	public void addEmployee(Employee emp);

	public void registerEmployeeTODepartment(int empId, int deptId)throws EmployeeException, DepartmentException;

	public List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException;
	
	public Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentException;


}
