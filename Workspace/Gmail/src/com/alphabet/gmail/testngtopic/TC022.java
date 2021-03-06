package com.alphabet.gmail.testngtopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class TC022 extends BasicSettings {		//		Soft Assert

	@Test
	public void testValidLogin() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Incorrect title.....");
		//	in soft assert the code continues to execute even after the exception
		Reporter.log(driver.getTitle(), true);
		mySleepInSeconds(5);
		driver.close();
		sa.assertAll();
		
	}
	
}
