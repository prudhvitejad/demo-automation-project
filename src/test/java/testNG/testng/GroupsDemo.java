package testNG.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "overall")
public class GroupsDemo {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This is BeforeClass Test");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is AftereClass Test");
	}
	
	@BeforeGroups(value = "regression")
	public void beforeGroups()
	{
		System.out.println("This is BeforeGroups Test");
	}
	
	@AfterGroups(value = "regression")
	public void afterGroups()
	{
		System.out.println("This is AfterGroups Test");
	}
	
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
