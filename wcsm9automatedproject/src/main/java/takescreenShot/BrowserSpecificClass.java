package takescreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BrowserSpecificClass {
	public static void main(String[] args) throws IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
	ChromeDriver chrome=new ChromeDriver();
		//call the method
	File src = chrome.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ss3.png");
		
		Files.copy(src, dest);
		
}
}