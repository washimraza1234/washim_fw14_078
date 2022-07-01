package com.assignment15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) throws IOException {
		BufferedReader fr= new BufferedReader(new FileReader("d://abc.txt"));
		String ss=fr.readLine();
		int count=0;
		System.out.println(ss);
		
		  System.out.println("Enter a character to count");
		  Scanner sc= new Scanner(System.in);
		  String s= sc.next();
		  
		   
		  for(int i=0;i<ss.length();i++) { 
			  if(ss.charAt(i)==s.charAt(0))
				  count++; 
			  } 
		  System.out.println(count);
		 
		
		
	}

}
