package com.masai;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private List<Student> theList;

	@Autowired
	private Map<Student, Course> theMap;

	@Value("${q2.appName}")
	private String appName;

	public List<Student> printList() {
		return theList;
	}

	public Map<Student, Course> printMap() {
		return theMap;
	}

	public String printAppName() {
		return appName;
	}

}
