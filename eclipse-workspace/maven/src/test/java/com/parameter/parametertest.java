package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {

	WebDriver driver;
	@Test
	@Parameters({"url","emailid","password","Browser"})
	public void login(String url,String emailid, String password,String Browser) {
		if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}else 
		if (Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
}

	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys(emailid);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
}

}
