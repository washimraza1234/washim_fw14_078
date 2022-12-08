package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseDao;
import com.masai.repository.StudentDao;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private CourseDao cDao;
	
	@Autowired
	private StudentDao sDao;
	
	@Override
	public Student registerStudentInCourse(String cname, Student student) throws CourseException {
		// here first we have to find if any if any course are available
		
		Course cou= cDao.findByCourseName(cname);
		
		if(cou != null) {
			cou.getStudents().add(student);
			student.getCourses().add(cou);
			return sDao.save(student);
		}
		else
			throw new CourseException("no course found with name :"+cname);
	}

}
