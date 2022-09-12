package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	private String name;
	private String email;
	private long mobile;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Course> courseList= new ArrayList<>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, String email, long mobile, List<Course> courseList) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courseList = courseList;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", courseList="
				+ courseList + "]";
	}

	
	

}
