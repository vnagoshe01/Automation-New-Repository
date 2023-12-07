package assignmentPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DisablewebelementOnOmayo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	       Thread.sleep(4000);
	      // scroll till disable text box
	       jse.executeScript("window.scrollBy(0,500)");
	       Thread.sleep(2000);
	      jse.executeScript(" document.getElementById('tb2').value='hi'");
	   	Thread.sleep(2000);
	   	WebElement disableWebElement = driver.findElement(By.xpath("//input[@id='tb2']"));
	   	File src = disableWebElement.getScreenshotAs(OutputType.FILE);

	   	File dest = new File("./Screenshots/disablewebelement.jpg");
	   	//store the screenshot into dest
	   	Files.copy(src, dest);

	   	Thread.sleep(2000);
	   	driver.quit();
	   		}

}
