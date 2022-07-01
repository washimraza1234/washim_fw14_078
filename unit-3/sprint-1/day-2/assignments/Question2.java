package com.assignment15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question2 {
	public static void main(String[] args) throws IOException {
			File f= new File("d://abc.txt");
			FileReader fr= new FileReader(f);
			
			char[] ch= new char[(int)f.length()];
			
			fr.read(ch);
			
			for(char c:ch) {
				System.out.print(c);
			}
			fr.close();
	}
	
}
