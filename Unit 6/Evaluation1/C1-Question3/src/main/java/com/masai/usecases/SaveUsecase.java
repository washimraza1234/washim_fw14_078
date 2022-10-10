package com.masai.usecases;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class SaveUsecase {
	
	public static void main(String[] args) {
		
		AccountDao dao= new AccountDaoImpl();
		System.out.println("Enter account details..");
		
		Account acc= new Account();
		
		acc.setAddress("Kolkata");
		acc.setBalance(1200.0);
		acc.setEmail("washim@gmail.com");
		
		dao.save(acc);
	}

}
