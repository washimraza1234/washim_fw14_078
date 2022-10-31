package com.masai;

public class Shape {

	Circle c;
	Triangle t;
	Cylinder clr;
	
	
	public void setC(Circle c) {
		this.c = c;
	}
	public void setT(Triangle t) {
		this.t = t;
	}
	public void setClr(Cylinder clr) {
		this.clr = clr;
	}
	
	public void draw() {
		t.triangle();
	}
	
}
