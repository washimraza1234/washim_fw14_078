package com.Question3;

public class Deposit extends Thread{
//	amount: int;
//	account: Account;

	int amount;
	Account account;
	
	public Deposit() {
		// TODO Auto-generated constructor stub
	}

	public Deposit(int amount, Account account) {
		super();
		this.amount = amount;
		this.account = account;
	}
	
	@Override
		public void run() {
			// TODO Auto-generated method stub
			account.deposit(amount);
		}
	
}
