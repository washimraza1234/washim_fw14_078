package coma.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.Employee;
import com.masai.exceptions.ManagerException;
import com.masai.services.ManagerService;

@RestController
@RequestMapping("/api")
public class ManagerController {
	
	@Autowired
	private ManagerService managerService;
	
	@GetMapping("/get-all-reportees/{id}")
	public ResponseEntity<Employee> getEmployeeReportingManagerHandler(@PathVariable("id") Integer id) throws ManagerException{
		Employee emp= managerService.findEmployeeReportingManager(id);
		return new ResponseEntity<Employee>(emp,HttpStatus.FOUND);
	}

}
