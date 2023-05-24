package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDemo {
	
	 public static void main(String[] args) throws AWTException, InterruptedException {
		 
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html"); // sample url	
      driver.findElement(By.xpath("//input[@name=\"img\"]")).click();	
      Robot robot = new Robot();  // Robot class throws AWT Exception	
      Thread.sleep(2000); // Thread.sleep throws InterruptedException	
      robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
      
      Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
      robot.keyPress(KeyEvent.VK_TAB);	
      Thread.sleep(2000);	
      robot.keyPress(KeyEvent.VK_TAB);	
      Thread.sleep(2000);	
      robot.keyPress(KeyEvent.VK_TAB);	
      Thread.sleep(2000);	
      robot.keyPress(KeyEvent.VK_ENTER);	
      
      
  // press enter key of keyboard to perform above selected action
	
	  /*
	  driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
	//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  //open upload window
	     driver.findElement(By.xpath("//input[@name='img']")).click();
	     //put path to your image in a clipboard
	     StringSelection ss = new StringSelection("C:\\Users\\dprudhvi\\Desktop\\1.txt");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     //imitate mouse events like ENTER, CTRL+C, CTRL+V
	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(90);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	  */
	 }
}
