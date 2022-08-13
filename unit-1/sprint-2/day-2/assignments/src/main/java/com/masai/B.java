package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Scope("prototype")
@Service
public class B {

	@Autowired
	private A aa;
	
	@Autowired
	private List<String> list;

//	@Value("${name}")
//	private String name;
//	
	@Autowired
	private Environment env;
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Inside post construct method...!!");
	}
	
	
	
	
	public void funB() {
		System.out.println("Inside function of B...");
		aa.funA();
		System.out.println(list);
		System.out.println(env.getProperty("name"));
		System.out.println(env.getProperty("roll"));

		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Inside function of preDestroy");
	}
	
}
