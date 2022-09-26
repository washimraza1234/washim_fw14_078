package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmpHandler(@RequestBody Employee emp) throws EmployeeException{
		
		Employee empp= empService.registerEmployee(emp);
		
		return new ResponseEntity<Employee>(empp,HttpStatus.CREATED);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> findEmpByIdHandler(@PathVariable("id") Integer empId) throws EmployeeException{
		Employee emp= empService.getEmployeeById(empId);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.FOUND);
		
		
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> findAllEmployeeHandler() throws EmployeeException{
		
		List<Employee> emp= empService.getAllEmployeeDetails();
		
		return new ResponseEntity<List<Employee>>(emp,HttpStatus.FOUND);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmpHandler (@PathVariable("id") Integer empid) throws EmployeeException{
		Employee emp= empService.deleteEmployeeById(empid);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	}
	
	
	@GetMapping("employeesbyaddress/{addr}")
	public ResponseEntity<List<Employee>> findEmpByAddress(@PathVariable("addr") String address) throws EmployeeException {
		
		List<Employee> emps= empService.getEmployeeDetailsByAddress(address);
		
		return new ResponseEntity<List<Employee>>(emps,HttpStatus.FOUND);
	}
	
	
	@PutMapping("/employee")
	public ResponseEntity<Employee> updateEmpHandler(@RequestBody Employee employee) throws EmployeeException{
		
		 Employee emp= empService.updateEmployee(employee);
		 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		 
	}
	
	
	@GetMapping("/getemployee/{id}")
	public ResponseEntity<Employee> findNameandMArksbyrollhandler(@PathVariable("id") Integer empid) throws EmployeeException{
		
		Employee emp= empService.getNameAndAddressOfEmplyeeById(empid);
		return new ResponseEntity<Employee>(emp,HttpStatus.FOUND);
	}
	
	
	@GetMapping("/getempss")
	public ResponseEntity<List<EmployeeDTO>> getNameAddrSalofEmpHandler() throws EmployeeException{
		
		
		List<EmployeeDTO> emps= empService.getNameAddressSalaryOfAllEmployee();
		
		return new ResponseEntity<List<EmployeeDTO>>(emps, HttpStatus.OK);
	}
	

}
