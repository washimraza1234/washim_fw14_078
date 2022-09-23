package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


//dependent class

@Service
public class A {

//	@Value("${name}")
//	private String nme;
	
	@Autowired
	private Environment env;
	
	
	@Autowired  // Dependency
	private B b1;
	
	@Autowired
	@Qualifier("cities")
	private List<String> list;
	
	
	@Autowired
	@Qualifier("numbers")
	private List<String> numList;
 	
	public void funA() {
		System.out.println("Inside funA of class A");
		b1.funB();
		System.out.println(list);
		System.out.println(numList);
		
//		System.out.println(nme);
		
		System.out.println(env.getProperty("roll"));
	}
}
