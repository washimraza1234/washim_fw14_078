package com.evalualation.q4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Birthday {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Date of birth in dd-MM-yyyy format");
		
		String dob = sc.next();
		
		try
		{
			LocalDate date1 = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy") );
			
			LocalDate date2 = LocalDate.now();
			
			Period age = Period.between(date1, date2);
			
			if(age.getYears()>=18)	
			{
				if(date1.getDayOfMonth()==date2.getDayOfMonth()&&date1.getMonth().equals(date2.getMonth()))
				{
					System.out.println("Happy Birthday, You are eligible to cast your vote");
				}	
				else
				{
					System.out.println("You are eligible to cast your vote");
				}
			}
			
			else if(date2.getYear()<date1.getYear())
			{
				System.out.println("Date of birth should not be in future");
			}
			else
			{
				System.out.println("You are not eligible to cast your vote");
			}
		}
		catch(Exception e)
		{
			System.out.println("Please pass the date in the proper format");
		}
		
		sc.close();
	}
	
}
