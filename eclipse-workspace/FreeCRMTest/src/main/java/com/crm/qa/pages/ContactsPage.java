package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
@FindBy(xpath= "//td[contains(text(),'Contacts')]")
@CacheLookup
WebElement contactTitle;
	

@FindBy(xpath="//a[contains(text(),'ravi kumar')]/parent::td[@class='datalistrow']/preceding-sibling::td/input[@name='contact_id']")
WebElement selectcontact;

@FindBy(xpath="//select[@name='title']")
WebElement Titles;

@FindBy(id="first_name")
WebElement first_name;

@FindBy(id="surname")
WebElement surname;

@FindBy(name="client_lookup")
WebElement campany_name;

@FindBy(xpath="//input[ @type='submit' and @value='Save'] //following::input[@name ='addmore']")
WebElement subbttn;

public ContactsPage() {
	
	PageFactory.initElements(driver, this);
	
}

public Boolean verifycontectspagetitle() {
	return contactTitle.isDisplayed();
}
public void Clickoncontactscheckbox() {
	selectcontact.click();
}
public void createnewcantact(String Title, String firstname,String lastname, String Companyname ) {
	Select sel = new Select(Titles);
	sel.selectByVisibleText(Title);
	first_name.sendKeys(firstname);
	surname.sendKeys(lastname);
	campany_name.sendKeys(Companyname);
	subbttn.click();
}

}
