package com.masai.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Student {
	
	private String name;
	
	@Min(value = 100, message = "MInimum value should be 100")
	@Max(value = 1000, message = "Maximum value is 1000")
	private Integer roll;
	
	
	private Integer marks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name, Integer roll, Integer marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getRoll() {
		return roll;
	}


	public void setRoll(Integer roll) {
		this.roll = roll;
	}


	public Integer getMarks() {
		return marks;
	}


	public void setMarks(Integer marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}


	
	
	

}
