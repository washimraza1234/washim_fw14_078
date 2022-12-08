package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo eRepo;

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		Employee emps = eRepo.save(emp);

		if (emps != null) {
			return emps;
		} else
			throw new EmployeeException("No Employees are resgistered...!");
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt = eRepo.findById(empId);

		if (opt.isPresent()) {
			return opt.get();
		} else
			throw new EmployeeException("Enter a valid employee ID");
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		List<Employee> emps = eRepo.findAll();

		if (emps.size() == 0) {
			throw new EmployeeException("No Employees Available...");
		} else {
			return emps;
		}
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> opt = eRepo.findById(empId);

		if (opt.isPresent()) {
			Employee existingEmp = opt.get();
			eRepo.delete(existingEmp);
			return existingEmp;
		}

		else
			throw new EmployeeException("Enter a Valid ID");
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {

		Employee emp = new Employee();
		if (emp.getEmail() == email && emp.getPassword() == password) {
			return emp;
		} else
			throw new EmployeeException("Invalid Details...");

	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		List<Employee> emps = eRepo.findByAddress(address);

		if (emps.size() == 0) {

			throw new EmployeeException("No Employees...");

		} else
			return emps;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		Optional<Employee> opt= eRepo.findById(emp.getEmpId());
		
		if(opt.isPresent()) {
			Employee updatedEmp= eRepo.save(emp);
			return updatedEmp;
		}
		else
			throw new EmployeeException("No employee avaiable...");
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		String employees= eRepo.getNameAndAddrbyID(empId);
		
		if(employees !=null) {
			return employees;
		}
		else
			throw new EmployeeException("No details...");
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		List<EmployeeDTO> dto= eRepo.getNameAddressSalaryOfAllEmp();
		
		if(dto.size()==0) {
			throw new EmployeeException("No details available");
		}
		else
			return dto;
	}

}
