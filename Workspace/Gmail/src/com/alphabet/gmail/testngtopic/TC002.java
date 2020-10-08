package com.alphabet.gmail.testngtopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002 {			//		TestNG program to check Flaky Test Cases
	
	@Test(invocationCount=3, description="Test Case to Test Login with Valid Login Credentials")		//		invocationCount is used to repeat the test case for the required number of times with same test data
	public void testValidLogin() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}
	
	//	Invocation is used to execute same test case multiple times with same test data
	//	Default invocation will be 1
	//	If invocation count is 0 or -ve then the test case wont run
	//	Decimal numbers are not allowed
	//	Variables are not allowed (But final variables are allowed)

}
