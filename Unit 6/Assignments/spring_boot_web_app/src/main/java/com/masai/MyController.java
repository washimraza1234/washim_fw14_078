package com.masai;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller  //Container Register as spring bean class

@RestController // By using this annotation we can access the raw data instead of JSP
// No need to use @ResponseBody
// (@Controller + @ResponseBody)


@RequestMapping("/stdApp") // Root resource;
public class MyController {
	
	
	
	@RequestMapping("/hello")
	//@ResponseBody //to get the raw data instead of searching for JSP.
	public String sayHello() {
		return "Welcome to spring boot...";
	}
	
	
	//@RequestMapping(value = "students", method = RequestMethod.GET , produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping("/students")  // RquestMapping+value+method
	public List<Student> student() {
		List<Student> students= new ArrayList<>();
		
		students.add(new Student(1, "Washim"));
		students.add(new Student(2, "Raza"));
		students.add(new Student(3, "Richa"));
		students.add(new Student(4, "Kuheli"));
		
		return students;
	}
	
	@GetMapping("/std/{roll}")
	public ResponseEntity<Student> studentDetailsHandler(@PathVariable("roll") int roll) {
		HttpHeaders hd= new HttpHeaders();
		hd.add("user", "123ww");
		
		 return new ResponseEntity<Student>(new Student(roll, "Rahul"),hd, HttpStatus.CREATED);
	}
	
	@GetMapping("/stds")
	public Student studentDetailsHandler(@RequestParam("roll") Integer roll,@RequestParam(value = "name", required = false) String name) {
		return new Student(roll, name);
	}
	
	
	@PostMapping("students")
	public ResponseEntity<String> insertStudents(@Valid @RequestBody List<Student> student) {
//		return "Inserted.."+ student.toString() ;
		return new ResponseEntity<String>("Inserted...!!"+student.toString(), HttpStatus.OK);
	}
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> studentDetailsHandler2(@PathVariable("roll") int roll) throws InvalidRollException {
		if(roll<100)
			throw new InvalidRollException("Enter valid roll...");
		
		//int res= roll/0;  // To handle the other exception using Exception class
		
		 return new ResponseEntity<Student>(new Student(roll, "Rahul"), HttpStatus.CREATED);
	}
	


}
