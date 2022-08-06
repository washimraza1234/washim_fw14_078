package com.masai;

public class DrawShape {
	
	// Dependency variable
	
	Shape s;

	
	
	
	
	public DrawShape(Shape s) {
		super();
		this.s = s;
	}





	public void drawShape() {
		s.draw();
	}
	
	

}
