package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDownDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"flightOrigin1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"flightOrigin1\"]")).sendKeys("Sydney");
		driver.findElement(By.xpath("//*[@id=\"flightOrigin1\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"flightOrigin1\"]")).sendKeys(Keys.ENTER);
	}

}
