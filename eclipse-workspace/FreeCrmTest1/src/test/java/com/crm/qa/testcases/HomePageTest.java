package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Testutil;

public class HomePageTest extends TestBase {
	HomePage homepage;
	ContactsPage contactspage;
	DealsPage dealspage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		Initalization();


		LoginPage loginpage = new LoginPage();
		contactspage= new ContactsPage();
		dealspage= new DealsPage();

		homepage =	loginpage.Login(pro.getProperty("username"),pro.getProperty("password"));

	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority =4)
	public void validateHomeTitleTest() {
		String HomeTitle =homepage.verifyHomepageTitle();
		System.out.println(HomeTitle);
		Assert.assertEquals(HomeTitle, pro.getProperty("HomePageTitile"),"Homepage Title incorrect" );
	}
	@Test(priority =5)
	public void validateUsernamelabelTest() {
		Testutil.switchtoframe();
		Boolean flag1 =homepage.verifyusernamelabel();
		Assert.assertTrue(flag1);
	}
	@Test(priority =6)
	public void ClikoncontactslinkTest() {
		
		contactspage =homepage.Clikoncontactslink();
	}
	@Test(priority =7)
	public void ClikonDealslinkTest() {
		Testutil.switchtoframe();
		dealspage =homepage.ClikonDealslink();
	}
	@Test(priority =1)

	public void ClinkonnewcontactsTest() {
		Testutil.switchtoframe();
		homepage.newcontactslink();
	}	
	@Test(priority =2)

	public void ClinkonDealsTest() {
		Testutil.switchtoframe();
		homepage.ClikonDealslink();
	}
	@Test(priority =3)

	public void ClinkonTasksTest() {
		Testutil.switchtoframe();
		homepage.ClikonTaskslink();
	}


}



