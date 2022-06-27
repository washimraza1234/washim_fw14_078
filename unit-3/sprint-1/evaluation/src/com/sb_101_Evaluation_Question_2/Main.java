package com.sb_101_Evaluation_Question_2;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
			Employee emp= new Employee("emp_001", "emp_A", new Address("West bengal", "Kolkata", 700001), "emp_A@gmail.com", "emp_A_p");
		
		
			FileOutputStream fos= new FileOutputStream("emp.txt",true);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			System.out.println("emp object is serialized");
		
	}
}
