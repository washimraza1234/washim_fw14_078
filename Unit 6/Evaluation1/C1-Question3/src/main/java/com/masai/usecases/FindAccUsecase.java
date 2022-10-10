package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;

public class FindAccUsecase {
	
	public static void main(String[] args) {
		AccountDao acc= new AccountDaoImpl();
		
		System.out.println("Enter Accoount id");
		
		Scanner sc= new Scanner(System.in);
		
		int id= sc.nextInt();
		
		acc.findById(id);
	}

}
