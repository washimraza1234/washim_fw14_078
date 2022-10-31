package com.masai;

import java.util.Objects;

public class Student {

	private Integer roll;
	private String name;
	private String address;
	private String email;
	private Integer marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer roll, String name, String address, String email, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
		this.marks = marks;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", marks="
				+ marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, email, marks, name, roll);
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
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(marks, other.marks) && Objects.equals(name, other.name)
				&& Objects.equals(roll, other.roll);
	}
	
	

}
