package com.testingannotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	
		


@Test
private void flipkartlink() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HARESH VIJAY\\eclipse-workspace\\TestNG_Project007\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
}
	
	

}
