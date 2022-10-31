package com.masai;

import java.util.Objects;

public class Course {
	private Integer courseId;
	private String courseName;
	private String duration;
	private Double fee;
	
	
	public Course() {
		// TODO Auto-generated constructor stub
	}


	public Course(Integer courseId, String courseName, String duration, Double fee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}


	public Integer getCourseId() {
		return courseId;
	}


	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public Double getFee() {
		return fee;
	}


	public void setFee(Double fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, duration, fee);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseId, other.courseId) && Objects.equals(courseName, other.courseName)
				&& Objects.equals(duration, other.duration) && Objects.equals(fee, other.fee);
	}
	
	

}
