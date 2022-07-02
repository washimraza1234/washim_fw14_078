package com.Question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		Student student = new Student(001, "std001", new Address("WB", "Kolkata", "741190"), "std001@mail.com", "1234");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));

		oos.writeObject(student);

		System.out.println("Object Serialized");

		
		  ObjectInputStream ois= new ObjectInputStream(new
		  FileInputStream("student.txt"));
		  
		  student = (Student)ois.readObject();
		  
		  System.out.println(student.toString());
		  
		  System.out.println(student.getEmail());
		  System.out.println(student.getPassword());
		 
	}
}
