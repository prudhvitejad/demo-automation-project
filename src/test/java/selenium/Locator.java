package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.cssSelector("#password"));
		driver.findElement(emailLocator).sendKeys("standard_user");
		
		By submitLocator = RelativeLocator.with(By.tagName("input")).below(password);
		driver.findElement(submitLocator).click();
		
		//driver.close();
	}

}
