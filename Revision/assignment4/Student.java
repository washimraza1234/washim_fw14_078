package com.masai.assignment4;

public class Student {
	
	
	
	Integer id;
	String name;
	int marks;
	
	String section;
	
	Address addr;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, int marks, String section, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.section = section;
		this.addr = addr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", section=" + section + ", addr=" + addr
				+ "]";
	}
	
	

}
