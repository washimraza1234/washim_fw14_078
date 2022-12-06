package com.masai;

public class Calculator {
	
	public int addIntegers(int a, int b) {
		return a+b;
	}
	
	public int multiplyIntegers(Object obj1, Object obj2){
		int a=0;
		int b=0;
		
		if(obj1 instanceof Integer && obj2 instanceof Integer) {
			a= (Integer)obj1;
			b= (Integer)obj2;
		}else {
			throw new ClassCastException("Entered values are wrong");
		}
		return a*b;
	}
	
	public static void main(String[] args){
		Calculator calculator= new Calculator();
		System.out.println(calculator.addIntegers(12, 12));
		System.out.println(calculator.multiplyIntegers("", 2));
	}

}
