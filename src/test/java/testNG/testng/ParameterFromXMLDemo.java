package testNG.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterFromXMLDemo {
	
	@Parameters({"username","password"})
	@Test()
	public void test(String username,String password)
	{
		System.out.println("Hello "+username);
		System.out.println("Ur password is :"+password);
	}

}
