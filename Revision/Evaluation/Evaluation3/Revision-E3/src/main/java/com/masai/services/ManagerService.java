package com.masai.services;

import com.masai.entities.Employee;
import com.masai.exceptions.ManagerException;

public interface ManagerService {
	
	public Employee findEmployeeReportingManager(Integer id) throws ManagerException;

}
