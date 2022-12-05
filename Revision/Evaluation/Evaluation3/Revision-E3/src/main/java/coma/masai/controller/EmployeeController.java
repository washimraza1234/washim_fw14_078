package coma.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.Employee;
import com.masai.entities.Manager;
import com.masai.exceptions.EmployeeException;
import com.masai.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get-employees/{id}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("id") Integer id) throws EmployeeException{
		Employee emps= employeeService.getEmployeeById(id);
		return new ResponseEntity<Employee>(emps,HttpStatus.FOUND);
	}
	
	@GetMapping("/get-employee-manager/{id}")
	public ResponseEntity<Manager> getEmpReportingManagerHandler(@PathVariable("id") Integer id) throws EmployeeException{
		Manager manager= employeeService.findEmployeeReportingManager(id);
		return new ResponseEntity<Manager>(manager,HttpStatus.FOUND);
	}

}
