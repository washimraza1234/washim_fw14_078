package com.masai.entities;

import javax.persistence.Entity;

@Entity
public class ConractualEmployee extends Employee{
	
	private int noOfWorkingDays;
	private Integer costofperday;
	private String mobileNumber;
	
	public ConractualEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ConractualEmployee(int noOfWorkingDays, Integer costofperday, String mobileNumber) {
		super();
		this.noOfWorkingDays = noOfWorkingDays;
		this.costofperday = costofperday;
		this.mobileNumber = mobileNumber;
	}

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public Integer getCostofperday() {
		return costofperday;
	}

	public void setCostofperday(Integer costofperday) {
		this.costofperday = costofperday;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "ConractualEmployee [noOfWorkingDays=" + noOfWorkingDays + ", costofperday=" + costofperday
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
	

}
