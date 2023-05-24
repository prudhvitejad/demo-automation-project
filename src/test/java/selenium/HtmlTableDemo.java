package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlTableDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		// How to Handle Web Table in Selenium
		
		/*
		 1. If page has frames then switch to frame which has that particular table
		 2. Get the no.of rows
		 3. Get the no.of columns
		 4. Iterate rows and columns and get text and print
		 */
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td"));
		
		for(int i=2;i<=rows.size();i++) {
			for(int j=1;j<=cols.size();j++) {
				WebElement element = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]"));
				String str = element.getText();
				System.out.print(str+"\t");
			}
			System.out.println();
		}
	}

}
