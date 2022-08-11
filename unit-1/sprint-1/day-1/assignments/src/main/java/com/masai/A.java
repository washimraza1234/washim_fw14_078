package com.masai;

import java.util.Iterator;
import java.util.List;

public class A {
	
	
	private List<String> names;

	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public void show() {
		System.out.println("Inside showA of A...");
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
	}

}
