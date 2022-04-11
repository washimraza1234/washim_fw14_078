package com.evaluation1;

public class Course {
	

	int courseId;
	String courseName;
	int courseFee;
	

	void displayCourseDetails() {
		System.out.println("CourseID: "+ courseId);
		System.out.println("CourseName: "+ courseName);
		System.out.println("CourseFee: "+ courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username.equals("Admin") && password.equals("1234")) {
			Course d1= new Course();
			d1.courseId=12345;
			d1.courseName="Java Backend";
			d1.courseFee=2000;
			d1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	public static void main(String[] args) {
		
		authenticate("Admin","1234");
		authenticate("admin","123");
	}

}
