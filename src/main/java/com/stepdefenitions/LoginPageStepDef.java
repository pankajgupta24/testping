package com.stepdefenitions;

import com.pageobjects.Loginpage;
import com.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDef extends TestBase{
	
	Loginpage loginpage= new Loginpage(driver);
	
	
	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void I_am_on_the_Login_page_URL(String arg1){
		driver.get(arg1);
	}

	@Then("^I should see Log In Page$")
	public void I_should_see_Log_In_Page(){
		loginpage.username.isDisplayed();
	}
	
	@When("^I enter username as \"([^\"]*)\"$")
	public void I_enter_username_as(String arg2){
		loginpage.enterpassword(arg2);
		
	}
	
	@When ("^I enter password as \"([^\"]\"$")
	public void I_enter_password_as(String arg3){
		loginpage.enterpassword(arg3);
	}
	@When ("^click on login button$")
	public void click_on_login_button(){
		
		loginpage.clickLogin();
	}
	
	
	
	
}
