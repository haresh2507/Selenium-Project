package com.testingannotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"username","password"})
	
	private void login(@Optional("HareshVijay")String username , String password ) {
		System.out.println("Enter The Login");
		System.out.println("Username :"+ username);
		System.out.println("Password:"+ password);
		
	}

}


