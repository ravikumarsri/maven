package Headless;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessbrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dssri\\Desktop\\drivers\\chromedriver.exe" );
		WebDriver driver;
		driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=1V1w8ccRp_M&list=PLFGoYjJG_fqp25buwscrsKA5q8qsLsuUy&index=9");
		String Title = driver.getTitle();
		
		System.out.println("Title =========>"+Title);
	}

	}


