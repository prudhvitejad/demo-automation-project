package selenium;
//import org.openqa.selenium.chrome.ChromeDriver;
/*
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
*/

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Software/chrome_109/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\browserdrivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:/Software/chrome_109/chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		/*
		RemoteWebDriver driver;
		Object FirefoxDriver = driver = new FirefoxDriver();
		*/
		
	//	EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");
		
	}
	
	@Test(priority=2,dataProvider="testData")
	public void test1(String name1,String name2) {
		String fname1 = "Prudhvi";
		String lname1 = "Teja";
		System.out.println(name1 + name2);
		System.out.println("With testNG1");
	}
	
	@DataProvider(name="testData")
	public Object[][] data() {
		Object[][] array = new Object[][] {
			
			{"Prudhvi","Teja"},
			
			{"Tippiri","Chandana"}
			
		};
		System.out.println("in the data Provider");
		return array;
		//return "Prudhvi";
	}

}
