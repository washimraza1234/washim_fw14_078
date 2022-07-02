package com.Question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question1 {
	
	//Reading a file using Path

//	public static void main(String[] args) throws IOException {
//		Path p = Paths.get("d://abc.txt");
//		List<String> list= Files.readAllLines(p);
//		System.out.println("Reading from the file");
//		for(String line:list) {
//		System.out.println(line);
//		}
//		}
//	
	public static void main(String[] args) throws IOException  {
		Path p = Paths.get("d://abc.txt");
		Stream<String> s= Files.lines(p);
		
		s.forEach(line->System.out.println(line));
		
		s.close();
		}
	
		
		
		
}

