package Highlightele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import gherkin.formatter.Argument;
import lib.ElementHIGHLIGT;

public class ElementHighliting {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		WebElement username = driver.findElement(By.name("username"));
		
		ElementHIGHLIGT.highlist(driver, username);
		username.sendKeys("ds.sridhar09@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		ElementHIGHLIGT.highlist(driver, password);
		password.sendKeys("24202183@d");
		
		WebElement submit = driver.findElement(By.xpath("//input[@value ='Login']"));
		ElementHIGHLIGT.highlist(driver, submit);
		submit.click();
		
	
		
	}

}
