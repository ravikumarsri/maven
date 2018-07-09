package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smokeTest {
	
	WebDriver driver;
	
	@Given("^Open Firefox and start application$")
	public void open_Firefox_and_start_application() throws Throwable {
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\dssri\\Downloads\\Compressed\\drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_username_and_pasword(String username,String password ) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	   
	}

	@Then("^User should able to login sucessfully$")
	public void user_should_able_to_login_sucessfully() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();	
	    
	}

	@Then("^Closer the application\\.$")
	public void closer_the_application() throws Throwable {
	    driver.quit();
	}


}
