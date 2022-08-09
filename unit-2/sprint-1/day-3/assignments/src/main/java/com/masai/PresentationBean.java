package com.masai;

public class PresentationBean {

	
	private ServiceBean value;
	
	private int a;
	private int b;
	
	
	
	
	public PresentationBean(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public void setValue(ServiceBean value) {
		this.value = value;
	}


	public void showResult() {
		System.out.println("Sum is: "+value.sum(a, b));
		
	}

	
}
