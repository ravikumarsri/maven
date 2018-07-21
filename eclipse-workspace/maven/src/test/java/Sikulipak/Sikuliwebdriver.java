package Sikulipak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuliwebdriver {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dssri\\Desktop\\drivers\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=GEhYvwGg9eQ");
		Screen s = new Screen();
		
		Pattern playimg = new Pattern("pause.png");
		s.wait(playimg,2000);
		s.click();
		s.click();

	}

}
