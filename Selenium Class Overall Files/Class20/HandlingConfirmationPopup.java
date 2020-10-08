package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.webdrivermethods.BasicSettings;

public class HandlingConfirmationPopup extends BasicSettings
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("file:///D:/Java%20Selenium/SCSW4/Session%2026/confirmationpopup.html");
		Alert alert=driver.switchTo().alert();
		String alertMessage=alert.getText();
		System.out.println("Alert Message::"+alertMessage);
//		alert.accept();
		alert.dismiss();
	}
}
