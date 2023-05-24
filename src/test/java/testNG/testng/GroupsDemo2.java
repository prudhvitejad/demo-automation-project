package testNG.testng;

import org.testng.annotations.Test;

import testNG.common.CommonDataSetup;

public class GroupsDemo2 extends CommonDataSetup{
	@Test(groups = "regression")
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups = {"regression","bvt"})
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@Test(groups = "bvt")
	public void test3()
	{
		System.out.println("Test3");
	}
	
}
