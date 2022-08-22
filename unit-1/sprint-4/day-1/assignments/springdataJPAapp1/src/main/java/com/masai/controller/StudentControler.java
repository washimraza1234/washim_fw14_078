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

import com.masai.model.Student;
import com.masai.service.Studentservice;

@RestController
public class StudentControler {

	@Autowired
	private Studentservice sService;
	
	
	@PostMapping("/students")
	public ResponseEntity<Student> saveStudentHandler(@RequestBody Student student){
		
		
		Student savedStudent= sService.saveStudent(student);
		return new ResponseEntity<Student>(savedStudent,HttpStatus.CREATED);
	}
	
	@GetMapping("/students/{roll}")
	public Student getStudentByRoll(@PathVariable("roll") Integer roll) {
		
		return sService.getStudentByRoll(roll);
		
	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentDetailsHandler(){
		List<Student> students= sService.getAllStudent();
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable("roll") Integer roll){
		
		Student student= sService.deleteStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student,HttpStatus.GONE);
	}
	
	
	@PutMapping("/students/{roll}")
	public Student updateStudentMarks(@PathVariable("roll") Integer roll, @RequestParam("marks") Integer marks) {
		
		return sService.updateStudent(roll, marks);
		
	}
	
	
}
