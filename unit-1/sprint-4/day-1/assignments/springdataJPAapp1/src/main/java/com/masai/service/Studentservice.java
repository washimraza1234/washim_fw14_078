package com.masai.service;

import java.util.List;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;

public interface Studentservice {
	
	public Student saveStudent(Student student);
	public Student getStudentByRoll(Integer roll) throws StudentException;
	public List<Student> getAllStudent() throws StudentException;
	public Student deleteStudentByRoll(Integer roll) throws StudentException;
	public Student updateStudent(Integer roll, Integer graceMarks) throws StudentException;
	
	
}
