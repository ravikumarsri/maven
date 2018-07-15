package Brokenlinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksstatus {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dssri\\Desktop\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
List <WebElement>presentlinks	=	driver.findElements(By.tagName("a"));
		presentlinks.addAll(driver.findElements(By.tagName("img")));
		int presentlinkscount = presentlinks.size();
		
		ArrayList<WebElement> realpresentlinks = new ArrayList<WebElement>();
		System.out.println(presentlinkscount);
		for(int i=0;i<presentlinks.size();i++) {
			if (presentlinks.get(i).getAttribute("href") !=null) {
				
			
			realpresentlinks.add(presentlinks.get(i));
			
			
		}
		}
		
System.out.println("Reallinks prensent =========>"  +realpresentlinks.size());

for (int j=0;j<realpresentlinks.size();j++) {
if (realpresentlinks.get(j).getAttribute("href") != null && (! realpresentlinks.get(j).getAttribute("href").contains("javascript"))) {
	URL url = new URL(realpresentlinks.get(j).getAttribute("href"));
	HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	String Response = connection.getResponseMessage();
	System.out.println(realpresentlinks.get(j).getAttribute("href")+"=======>"+Response);
	
}
}
}
}