package testNG.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCasesDemo {
	
	Boolean data = false;
	
	@Test(enabled = false)
	public void skiptest1()
	{
		System.out.println("Skipping this test case as it is not complete");
	}
	
	@Test
	public void skiptest2()
	{
		System.out.println("Skipping this test case forcefully");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void skiptest3()
	{
		System.out.println("Skipping this test case based on condition");
		if(data)
		{
			System.out.println("Execute this test");
		}
		else
		{
			System.out.println("Don't execute further steps");
			throw new SkipException("Don't execute further steps");
		}
	}
}
