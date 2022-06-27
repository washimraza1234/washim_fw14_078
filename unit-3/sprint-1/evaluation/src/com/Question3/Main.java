package com.Question3;

public class Main {
	
	public static void main(String[] args) {

		
		Deposit deposit= new Deposit(5000, new Account(1000,111));
		Withdraw withdraw = new Withdraw(900,new Account(1000,111));
		
		Thread thread1= new Thread(deposit);
		Thread thread2 = new Thread(withdraw);
		
		thread1.start();
		thread2.start();
		
	}

}
