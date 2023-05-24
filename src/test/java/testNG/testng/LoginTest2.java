package testNG.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest2 {
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login to Application");
	}
	
	@AfterTest
	public void logoutFromApplication()
	{
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod
	public void connectDB()
	{
		System.out.println("Connected to DB");
	}
	
	@AfterMethod
	public void disconnectedFromDB()
	{
		System.out.println("Disconnected from DB");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2");
	}
}
