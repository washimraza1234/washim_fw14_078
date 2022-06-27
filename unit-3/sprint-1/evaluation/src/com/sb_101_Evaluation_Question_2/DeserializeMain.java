package com.sb_101_Evaluation_Question_2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeMain {
	
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee ss=(Employee) ois.readObject();
		System.out.println(ss);
		ois.close();
	}
}
