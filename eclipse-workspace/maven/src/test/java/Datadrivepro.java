import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Datadrivepro {
	static WebDriver driver;


	public static void main(String[] args) throws IOException {

		Properties pro = new Properties();

		FileInputStream ip = new FileInputStream("C:\\Users\\dssri\\eclipse-workspace\\maven\\src\\test\\java\\Util.properties");

		pro.load(ip);

		String url = pro.getProperty("url");
		String browsername = pro.getProperty("Browser");

		

		if (browsername.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dssri\\Desktop\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
			if (browsername.equals("firefox")) 
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\dssri\\Desktop\\drivers\\geckodriver.exe");

				driver = new FirefoxDriver();
			}
			else
				if (browsername.equals("IE")) 
				{
					System.setProperty("webdriver.ie.driver","C:\\Users\\dssri\\Desktop\\drivers\\MicrosoftWebDriver.exe");
					driver = new InternetExplorerDriver();
				}




		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name(pro.getProperty("username_id"))).sendKeys(pro.getProperty("username"));
		driver.findElement(By.name(pro.getProperty("password_id"))).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath(pro.getProperty("submitbut_xapth"))).click();
		
	}

}
