package Takescreenshot;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver driver;
	
	public static void initialization () throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=1V1w8ccRp_M&list=PLFGoYjJG_fqp25buwscrsKA5q8qsLsuUy&index=9");
		Thread.sleep(3000);
	}
	
	public void failshot(String methodname) {
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File sc = ts.getScreenshotAs(OutputType.FILE);
		
		try {
		FileUtils.copyFile(sc, new File("/Users/dssri/eclipse-workspace/maven/src/test/java/ScreenShots/"+methodname+"+.jpg"));
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
