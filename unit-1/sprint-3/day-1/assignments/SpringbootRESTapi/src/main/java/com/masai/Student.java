package com.masai;

public class Student {
	
	private String name;
	private int roll;
	private String branch;
	
	public Student(String name, int roll, String branch) {
		super();
		this.name = name;
		this.roll = roll;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	

}
