package com.masai.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entities.Employee;
import com.masai.entities.Manager;
import com.masai.exceptions.EmployeeException;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeDao;
	
	@Override
	public Employee getEmployeeById(Integer id) throws EmployeeException {
		Optional<Employee> opt= employeeDao.findById(id);
		
		if(opt.isPresent()) {
			Employee emp= opt.get();
			return emp;
		}
		else {
			throw new EmployeeException("Employee Not Found with ID: "+id);
		}
	}

	@Override
	public Manager findEmployeeReportingManager(Integer id) throws EmployeeException {
		Optional<Employee> opt= employeeDao.findById(id);
		if(opt.isPresent()) {
			Employee emp= opt.get();
			return emp.getManager();
		}
		
		else {
			throw new EmployeeException("Employee Not present with ID: "+id);
		}
	
	}

}
