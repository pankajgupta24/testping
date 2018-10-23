package com.stepdefenitions;

import com.testbase.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Servicehooks {
	
	TestBase testbase;
	
	@Before
	public void intializetest(){
		testbase = new TestBase();
		testbase.selectBrowser();
	}
	@After
	public void endTest(){
		testbase.driver.quit();
	}
}
