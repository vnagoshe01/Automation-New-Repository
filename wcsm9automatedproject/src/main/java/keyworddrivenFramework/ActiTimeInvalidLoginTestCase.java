package keyworddrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLoginTestCase extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
		
		//To launch the browser  and close the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read the data from excel file 
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,INVALID_SHEETNAME);
		
		for(int i=1;i<=rc;i++)
		{	
		
	
		        //identify username Text box
				WebElement usnTB = driver.findElement(By.name("username"));
				usnTB.sendKeys( flib.readDataFromExcel(EXCEL_PATH,INVALID_SHEETNAME,i,0));
				//identify password Text Box
				WebElement passTB = driver.findElement(By.name("pwd"));
				passTB.sendKeys( flib.readDataFromExcel(EXCEL_PATH,INVALID_SHEETNAME,i,1));
				//identify login Button and click
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("username")).clear();
				
				
		}	
		bt.closeBrowser();
	}
}
