package com.alphabet.gmail.webelementmethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ElementScreenshotWithSystemDate extends BasicSettings {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = setUp();

		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.toString().replace(":" , "-");
		System.out.println(date);
		
		
		File srcFile = driver.findElement(By.id("loginButton")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/loginbutton" + date + ".png");
		
		FileUtils.copyFile(srcFile, destFile);
		
		
//		mySleepInSeconds(2);
		driver.close();
		
	}
	
	
}
