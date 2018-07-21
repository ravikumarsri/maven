package Alertsupload;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAlerts {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dssri\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://makemysushi.com/404?");
		
		List<WebElement> ele =driver.findElements(By.xpath("//a"));
		ele.addAll(driver.findElements(By.xpath("//img")));
		
		
		Thread.sleep(3000);
		int count = ele.size();
		System.out.println("Total present links in page =======>"+count);
		ArrayList <WebElement> links = new ArrayList <WebElement>();
		
		for(int i=0;i<count;i++) {
			
			if(ele.get(i).getAttribute("href") != null) {
			System.out.println( ele.get(i).getAttribute("href"));
			System.out.println( ele.get(i).isEnabled());
			links.add(ele.get(i));
		
					
		}
		
		
	}

		System.out.println("Total active links in page ========>"+links.size());
		
		for(int j=0; j <links.size();j++) {
			
			if(links.get(j).getAttribute("href").startsWith("http") != links.get(j).getAttribute("href").contains("plus.google"))
			{				
			
			
			HttpURLConnection connection = (HttpURLConnection)new URL(links.get(j).getAttribute("href")).openConnection();
			String con = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(con);
			System.out.println(links.get(j).getAttribute("href"));
			
			}
		}
	}
}
