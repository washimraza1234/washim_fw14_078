package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class FindAccUseCase {
	
	public static void main(String[] args) {
		
		AccountDao dao= new AccountDaoImpl();
		
	
		Scanner sc= new Scanner(System.in);
		
		int accid= sc.nextInt();
		System.out.println("Enter account ID"+accid);
		
		Account acc= dao.findById(accid);
		
		if(acc != null) {
			System.out.println(acc);
		}
		else
			System.out.println("Invalid account details with id: "+accid);
		
	}

}
