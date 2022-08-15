package com.masai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller

@RestController // To make all the method return raw data.
// If we use @RestController then we not need the @ResponseBody which return data.

@RequestMapping("/studentapp") //rootresource and methods are resource;
public class MyController {
	
	
	//Request Handler
	//To make this method restful end point we provide URI annotation @RequestMapping with addressable
	// URI (/hello)
	@RequestMapping("/hello")
	
//	@ResponseBody // Convert web app to web service and returns only the data 
	public String sayHello() {
		return "Welcome babe"; // raw data
	}
	
	
//	@RequestMapping(value = "/student", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	
	@GetMapping( "/student/{name}/{roll}") // SHortcut
	public Student getStudent(@PathVariable("name") String name,
							  @PathVariable("roll") int roll) {
		return new Student(name, roll, "EQ");
	}

}
