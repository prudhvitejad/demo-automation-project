package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingDropDownDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"field27\"]/div/select"));
		
		//driver.findElement(By.xpath("/html/body/form/input")).click();
		
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		select.selectByValue("level5");
		select.selectByVisibleText("501 - 1,000 employees");
		List<WebElement> allitems = select.getAllSelectedOptions();
		
		System.out.println(allitems.size());
		
		WebElement firstselected = select.getFirstSelectedOption();
		String text = firstselected.getText();
		System.out.println(text);
		
		/*
		select.deselectByIndex(2);
		select.deselectAll();
		
		*/
	}

}
