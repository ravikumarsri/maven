package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement crmlog;

	@FindBy(xpath ="//button[text()='Sign Up']")
	WebElement sigupbutton;

	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//input[@type ='submit']")
	WebElement submitbutton;

	public LoginPage() {
		PageFactory.initElements(driver, this );

	}
	
	
	public String validationtitle() {
		
	 return driver.getTitle();
	}

	public boolean validationcrmlog() {
		
		return crmlog.isDisplayed();
	}
	
	public HomePage Login(String usname, String pwd) {
		username.sendKeys(usname);
		password.sendKeys(pwd);
		submitbutton.click();
		
		return new HomePage();
	}
}
