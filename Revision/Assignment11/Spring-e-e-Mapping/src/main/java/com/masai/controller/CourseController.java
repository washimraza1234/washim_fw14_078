package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Course;
import com.masai.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService cSer;
	
	@PostMapping("/courses")
	public ResponseEntity<Course> saveCourseHandler(@RequestBody Course course) {
		Course courses= cSer.registerNewCourse(course);
		
		return new ResponseEntity<Course>(courses,HttpStatus.CREATED);
	}

}
