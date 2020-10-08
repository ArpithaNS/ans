package com.alphabet.gmail.webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserRefreshOptimized extends BasicSettings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.navigate().refresh();
		
		driver.close();
		
	}
}
