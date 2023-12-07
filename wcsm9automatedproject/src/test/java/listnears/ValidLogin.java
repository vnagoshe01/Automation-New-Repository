package listnears;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Customelistners.class)

public class ValidLogin extends BaseTest {
  @Test
  public void validLoginMethod() {
	  
	  String expectedLoginTitle = "actiTime-Login";
	  Assert.assertEquals(driver.getTitle(),expectedLoginTitle);
	  
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	  
	  
  }
}