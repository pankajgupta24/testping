package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	private WebDriver driver;
	
	@FindBy(name="username")
	public WebElement username;
	
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@class,'btn')]")
	WebElement loginbutton;
	
	public Loginpage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void enterusername(String username){
		this.username.sendKeys(username);
	}
	
	public void enterpassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLogin(){
		loginbutton.clear();
	}
	

}
