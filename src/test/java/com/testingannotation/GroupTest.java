package com.testingannotation;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "Selenium")
	private void selenium1() {
		
System.out.println("LoginTest");
	}
	@Test(groups = "Git")
	private void git1() {
		
System.out.println("gittest1");
	}
	@Test(groups = "API")
	private void api1() {
		
System.out.println("apitest");
	}
	@Test(groups = "Selenium")
	private void selenium2() {
		
System.out.println("LogoutTest");
	}
	@Test(groups = "Git")
	private void git2() {
		
System.out.println("gittest2");
	}
	@Test(groups = "API")
	private void api2() {
		
System.out.println("apitest2");
	}
	
	

}
