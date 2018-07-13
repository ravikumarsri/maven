package Datadriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailReg {
	WebDriver driver;
	
	
	@BeforeMethod
	public void startup(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	@DataProvider
	public Iterator<Object[]> gettestdata(){
		
	ArrayList<Object[]> testdata =	TestNgDatadriven.getExceldata();
	
	return testdata.iterator();
	
		
	}
	
	
	@Test(dataProvider="gettestdata")
	public void gmailge(String firstname,String Lastname,String Emailid,String Password,String Passconform) {
		
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(Lastname);
		driver.findElement(By.name("Username")).sendKeys(Emailid);
		driver.findElement(By.name("Passwd")).sendKeys(Password);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(Passconform);
		
	}
}
