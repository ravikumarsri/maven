package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Testutil;

public class ContactsPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactspage;
	
	String sheetname = "contacts";
	
	public ContactsPageTest(){
		super();

	}
	@BeforeMethod 
	public void setup() {
		Initalization();


		loginpage = new LoginPage();
		homepage = new HomePage();
		contactspage= new ContactsPage();
		homepage =	loginpage.Login(pro.getProperty("username"),pro.getProperty("password"));
		Testutil.switchtoframe();
		contactspage = homepage.Clikoncontactslink();
		
	}


	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test(priority=2)
	public void verifycontacttitle() {
	
		Boolean Title =	contactspage.verifycontectspagetitle();
		Assert.assertTrue(Title);
	}

	@Test(priority=3)
	public void clinkonselectedcontactschexbox() {
		
		contactspage.Clickoncontactscheckbox();
		
	}
	
	@DataProvider
	public Object[] [] getCRMtestdata() {
	Object data[] [] =Testutil.getdata(sheetname);
	return data;
		
	}
	
	@Test(priority=1,dataProvider ="getCRMtestdata")
	public void addnewcontact(String Title,String firstname,String lastname,String Companyname) {
		homepage.newcontactslink();
		
	contactspage.createnewcantact(Title, firstname, lastname, Companyname);
		
	}


}
