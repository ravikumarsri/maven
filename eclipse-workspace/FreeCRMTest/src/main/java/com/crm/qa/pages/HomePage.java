package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contactslink;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement Newcontactslink;
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement Dealslink;
	
	@FindBy(xpath="//a[text()='Tasks']")
	WebElement Taskslink;
	
	@FindBy(xpath="//td[contains(text(),'User: sridhar donthamsetti')]")
	WebElement usernamelabel;
	
	public HomePage () {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public ContactsPage Clikoncontactslink() {
		
		contactslink.click();
		return new ContactsPage();
	}
	public DealsPage ClikonDealslink() {
		Dealslink.click();
		return new DealsPage();
	}
	public TasksPage ClikonTaskslink() {
	
		Taskslink.click();
		return new TasksPage();
	}
	public Boolean verifyusernamelabel() {
					 
		return usernamelabel.isDisplayed();
	}
	public String verifyHomepageTitle() {
		return driver.getTitle();
	}
	public void newcontactslink() {
		Actions act = new Actions(driver);
		act.moveToElement(contactslink).moveToElement(Newcontactslink).click().build().perform();
		
	}

}
