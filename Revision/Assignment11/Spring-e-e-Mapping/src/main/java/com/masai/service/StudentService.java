package com.masai.service;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public interface StudentService {

	
	public Student registerStudentInCourse(String cname, Student student) throws CourseException;
}
