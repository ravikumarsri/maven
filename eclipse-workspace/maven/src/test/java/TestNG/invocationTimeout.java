package TestNG;

import org.testng.annotations.Test;

public class invocationTimeout {

	@Test(invocationTimeOut=10000)
	public void timeout() {
		while(true) {
		System.out.println("print A");
		
	}
}
}