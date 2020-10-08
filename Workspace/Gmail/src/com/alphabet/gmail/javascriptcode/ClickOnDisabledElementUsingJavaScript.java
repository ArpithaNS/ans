package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class ClickOnDisabledElementUsingJavaScript extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html");
		
		driver.findElement(By.linkText("jdk-8u261-windows-x64.exe")).click();
		
		WebElement disabledLink = driver.findElement(By.linkText("Download jdk-8u261-windows-x64.exe"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver ;
		
		js.executeScript("arguments[0].click()", disabledLink);
		
		
		
	}
	
	
}
