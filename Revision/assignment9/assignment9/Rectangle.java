package com.masai.assignment9;

public class Rectangle implements ShapeDrawer{
	
	@Override
	public void draw() {
		System.out.println("Circle is drawn");
		
	}

	
	public void area(int length, int breadth) {
		
		System.out.println("Area is :"+ length*breadth);
	}
	
	public void perimeter(int len, int breadth) {
		System.out.println("Perimeter is :"+ 2*(len+breadth));
		draw();
	}

}
