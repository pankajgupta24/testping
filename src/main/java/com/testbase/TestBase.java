package com.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase 
	{
	
	public  WebDriver driver;
	public void selectBrowser() 
	
	{
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/res/Drivers/chromedriver.exe");
	this.driver = new ChromeDriver();
	driver.manage().window().maximize();
			
		//return driver;
	}
}
