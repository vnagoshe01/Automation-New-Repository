package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupOnOmayo {
	 public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     	driver.get("https://omayo.blogspot.com/");
	     	driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
	     	 Alert al = driver.switchTo().alert();
	         Thread.sleep(2000);
	         al.accept();
	        // al.dismiss();
	     // String textOfalert = al.getText();
	     // System.out.println(textOfalert);
	      
}
}