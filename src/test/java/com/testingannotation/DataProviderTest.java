package com.testingannotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "logIndata")
	
	
	private void login(String username , String password ) {
		System.out.println("Enter The Login");
		System.out.println("Username :"+ username);
		System.out.println("Password:"+ password);
		

}
	
	@DataProvider
	private Object[][] logIndata() {
		return new Object[][] {
			{"AAA","111"},
			{"BBB","222"},
			{"CCC","333"}
		};

	}
	
}
