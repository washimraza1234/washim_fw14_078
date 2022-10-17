package com.masai.dao;

import com.masai.entities.Course;
import com.masai.entities.Student;
import com.masai.exceptions.CourseException;

public interface TrainingDao {

	public void addCourse(Course course);

	public void registerStudent(Student student, Course courseId)throws CourseException;

}
