package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectGettingStarted {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//apply implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch application
		driver.get("https://www.selenium.dev/");

		//identify the news
		WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		Thread.sleep(2000);
		//perform right click
	     Actions act = new Actions(driver);
	       act.contextClick(target).perform();
	     //passs page down go till to inspect 
	     //create object for robot class
	   Robot robot = new Robot();
	   	   //use looping statment
	     for(int i=0;i<=10;i++)
	     {
	    	 Thread.sleep(2000);
	    	 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	    	 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    	 Thread.sleep(2000);
	    	 //press the enter key
	    	 robot.keyPress(KeyEvent.VK_ENTER);
	    	 robot.keyRelease(KeyEvent.VK_ENTER);
	    	 
	     }  
	     Thread.sleep(2000);
	     driver.close();

	     
}
}