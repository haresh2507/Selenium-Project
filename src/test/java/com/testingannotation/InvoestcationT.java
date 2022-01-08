package com.testingannotation;

import org.testng.annotations.Test;

public class InvoestcationT {


	@Test(invocationCount = 3)
	private void searchmobile() {
		System.out.println("searchmobile");
	}

	@Test(invocationCount = 5 , priority = -3)
	private void searchlaptop() {
		System.out.println("searchlaptop");
	}
	
	@Test
	private void searchtv() {
		System.out.println("searchtv");

	}
	@Test(invocationCount = 2)
	private void airpod() {
		System.out.println("airpod");

			}
}


