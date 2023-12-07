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

public class ScrollWebElementAndScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/");
    JavascriptExecutor jse = (JavascriptExecutor)driver;
       Thread.sleep(4000);
      // scroll till twitter symbol
       jse.executeScript("window.scrollBy(0,5000)");
WebElement twitterElement = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
File src = twitterElement.getScreenshotAs(OutputType.FILE);

File dest = new File("./Screenshots/Twitter.jpg");
//store the screenshot into dest
Files.copy(src, dest);

Thread.sleep(2000);
driver.quit();
	}
}
