package selenium;
//import org.openqa.selenium.chrome.ChromeDriver;
/*
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
*/

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		/*
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		//driver.close();
		*/
		driver.get("https://developer.salesforce.com/signup");
		//driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("prudhvi");
		driver.findElement(By.id("input")).sendKeys("prudhvi");
		
	}

}
