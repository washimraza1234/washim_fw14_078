package com.masai;

import java.util.Map;

public class CollegeMapTypeDependency {
	
	private Map<Student, String> theMap;

	public void setTheMap(Map<Student, String> theMap) {
		this.theMap = theMap;
	}
	
	public void show() {
		System.out.println("Inside showDetails of CollegemapDependency");
//		System.out.println(theMap);
		theMap.forEach((k,v) -> System.out.println("Key = "
                + k.toString() + ", Value = " + v));
	}

}
