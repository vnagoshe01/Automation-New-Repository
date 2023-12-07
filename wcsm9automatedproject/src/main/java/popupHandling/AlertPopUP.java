package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUP {
     public static void main(String[] args) throws InterruptedException {
	   WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	driver.get("https://demoapps.qspiders.com/");
       driver.findElement(By.xpath("//section[text()='Popups']")).click();
          Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Javascript']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
       Thread.sleep(2000);
      Alert al = driver.switchTo().alert();
      Thread.sleep(2000);
     // al.accept();
     // al.dismiss();
   String textOfalert = al.getText();
   System.out.println(textOfalert);
   
      
      
} 
}
