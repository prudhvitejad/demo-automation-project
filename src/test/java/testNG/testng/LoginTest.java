package testNG.testng;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void z1()
	{
		System.out.println("Testing1");
	}
	
	@Test (priority=-1,description="This is a login test")
	public void bloginTest()
	{
		System.out.println("Login is Successfull");
	}
	
	@Test (priority=0,description="This is a logout test")
	public void alogoutTest()
	{
		System.out.println("Logout is Successfull");
	}
	
	@Test
	private void z2()
	{
		System.out.println("Testing2");
	}
}
