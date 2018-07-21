package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;

	HomePage homepage;
	public LoginPageTest() {

		super();

	}


	@BeforeMethod
	public void stetup() {

		Initalization();

		loginpage = new LoginPage();

	}

	@AfterMethod
	public void teardown() {

		driver.quit();

	}

	@Test(priority =1)
	public void verifyTitleTest() {
		String Title =loginpage.validationtitle();

		Assert.assertEquals(Title, pro.getProperty("Title"),"incorrect Log" );

	}

	@Test(priority =2)
	public void verifyLogTest() {

		Boolean log = loginpage.validationcrmlog();
		Assert.assertTrue(log);
	}
	@Test(priority =3)
	public void Logintest() {
		homepage = loginpage.Login(pro.getProperty("username"), pro.getProperty("password"));


	}





}
