package com.Question3;

public class Account {
	int balance;
	int accountNo;

	public Account() {
	}

	
	  public Account(int balance, int accountNo) {
		 super();
		 this.balance = balance;
		 this.accountNo = accountNo;
	  
	  }
	 

	void displayBalance() {
		System.out.println(this.balance);
	}

	void deposit(int amount) {
		this.balance = amount;
		System.out.println("Deposited balance is: " + amount);
		displayBalance();
	}

	void withdraw(int amount) {
		this.balance = balance - amount;
		displayBalance();
	}

}
