package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-gq18f8q/login.do");
		
		//take a title of Login page 
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		
	}
}
