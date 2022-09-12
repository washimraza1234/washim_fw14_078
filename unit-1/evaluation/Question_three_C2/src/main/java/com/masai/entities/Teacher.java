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
	private int teacherId;
	private String teacherName;
	private int noYearOfExperince;
	private String email;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private Course course;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teacherId, String teacherName, int noYearOfExperince, String email) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.noYearOfExperince = noYearOfExperince;
		this.email = email;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getNoYearOfExperince() {
		return noYearOfExperince;
	}

	public void setNoYearOfExperince(int noYearOfExperince) {
		this.noYearOfExperince = noYearOfExperince;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", noYearOfExperince="
				+ noYearOfExperince + ", email=" + email + "]";
	}
	
	


}
