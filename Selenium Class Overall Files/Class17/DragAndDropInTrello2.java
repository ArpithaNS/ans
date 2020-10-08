package com.alphabet.gmail.actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class DragAndDropInTrello2 extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://trello.com/login");
		Action act;
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		mySleepInSeconds(5);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		mySleepInSeconds(5);
		driver.findElement(By.id("login-submit")).click();
		String xpathForJavaSessions = "//h3[text()='Personal Boards']/../..//div[text()='My Java Sessions']";
		driver.findElement(By.xpath(xpathForJavaSessions)).click();
		
		mySleepInSeconds(5);
		
		WebElement source=driver.findElement(By.xpath("//span[text()='Automate 100 Test Cases']"));
		WebElement target=driver.findElement(By.xpath("//h2[text()='Things To Do']/../..//span[.='Add a card']"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(source).moveToElement(target).pause(Duration.ofSeconds(3)).release().perform();
	}
}

//Identify the source and target Element
//click and hold the source element
//Move the Cursor to Target Element
//mouse release


