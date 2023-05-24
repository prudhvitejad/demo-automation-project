package assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id=\"text1\"]"));
		firstName.sendKeys("Prudhvi");
		
		System.out.println("First name : " + firstName.getText());
		System.out.println("First name : " + firstName.getAttribute("value"));
		
		WebElement toHide = driver.findElement(By.xpath("//input[@id=\"text4\"]"));
		toHide.sendKeys("toHide");
		
	//	Thread.sleep(15000);
		
		
		WebElement secondName = driver.findElement(By.xpath("//input[@id=\"text2\"]"));
	
		waitForTheElementToBeClickable(secondName,20);
		//waitUnitElementInteractable(driver,20,"//input[@id=\"text2\"]");
		
		secondName.sendKeys("Teja");
		
		System.out.println("Second name : " + secondName.getText());
	
		WebElement hiddenField = driver.findElement(By.xpath("//input[@id=\"text3\"]"));
		hiddenField.sendKeys("Hidden");
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id=\"check1\"]"));
		checkbox1.click();
		
		System.out.println("First Checkbox value is :" + checkbox1.getText()); 
		
		//Thread.sleep(2000);
		
	//	WebElement checkbox2 = driver.findElement(By.xpath("//input[@id=\"check2\"]"));
	//	checkbox2.click();
		
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id=\"check3\"]"));
		checkbox3.click();
		
		WebElement radiobox = driver.findElement(By.xpath("//input[@id=\"radio1\"]"));
		radiobox.click();
		
		System.out.println("Radiobox value is :" + radiobox.getText());
		
		//file upload
		WebElement file = driver.findElement(By.xpath("//input[@name=\"img\"]"));
		file.sendKeys(System.getProperty("user.dir")+ "//src//test//resources//image.png");
		
		//single valued dropdown
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id=\"Carlist\"]"));
		Select select = new Select(dropdown1);
		select.selectByValue("Audi Car");
		
		Thread.sleep(2000);
		
		for(int i=0;i<=6;i++) {
			select.selectByIndex(i);
		}
		
		//multi valued dropdown
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name=\"FromLB\"]"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("USA");
		select2.selectByValue("Russia");
		select2.selectByVisibleText("France");
		select2.selectByValue("Japan");
		select2.selectByValue("Mexico");
		
		List<WebElement> selectedvalues = select2.getAllSelectedOptions();
		System.out.println("Selected Options:");
		for(int i=0;i<selectedvalues.size();i++) {
			System.out.print(selectedvalues.get(i).getText() + "\t");
		}
		System.out.println();
		
		WebElement forwardButton = driver.findElement(By.xpath("//input[@value=\"->\"]"));
		forwardButton.click();
		
		//multi valued dropdown
		WebElement dropdown3 = driver.findElement(By.xpath("//select[@name=\"ToLB\"]"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("Japan");
		select3.selectByValue("Mexico"); 
		
		WebElement backwardButton = driver.findElement(By.xpath("//input[@value=\"<-\"]"));
		backwardButton.click();
		
		//Scrolling 
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"Attribution1\"]/div[1]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(scroll).perform();
		
		// alert boxes 
		WebElement alertButton1 = driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]"));
		alertButton1.click();
		Alert alert1 = driver.switchTo().alert();	
		alert1.accept();
		
		WebElement alertButton2 = driver.findElement(By.xpath("//input[@value=\"Show Me Alert\"]"));
		alertButton2.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		WebElement alertButton3 = driver.findElement(By.xpath("//button[@onclick=\"myFunctionf()\"]"));
		alertButton3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Prudhvi");
		alert3.accept();
		
		//table 
		List<WebElement> rows = driver.findElements(By.xpath("//div[1]/table/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//div[1]/table/tbody/tr[1]/td"));
		
		List<String> row1 = new ArrayList<String>();
		
		for(int i=1;i<=cols.size();i++) {
			WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[1]/td[" + i + "]"));
			row1.add(element.getText());
		}
		
		List<String> row2 = new ArrayList<String>();
		
		for(int i=1;i<=cols.size();i++) {
			WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td[" + i + "]"));
			row2.add(element.getText());
		}
		
		List<String> row3 = new ArrayList<String>();
		
		for(int i=1;i<=cols.size();i++) {
			WebElement element = driver.findElement(By.xpath("//div[1]/table/tbody/tr[3]/td[" + i + "]"));
			row3.add(element.getText());
		}
		
		//printing the table
		for(int i=0;i<row1.size();i++)
			System.out.print(row1.get(i)+"\t");
		System.out.println();
		
		for(int i=0;i<row2.size();i++)
			System.out.print(row2.get(i)+"\t");
		System.out.println();
		
		for(int i=0;i<row3.size();i++)
			System.out.print(row3.get(i)+"\t");
		System.out.println();
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@id=\"submitButton\"]"));
		submitButton.click();
		
		submitButton = driver.findElement(By.xpath("//input[@id=\"submitButton\"]"));
		
		waitForTheElementToBeClickable(submitButton,30);
		
		submitButton.click();
		
		
	//	System.out.println("First name : " + firstName.getText());
	//	System.out.println("Second name : " + secondName.getText());

	}
	
	@SuppressWarnings("unchecked")
	public static <T> void waitUnitElementInteractable(WebDriver driver,int timeoutInSeconds,String xpath1) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeoutInSeconds))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is custom message saying element is not interactable")
				.ignoring(ElementNotInteractableException.class);
		((WebElement) wait.until((Function<? super WebDriver, T>) ExpectedConditions.presenceOfElementLocated(By.xpath(xpath1)))).click();
	}
	
	public static void waitForTheElementToBeClickable(WebElement elem, int timeoutInSeconds) {
		try {
			FluentWait<WebElement> wait = new FluentWait<WebElement>(elem)
					.withTimeout(Duration.ofSeconds(timeoutInSeconds))
					.pollingEvery(Duration.ofSeconds(2))
					.withMessage("[Waiting for disappearance of a WebElement]");
			wait.until(new Function<WebElement, Object>() {
				public Boolean apply(WebElement elem) {
					try {
						return (elem.isEnabled());
					} catch (NoSuchElementException | StaleElementReferenceException e) {
						return true;
					}
				}
			});
		} catch (Exception e) {
			//log.error("TimeOut Exception Occured While Waiting for Disappearance of Element...");
		}
	}

}
