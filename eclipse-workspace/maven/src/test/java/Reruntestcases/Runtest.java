package Reruntestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runtest {
	
	@Test(retryAnalyzer = Analzer.IRetry.class)
	public void test() {
		Assert.assertTrue(false);
		
	}
	@Test(retryAnalyzer = Analzer.IRetry.class)
	public void test2() {
		Assert.assertTrue(true);
		
	}

}
