package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		Employee empp = dao.save(emp);

		if (empp != null) {
			return empp;
		} else
			throw new EmployeeException("Employee not Registered...!");
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {

		Optional<Employee> opt = dao.findById(empId);

		if (opt.isPresent()) {
			Employee em = opt.get();
			return em;
		} else
			throw new EmployeeException("Employee not found with empId: " + empId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		List<Employee> emp = dao.findAll();

		if (emp.size() > 0) {
			return emp;
		} else
			throw new EmployeeException("Employees are not available..");
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> emp = dao.findById(empId);

		if (emp.isPresent()) {
			Employee existingemp = emp.get();
			dao.delete(existingemp);
			return existingemp;
		}

		else
			throw new EmployeeException("No employee is available with empId: " + empId);
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		List<Employee> emp = dao.findByAddress(address);

		if (emp.size() > 0) {
			return emp;
		} else
			throw new EmployeeException("No employee with address: " + address);
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		Optional<Employee> opt = dao.findById(emp.getEmpId());

		if (opt.isPresent()) {
			return dao.save(emp);
		}

		else {
			throw new EmployeeException("Invalid Details...");
		}
	}

	@Override
	public Employee getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		Employee  result = dao.getEmpNameandAdress(empId);
		
		
		if(result != null) {
			return result;
		}
		else {
			throw new EmployeeException("No employee with empid: "+empId);
		}
		

	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		List<EmployeeDTO> emp= dao.getEmpNameAddrSal();
		
		if(emp.size() > 0) {
			return emp;
		}
		
		else 
		 throw new EmployeeException("No details available");
	}

}
