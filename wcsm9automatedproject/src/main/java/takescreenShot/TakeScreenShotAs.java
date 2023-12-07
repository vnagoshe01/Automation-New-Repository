package takescreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotAs {
	public static void main(String[] args) throws IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.selenium.dev/");
	// take a screenshot by using explicit typecasting into TakesScreenshot (I),webpage
	TakesScreenshot ts = (TakesScreenshot)driver;
	//call the method
	File src = ts.getScreenshotAs(OutputType.FILE);
	//define way of storing screenshot...(//-relative xpath,./-absolute x path
	File dest = new File("./Screenshots/ss2.png");
	//store the screenshot into dest
	Files.copy(src, dest);
	
	
}
}