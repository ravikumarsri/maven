package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Testngdepends {
	@Test(invocationCount=10)
	public void A () {
		//Assert.assertTrue(false);
		System.out.println("Method A");
	}
	@Test(dependsOnMethods= "A")
	public void B () {
		System.out.println("Method B");
	}
	@Test(dependsOnMethods= "B")
	public void C () {
		System.out.println("Method C");
	}
	@Test(dependsOnMethods= "C")
	public void D () {
		System.out.println("Method D");
	}

}
