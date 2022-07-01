package com.assignment15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question1 {
	public static void main(String[] args) throws IOException {
		FileReader f= new FileReader("d://abc.txt");
		BufferedReader br= new BufferedReader(f);
		String s=br.readLine();
		while(s != null) {
			System.out.println(s);
			s= br.readLine();
		}
		br.close();
	}

}
