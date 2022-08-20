package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.masai.exception.InvalidRollExceptions;
import com.masai.model.Student;

@RestController
public class StudentController {
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome";
	}
	
	
	@GetMapping("/student/{r}")
	public Student getStudent(@PathVariable("r") Integer roll) {
		return new Student("Washim", roll, 780);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudentHandler(){
		
//		List<Student> students= new ArrayList<>();
//		
//		students.add(new Student("washim", 001, 890));
//		students.add(new Student("Riya", 002, 790));
//		students.add(new Student("Kuheli", 003, 690));
//		
//		
//		
//		return students;
		
		return Arrays.asList(
				
				new Student("washim", 001, 890),
				new Student("wa", 002, 390),
				new Student("washi", 003, 590)
				
				);
		
	}
	
	
	@GetMapping("/getStudent")
	public Student getStudentroll(@RequestParam(value = "r", required = false) Integer roll) {
		return new Student("Washim", roll, 780);
	}
	
	@PostMapping(value = "/students", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveStudents( @RequestBody Student student) {
		return "Student Stored :" +student;
	}
	
	@PutMapping(value = "/student/{roll}")
	public Student updateStudentMarksWithRoll(@RequestBody Student student ,@PathVariable("roll") int roll) {
		
		student.setMarks(student.getMarks()+500);
		
		return student;
		
	}
	
	@GetMapping("/studentroll/{r}")
	public Student exceptionFun(@PathVariable("r") Integer roll) {
//		if(roll<100) {
//			throw new InvalidRollExceptions("Roll is not valid");
//		}
		return new Student("washimm", roll, 123);
	}
	
	@PostMapping("/studentDetails")
	public ResponseEntity<String> saveStudenthandler(@Valid @RequestBody Student student){
		String res= student+"Student Stored successfully";
		
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
	}
	
	

}
