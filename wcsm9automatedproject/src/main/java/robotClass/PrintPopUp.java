package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		//create object of robot  class
		       Robot robot = new Robot();
		       //to generate printpopup ctrl+p
		       //press ctrl
		       robot.keyPress(KeyEvent.VK_CONTROL);
		       //press p
		       robot.keyPress(KeyEvent.VK_P);
		       //release ctrl button
		       robot.keyRelease(KeyEvent.VK_CONTROL);
		       //release p button
		       robot.keyRelease(KeyEvent.VK_P);
		       Thread.sleep(2000);
		       //press tab
		       robot.keyPress(KeyEvent.VK_TAB);
		       //release tab
		       robot.keyRelease(KeyEvent.VK_TAB);
		       Thread.sleep(2000);
		       //press enter
		       robot.keyPress(KeyEvent.VK_ENTER);
		       //release enter
		       robot.keyRelease(KeyEvent.VK_ENTER);
		       Thread.sleep(2000);
		      driver.quit();
		      
		       
		      
		}
		}


