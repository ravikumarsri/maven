package Takescreenshot;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class Failedtestcases extends Base{
	
	@BeforeMethod
	public void Startup() throws Exception {
		initialization ();
		
	}
	@AfterMethod
	public void teradown() {
		driver.quit();
	}
	@Test
	public void takescreenshot() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takescreenshot1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takescreenshot2() {
		Assert.assertEquals(false, true);
	}
}
