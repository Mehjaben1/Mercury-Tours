package org.mma.mercury.tours.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *********************************************************************************************************   
 @author 
 Class Name: Base Class
 Description: This class will store the browsers of the Tests
 Reviewer name:
 Review Date:
 Comments:
 Creation Date: 2/11/2023                   
 *********************************************************************************************************
 **/
public class BrowserFactory {
	public static WebDriver StartApplication (WebDriver driver, String browserName, String appURL) {
		if (browserName.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		if (browserName.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(appURL);
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
	}
	


