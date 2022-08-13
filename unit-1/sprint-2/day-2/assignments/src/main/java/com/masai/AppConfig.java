package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	
	@Bean
	public B getB() {
		B b1= new B();
		
		
		return b1;
		
	}
	
	
	@Bean("clist")
	public List<String> getList(){
		List<String> list= new ArrayList<String>();
		
		list.add("Kolkata");
		list.add("Chennai");
		list.add("Hyderabad");
		
		return list;
	}

}
