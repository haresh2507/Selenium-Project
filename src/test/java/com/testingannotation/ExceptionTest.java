package com.testingannotation;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test
	private void maths() {
		int a= 10/0;

	}
	@Test
	private void add() {
		int a = 2+2;
	}
	
	@Test(expectedExceptions =Exception.class  )
	private void divide() {
		int a = 9/0;

}
}
