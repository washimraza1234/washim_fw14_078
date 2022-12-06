package com.masai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calculator=null;
	@BeforeEach
	public void beforeEach() {
		
		//this will run before each test cases;
		calculator= new Calculator();
	}
	
	@Test
	public void testaddInteger() {
		//Calculator calculator= new Calculator();
		assertEquals(24, calculator.addIntegers(12, 12));
	}

}
