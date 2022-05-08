package com.assignment10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DOB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your date of birth in dd-MM-yyyy format");
		String dob = sc.next();
		try {
			LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate c1 = LocalDate.now();
			Period p = Period.between(d1, c1);
			if(p.getDays()<0) {
				System.out.println("Date Should not be in the future");
			}
		} catch (Exception e) {
			System.out.println("Please enter Date of bith in valid pattern");
		}
	}
}
