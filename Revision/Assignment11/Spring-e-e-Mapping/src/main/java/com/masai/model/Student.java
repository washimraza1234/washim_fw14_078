package com.masai.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	
	@Embedded
	private Address addr;
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Course> courses= new HashSet<>();
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public Student(Integer roll, String name, Integer marks, Address addr, Set<Course> courses) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.addr = addr;
		this.courses = courses;
	}



	public Integer getRoll() {
		return roll;
	}



	public void setRoll(Integer roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getMarks() {
		return marks;
	}



	public void setMarks(Integer marks) {
		this.marks = marks;
	}



	public Address getAddr() {
		return addr;
	}



	public void setAddr(Address addr) {
		this.addr = addr;
	}



	public Set<Course> getCourses() {
		return courses;
	}



	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}




	@Override
	public int hashCode() {
		return Objects.hash(addr, marks, name, roll);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(marks, other.marks)
				&& Objects.equals(name, other.name) && Objects.equals(roll, other.roll);
	}



	



	

	
	
	
	
	
	
	
	
	
	
}
