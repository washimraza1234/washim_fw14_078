package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;

public class DepositUsecase {

	public static void main(String[] args) {
		
		AccountDao dao= new AccountDaoImpl();
		
		System.out.println("Enter amount and id");
		
		Scanner sc= new Scanner(System.in);
		
		Double amount= sc.nextDouble();
		
		int id= sc.nextInt();
		
		dao.deposit(amount, id);
	}
}
