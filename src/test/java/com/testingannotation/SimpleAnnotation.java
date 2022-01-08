package com.testingannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {

	@BeforeSuite
		
	private void setUp() {
		System.out.println("setupconfig");
		
	}
	
	@BeforeTest
	private void browserlaunch() {

		System.out.println("browserlaunch");
		

	}
	@BeforeClass
	private void Url() {
		System.out.println("Link");

	}
	@BeforeMethod
	private void Login() {
		System.out.println("Login");

	}
	@Test
	private void SearchMobile() {
		System.out.println("searchmobile");

	}
	@Test
    private void SearchLaptop() {
		System.out.println("searchlaptop");

	}
	@Test
	private void searchtv() {
		System.out.println("searchtv");

	}
	
	@AfterMethod
	private void HomePage() {
		System.out.println("HomePage");

	}
	@AfterClass
	private void LogOut() {
		System.out.println("LogOut");

	}
	@AfterTest
	private void closebrowser() {
		System.out.println("closebrowser");
	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("deletecookies");

	}

}
