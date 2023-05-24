package testNG.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo {
	
	@Test(dependsOnGroups= {"bvt"},alwaysRun=true)
	public void test1( ) {
		System.out.println("Test1");
	}
	
	@Test
	public void test2( ) {
		System.out.println("Test2");
		Assert.assertTrue(false);
	}
	
	@Test(groups="bvt")
	public void test3( ) {
		System.out.println("Test3");
	}

}
