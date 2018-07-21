package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties  pro;
	public static EventFiringWebDriver d_event;
	public TestBase() {
		
		try {
		pro = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\dssri\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\Config.properties");
		pro.load(ip);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void Initalization (){
		
		String Browsername = pro.getProperty("Browser");
		
		if (Browsername.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dssri\\Desktop\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else 
		if (Browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dssri\\Desktop\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		d_event = new EventFiringWebDriver(driver);
		WebEventListener eventListener = new WebEventListener();
		d_event.register(eventListener);
		driver= d_event;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
	}

}
