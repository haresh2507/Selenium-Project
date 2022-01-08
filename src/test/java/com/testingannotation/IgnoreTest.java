package com.testingannotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Test
	private void searchmobile() {
		System.out.println("searchmobile");
	}

	@Test(enabled = false)
	private void searchlaptop() {
		System.out.println("searchlaptop");
	}
	@Ignore
	@Test
	private void searchtv() {
		System.out.println("searchtv");

	}
	@Test
	private void airpod() {
		System.out.println("airpod");

}
	}
