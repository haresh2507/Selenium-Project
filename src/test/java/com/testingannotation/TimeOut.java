package com.testingannotation;

import org.testng.annotations.Test;
;
public class TimeOut {

	
	@Test(timeOut = 2000)
	private void searchtv() {
		System.out.println("searchtv");
		
	}
	@Test(timeOut = 5000)
	private void searchlap() {
		System.out.println("searchlap");



}
		
}
