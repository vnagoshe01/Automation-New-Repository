package testNgAnnotationandflags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProviderflag {
  @Test(dataProvider="TestData")
  public void invalidLoginMethod(String usn,String pass) {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-gq18f8q/login.do");
		driver.findElement(By.name("username")).sendKeys(usn);
       driver.findElement(By.name("pdw")).sendKeys(pass);
       driver.findElement(By.id("loginButton")).click();
       driver.findElement(By.name("username")).clear();
  }
  @DataProvider(name="TestData")
  public Object[][] actitimeTestDataMethod() {
	  Object[][] testData = new Object [5][2];
     testData[0][0]="ad_min";
     testData[0][1]="man_ager";
     
     testData[1][0]="admin12";
     testData[1][1]="manager12";
     
     testData[2][0]="ad@min";
     testData[1][1]="manager@12";
     
     testData[3][0]="12admin";
     testData[3][1]="12maager";
 
     testData[4][0]="manager";
     testData[4][1]="admin";
     return testData;
  }
}
