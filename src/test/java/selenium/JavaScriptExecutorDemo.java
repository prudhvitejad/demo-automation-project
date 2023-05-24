package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		
		//Title of the page
		String script = "return document.title;";
		String title = (String) jsexecutor.executeScript(script);
		System.out.println(title);
		
		//Click button
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();
		
		//Highlight button
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		jsexecutor.executeScript("arguments[0].style.border='5px solid green'", button);
		
		// Scrolling
		driver.navigate().to("https://www.w3schools.com/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"bgcodeimg2\"]/div/a"));
		jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
