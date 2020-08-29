package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage {
public WebDriver driver;
	public Signinpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signinbutton;
	
	public void getSigninbutton() {
		signinbutton.click();
	}
	
	
	
	
}
