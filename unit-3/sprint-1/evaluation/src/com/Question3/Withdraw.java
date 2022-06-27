package com.Question3;

public class Withdraw extends Thread{
	int amount;
	Account account;
	public Withdraw() {
		// TODO Auto-generated constructor stub
	}
	public Withdraw(int amount, Account account) {
		super();
		this.amount = amount;
		this.account = account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.withdraw(amount);
	}

}
