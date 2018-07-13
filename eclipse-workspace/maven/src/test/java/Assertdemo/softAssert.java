package Assertdemo;

//if want to check the condition of particular test cases 
//(if condition the is true it will execution  or if condition false then assert will failed the test cases)  

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	SoftAssert assert1 = new SoftAssert();
	@Test
	public void assert1() {
		
		System.out.println("hardassert");
	assert1.assertTrue(false);
	
	System.out.println("After assert hardassert");
	
	assert1.assertAll();
	}
	@Test
	public void assert2() {
		System.out.println("Hardassert2");
	}
	
}
