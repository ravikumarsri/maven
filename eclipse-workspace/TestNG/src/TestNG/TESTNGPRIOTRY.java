package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class TESTNGPRIOTRY {

	WebDriver driver;
	

	@Test
	public void lunchapplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
	}

	@Test
	public void registration() throws Exception {
		
		driver.findElement(By.name("username")).sendKeys("ds.sridhar09@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("24202183@d");
		
		WebElement but = driver.findElement(By.xpath("//input[@value='Login']"));
		Actions action = new Actions(driver);
		action.moveToElement(but).click().perform();
		
		
		
		Boolean element = driver.findElement(By.xpath("//div[@ class='collapse navbar-collapse']/ul/li[2]/a")).isDisplayed();

		System.out.println(element);
		
		Thread.sleep(600);
		
		WebElement sub = driver.findElement(By.xpath("//div[@ class='collapse navbar-collapse']/ul/li[2]/a"));

			action.moveToElement(sub).click().perform();	
			
		WebElement el = driver.findElement(By.id("payment_plan_id"));

		Select sel = new Select(el);
		sel.selectByIndex(1);

		driver.findElement(By.name("first_name")).sendKeys("sridhar");
		driver.findElement(By.name("surname")).sendKeys("donthamsetti");
		driver.findElement(By.name("email")).sendKeys("ds.sridhar09@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("ds.sridhar09@gmail.com");
		driver.findElement(By.name("username")).sendKeys("sridhar123");
		driver.findElement(By.name("password")).sendKeys("24202183@d");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("24202183@d");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("myButton")));
		driver.findElement(By.className("myButton")).click();
		
		driver.findElement(By.id("company_name")).sendKeys("sridhardemo");
		
		driver.findElement(By.id("phone")).sendKeys("+6596126544");
		
		driver.findElement(By.id("website")).sendKeys("www.sridhardemo.com");
		
		driver.findElement(By.id("company_email")).sendKeys("ravi@demomail.com");
		
		driver.findElement(By.name("address")).sendKeys("pugglo");
		
		driver.findElement(By.id("city")).sendKeys("singapore");
		
		driver.findElement(By.id("state")).sendKeys("singapore");
		
		driver.findElement(By.name("postcode")).sendKeys("823169");
		
		WebElement drop = driver.findElement(By.name("country"));
		sel = new Select(drop);
		sel.selectByVisibleText("Singapore");
		
		driver.findElement(By.name("copy_address")).click();
		
		driver.findElement(By.name("btnSubmit")).click();
		
		driver.findElement(By.name("first_name")).sendKeys("sridhar");
		driver.findElement(By.name("surname")).sendKeys("donthamsetti");
		driver.findElement(By.name("email")).sendKeys("ds.sridhar09@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("ds.sridhar09@gmail.com");
		driver.findElement(By.name("username")).sendKeys("sridhar123");
		driver.findElement(By.name("password")).sendKeys("24202183@d");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("24202183@d");
		
		WebElement dp = driver.findElement(By.name("role_id"));
		 sel = new Select(dp);
		 sel.selectByIndex(2);
		 driver.findElement(By.name("finish")).click();
		 
		 
		

	}

}
