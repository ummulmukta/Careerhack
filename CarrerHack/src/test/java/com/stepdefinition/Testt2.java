package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.Signinpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testt2 extends Base {
	Signinpage p;
	@Given("^User able Go to home page$")
	public void user_able_Go_to_home_page() throws Throwable {
getDriver();
p=PageFactory.initElements(driver, Signinpage.class);


	}

	@When("^Click on Signinbutton$")
	public void click_on_Signinbutton() throws Throwable {
	   p.getSigninbutton();
	   
	}

	@When("^put user as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void put_user_as_and_password_as(String arg1, String arg2) throws Throwable {
	   driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(arg1);
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(arg2);
	}

	@When("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
	   
	   
	}

	@Then("^login should be successfully done$")
	public void login_should_be_successfully_done() throws Throwable {
	   driver.quit();
	   
	}


}
