package com.assignment9;

import java.io.IOException;

public class Demo {
//function to check if person is eligible to vote or not
	public static void validate(int age) throws IOException {
		if (age < 18) {
//throw IOException if not eligible to vote
			throw new IOException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

//main method
	public static void main(String args[]) {
//calling the function
		try {
			validate(13);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
	}
}
