package com.assignment3;

public class VowelAndConsonent {
	void check(String ans) {
		if(ans=="a" || ans=="e" || ans=="i" || ans=="o" || ans=="u" || ans=="A" || ans=="E" || ans=="I" || ans=="O" || ans=="U") {
			System.out.println(ans+" is Vowel");
		}
		else {
			System.out.println(ans+" is a Consonent");
		}
	}
public static void main(String[] args) {
	VowelAndConsonent d1= new VowelAndConsonent();
	d1.check("A");
	d1.check("b");
}
}
