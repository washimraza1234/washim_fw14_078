package com.masai.assignment9;

public class Square implements ShapeDrawer{

	@Override
	public void draw() {
		System.out.println("Circle is drawn");
		
	}

	
	public void area(int len) {
		
		System.out.println("Area is :"+ len*len);
	}
	
	public void perimeter(int len) {
		System.out.println("Perimeter is :"+ 4 * len);
		draw();
	}

}
