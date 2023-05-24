package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
													
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement greenslider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(greenslider, -50, 0);
		actions.perform();
		
		actions.contextClick().perform();
		//actions.contextClick(greenslider).perform();

	}

}
