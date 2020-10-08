package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class CreateAWindowNameForParentWindowAndSwitch extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.naukri.com/");
		
		 String parentWindowName = (String) ((JavascriptExecutor)driver).executeScript("return window.name ='Naukri';");
		 //		Setting User Defined Name of a Tab
		 
		String [] windowNames = {"1", "2", "3"};
		
		for (String windowName : windowNames) {
			driver.switchTo().window(windowName);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		driver.switchTo().window(parentWindowName);				// switching to user defined name of parent tab
		System.out.println(driver.getTitle());
		driver.close();
		
		/*
		 * 			OR
		 * 
		  	driver.switchTo().window("");				//			"" default window name of Naukri Homepage
			System.out.println(driver.getTitle());
			driver.close();
		 * 
		 */
		
	}
	
}