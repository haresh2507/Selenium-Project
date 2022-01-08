package com.testingannotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	String actual = "haresh";
	String excepted = "Haresh";
	
	@Test
	private void test1() {
		System.out.println("Test1 started");
		Assert.assertEquals(actual, excepted);
		System.out.println("Test2 started");
	}
	@Test
	private void test2() {
		SoftAssert te = new SoftAssert();
		System.out.println("Test2 started");
		te.assertEquals(actual, excepted);
		System.out.println("Test2 complete");
		te.assertAll();
	}

}
