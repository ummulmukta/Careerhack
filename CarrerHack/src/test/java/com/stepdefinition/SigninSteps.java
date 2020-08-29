package com.stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.Signinpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninSteps extends Base{
	
	Signinpage sp;
	
	@Given("^user able to go homepage$")
	public void user_able_to_go_homepage() throws Throwable {
	 getDriver(); 
	 sp=PageFactory.initElements(driver, Signinpage.class);
	 
	}

	@When("^user able to click signin button$")
	public void user_able_to_click_signin_button() throws Throwable {
sp.getSigninbutton();

	}

	@When("^user can click on create new account$")
	public void user_can_click_on_create_new_account() throws Throwable {


	}

	@When("^user can enter name$")
	public void user_can_enter_name() throws Throwable {


	}

	@When("^user can enter email$")
	public void user_can_enter_email() throws Throwable {


	}

	@When("^user can enter password$")
	public void user_can_enter_password() throws Throwable {


	}

	@When("^user can re enter password$")
	public void user_can_re_enter_password() throws Throwable {


	}

	@When("^user can click new account$")
	public void user_can_click_new_account() throws Throwable {


	}

	@Then("^user can see new account page$")
	public void user_can_see_new_account_page() throws Throwable {
		String ac=driver.getTitle();
Assert.assertEquals(ac, "Signinpagetitle");
System.out.println(driver.getTitle());

	}


}
