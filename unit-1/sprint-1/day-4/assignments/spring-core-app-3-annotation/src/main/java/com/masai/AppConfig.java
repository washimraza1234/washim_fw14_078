package com.masai;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//CONFIGURATION class instead of file
@PropertySource("a1.properties")
@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
	
	@Bean(name = "cities")
	public List<String> getCities(){
		return Arrays.asList("Kolkata","banglore","delhi");
	}
	
	
	@Bean(name = "numbers")
	public List<String> getNumbers(){
		return Arrays.asList("ONe","two","three");
	}
	
	//we can also apply bean to register its object in any class
	//use bean when we don't use sterotype annotation in classes,, use @bean to register the object
	// with spring container
//	@Bean
//	public B getObject() {
//		return new B();
//	}

}
