package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
	
	WebDriver driver;
	@Test
	@Parameters
	public void login(String url,String emailid, String password) {
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.get(url);
		    driver.findElement(By.id("email")).sendKeys(emailid);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
	}

}
