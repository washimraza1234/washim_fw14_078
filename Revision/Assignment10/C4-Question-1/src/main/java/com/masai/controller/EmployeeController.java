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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eService;

	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee emp) throws EmployeeException {
		Employee emps = eService.registerEmployee(emp);

		return new ResponseEntity<Employee>(emps, HttpStatus.CREATED);
	}

	@GetMapping("/employees/{roll}")
	public ResponseEntity<Employee> getEmpByIDHandler(@PathVariable("roll") Integer roll) throws EmployeeException {

		Employee emp = eService.getEmployeeById(roll);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);

	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllStudents() throws EmployeeException {
		List<Employee> emps = eService.getAllEmployeeDetails();

		return new ResponseEntity<List<Employee>>(emps, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmpByIdHandler(@PathVariable("id") Integer empId) throws EmployeeException {

		Employee emp = eService.deleteEmployeeById(empId);

		return new ResponseEntity<Employee>(emp, HttpStatus.OK);

	}

	@GetMapping("/loginEmp")
	public ResponseEntity<Employee> loginEmpHandler(@RequestParam("email") String email,
			@RequestParam("password") String password) throws EmployeeException {

		Employee emp = eService.loginEmployee(email, password);
		return new ResponseEntity<Employee>(emp, HttpStatus.ACCEPTED);

	}

	@GetMapping("/getemps/{adr}")
	public ResponseEntity<List<Employee>> getEmpDetailsByAddressHandler(@PathVariable("adr") String addr)
			throws EmployeeException {
		List<Employee> emps = eService.getEmployeeDetailsByAddress(addr);

		return new ResponseEntity<List<Employee>>(emps, HttpStatus.FOUND);
	}

	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee emp) throws EmployeeException {

		Employee emps = eService.updateEmployee(emp);
		return new ResponseEntity<Employee>(emps, HttpStatus.OK);

	}

	@GetMapping("/emps/{empid}")
	public ResponseEntity<String> getNameandAddrByIdHandler(@PathVariable("empid") Integer empId)
			throws EmployeeException {

		String emp = eService.getNameAndAddressOfEmplyeeById(empId);
		return new ResponseEntity<String>(emp, HttpStatus.OK);

	}
	
	@GetMapping("/getNameAddrSal")
	public ResponseEntity<List<EmployeeDTO>> getNameAddrSAlofAllEmpHandler() throws EmployeeException{
		List<EmployeeDTO> dto= eService.getNameAddressSalaryOfAllEmployee();
		
		return new ResponseEntity<List<EmployeeDTO>>(dto,HttpStatus.FOUND);
	}
	
	
	
	
	
	
	
	

}
