package TestNG;

import org.testng.annotations.Test;

public class Expectedexception {

	@Test(expectedExceptions=ArithmeticException.class)
	public void testngexceptionhandling() {
		int a=10/0;
		
	}
	
}
