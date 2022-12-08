package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.CourseException;
import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService sService;
	
	
	
	@PostMapping("/courses/{cnme}")
	public ResponseEntity<Student> registertudentInCourseHandler(@PathVariable("cnme") String cname, @RequestBody Student std) throws CourseException{
		Student st= sService.registerStudentInCourse(cname, std);
		
		return new ResponseEntity<Student>(st,HttpStatus.CREATED);
	}
}
