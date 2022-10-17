package com.masai.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Teacher {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teacherId;
	private String teacherName;
	private Integer noYearOfExperince;
	private String email;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Course course;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(Integer teacherId, String teacherName, Integer noYearOfExperince, String email, Course course) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.noYearOfExperince = noYearOfExperince;
		this.email = email;
		this.course = course;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getNoYearOfExperince() {
		return noYearOfExperince;
	}

	public void setNoYearOfExperince(Integer noYearOfExperince) {
		this.noYearOfExperince = noYearOfExperince;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", noYearOfExperince="
				+ noYearOfExperince + ", email=" + email + ", course=" + course + "]";
	}
	
	
	
	
	
	


}
