package com.testingannotation;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = -2)
	private void searchmobile() {
		System.out.println("searchmobile");
	}

	@Test(priority = -3 , enabled = false)
	private void searchlaptop() {
		System.out.println("searchlaptop");
	}
	@Test(priority = 4)
	private void searchtv() {
		System.out.println("searchtv");

	}
	@Test
	private void airpod() {
		System.out.println("airpod");

	
}
}
