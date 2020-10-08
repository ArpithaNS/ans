package com.alphabet.gmail.testngtopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.alphabet.gmail.datadriven.ExcelLibrary;

public class TC005 {		//		TestNG program to Test Login with Multiple Login Credentials from Excel File

	@DataProvider(parallel=true)
	public Object [][] getData(){
		String filePath = "./resources/multipledata.xlsx";
		String sheetName = "Sheet1";
		return ExcelLibrary.getAllExcelSheetData(filePath, sheetName);
	}
	
	@Test(dataProvider="getData", description = "Test Case to Test Login with Multiple Login Credentials Feeded from Excel File")		//		@DataProvider name is not provided by the programmer hence default name will be used for @DataProvider i.e the method name getData
	public void testValidLogin(String usernm, String passd) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/");
			
			driver.findElement(By.id("username")).sendKeys(usernm);
			driver.findElement(By.name("pwd")).sendKeys(passd);
			driver.findElement(By.id("loginButton")).click();
			
		}
	
}

//	Iteration depends on Number of Sub Arrays
//	Arguments depends on the number of data present in each sub array
