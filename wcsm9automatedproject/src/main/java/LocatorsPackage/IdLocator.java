package LocatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dhanshri/Desktop/Web%20Element/simplelogin.html");
		
		Thread.sleep(2000);
		//identify usernameTB by using id 
		driver.findElement(By.id("i1")).sendKeys("admin");
		//identify passwordTB by using id
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("manager");
	}

}
