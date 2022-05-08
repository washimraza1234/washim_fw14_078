package com.assignment9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
//		int count = 0;
//		Pattern p = Pattern.compile("ab");
//		Matcher m = p.matcher("abaaaaaaccbcc");
//		System.out.println(m.find());
//		while (m.find()) {
//		count++;
//		System.out.println(m.start() + "------" + m.end() + "------" + m.group());
//		}
//		System.out.println("The no of occurences:" + count);
		
//		System.out.println(Pattern.matches("[^amn] " , "a"));
		
		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("Hello how are you");
//		Matcher m= p.matcher("Hello how are you");
		
		for(String s1:s) {
		System.out.println(s1);
		}

	}
}
