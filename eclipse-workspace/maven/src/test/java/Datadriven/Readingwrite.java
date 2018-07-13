package Datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.Xls_Reader;

public class Readingwrite {
	;
	public static void main(String[] args) {
		WebDriver driver;
		
		Xls_Reader reader = new Xls_Reader("C:/Users/dssri/Desktop/ebayregistrationdata.xlsx");
		
		String  firstname = reader.getCellData("Sheet1", "First name", 2);
		System.out.println(firstname);
		String  Lastname = reader.getCellData("Sheet1", "Last name", 2);
		System.out.println(Lastname);
		String  Emailid = reader.getCellData("Sheet1", "Email address", 2);
		System.out.println(Emailid);
		String  Password = reader.getCellData("Sheet1", "Password", 2);
		System.out.println(Password);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com.sg/reg/PartialReg");
		
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		driver.findElement(By.id("lastname")).sendKeys(Lastname);
		driver.findElement(By.id("email")).sendKeys(Emailid);
		driver.findElement(By.id("PASSWORD")).sendKeys(Password);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ppaFormSbtBtn")));
		driver.findElement(By.id("ppaFormSbtBtn")).sendKeys(Keys.ENTER);

	}

}
