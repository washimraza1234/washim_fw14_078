package com.masai;

public class B {
	
	
	private A a;
	
	
	
	public B(A a) {
		super();
		this.a = a;
	}



	public void funB() {
		System.out.println("Inside function of funB");
		System.out.println(a);
	}

}
