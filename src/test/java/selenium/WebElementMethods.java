package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("prudhvi");
		driver.findElement(By.id("user-name")).clear();
		String placeholder = driver.findElement(By.id("user-name")).getAttribute("placeholder");
		String cssValue = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div")).getCssValue("background-color");
		String text = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).getText();
		Dimension size = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).getSize();
		Point location = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).getLocation();
		String tagname = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).getTagName();
		boolean displayed = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).isDisplayed();
		boolean enabled = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).isEnabled();
		boolean selected = driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).isSelected();
		
		System.out.println(placeholder);
		System.out.println(cssValue);
		System.out.println(text);
		System.out.println(size);
		System.out.println(location);
		System.out.println(tagname);
		System.out.println(displayed);
		System.out.println(enabled);
		System.out.println(selected); 
		
	}

}
