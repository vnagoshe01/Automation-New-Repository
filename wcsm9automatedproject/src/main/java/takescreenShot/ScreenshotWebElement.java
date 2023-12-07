package takescreenShot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

import com.google.common.io.Files;

public class ScreenshotWebElement {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		// handle pop up
		driver.findElement(By.id("denyBtn")).click();
		
		//identify coins and perform mouseHover
		WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
	
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(coinsTarget).perform();
		
		// identify coins by design and click
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		
		//take a screenshot of coins element
		Thread.sleep(2000);
		WebElement coinElement = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
		
		File src = coinElement.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/webelement.png");
		//store the screenshot into dest
		Files.copy(src, dest);
		
		Thread.sleep(2000);
		driver.quit();
}
}