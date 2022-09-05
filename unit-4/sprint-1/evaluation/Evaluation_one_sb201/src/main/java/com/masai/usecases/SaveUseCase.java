package com.masai.usecases;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class SaveUseCase {
	
	public static void main(String[] args) {
		
		AccountDao dao= new AccountDaoImpl();
		
		Account acc= new Account();
		
		acc.setAddress("Kolkata");
		acc.setBalance(12000);
		acc.setEmail("washim@gmail.com");
		
		String f= dao.save(acc);
		
		if(f != null) {
			System.out.println("Account Created");
		}
		
		else
			System.out.println("Something went wrong");
		
				
	}

}
