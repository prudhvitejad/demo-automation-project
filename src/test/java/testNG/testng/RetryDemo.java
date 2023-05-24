package testNG.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryDemo {
	
	@Test(retryAnalyzer =  Retry.class)
	public void test1()
	{
		Assert.assertTrue(false);
	}
	
	@Test( retryAnalyzer = Retry.class )
	public void test2()
	{
		Assert.assertTrue(false);
	}

}
