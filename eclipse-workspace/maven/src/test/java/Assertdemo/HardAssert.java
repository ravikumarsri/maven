package Assertdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void assert1() {
		
		System.out.println("hardassert");
	Assert.assertTrue(false);
	
	System.out.println("After assert hardassert");
	}
	@Test
	public void assert2() {
		System.out.println("Hardassert2");
	}

}
