package com.assignment5;

//import java.util.Scanner;

public class A {
	
	public int add(int[] b) {
		
		int max=b[0];
		for(int i=0;i<b.length;i++) {
			
				if(b[i]>max) {
					max=b[i];
				}
			
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a= {100,4,344,43};
		A arr= new A();
		int ans=arr.add(a);
		System.out.println(ans);
	}
}
