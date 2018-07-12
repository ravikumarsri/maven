package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;



public class PriorityTestcases {
	
	
	WebDriver driver;
	
	
	@Test(priority = 2,groups="login application",dependsOnMethods="lunchbrowser")
	public void login() throws Exception {
		Thread.sleep(20);
		driver.findElement(By.id("email")).sendKeys("ds.sridhar09@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mamta@sri143");
		driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
	}
	@Test(priority = 3,groups="printing friends",dependsOnMethods="login")
	public void friendlist() throws Exception {
		
		Thread.sleep(30);
		driver.findElement(By.xpath("//div[text()='Friend Lists']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/donthamsetti.sridhar/friends?ft_ref=flsa']")).click();
		
	
		
		
		
	List<WebElement> friendlist = driver.findElements(By.xpath("//div[contains(@id,'collection_wrapper')]/div/ul/li/div"));
	int totalcount = friendlist.size();
	System.out.println(totalcount);
	
	 for (int i=0;i<totalcount;i++) {
		 
		 WebElement ele = friendlist.get(i);
		 
		 String friend = ele.getText();
		 
		 System.out.println(friend);
	 }
	}

	@Test(priority = 1,groups="startingapplication")
	public void lunchbrowser () {
		
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--disable-notifications" );
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}	
}


		
	
