package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String email;
	private String address;
	private Double balance;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	public Account(Integer id, String email, String address, Double balance) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.balance = balance;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + "]";
	}
	
	
	
}
