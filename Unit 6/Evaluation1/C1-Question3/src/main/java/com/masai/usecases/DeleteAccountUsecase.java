package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;

public class DeleteAccountUsecase {

	
	public static void main(String[] args) {
		
		AccountDao dao= new AccountDaoImpl();
		
		System.out.println("Enter account id to delete");
		
		Scanner sc= new Scanner(System.in);
		
		int id= sc.nextInt();
		
		dao.deleteAccountById(id);
	}
}
