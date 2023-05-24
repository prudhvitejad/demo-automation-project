package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxSelection {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.computerhope.com/jargon/c/checkbox.htm");
		driver.manage().window().maximize();
	/*	
		WebElement element = driver.findElement(By.xpath("//*[@id=\"main-content\"]/article/div[3]/span"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	*/	
		driver.findElement(By.xpath("//*[@id=\"Example-1\"]")).click();
		
	}

}
