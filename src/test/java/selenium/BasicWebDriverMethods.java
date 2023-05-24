package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods {
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/partners/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/div[1]/div/a")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		driver.close();
	}
	
}
