package testNgAnnotationandflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	@Test(description = "login performed")
	  public void loginMethod() {
		  
		  Reporter.log("Method1 For Login Page",true);
	  }
	  
	  @Test(description = "userCreated",dependsOnMethods ="loginMethod")
	  public void createUsersMethod() {
		  Reporter.log("Method2 For Users Page ",true);
	  }
	  
	  @Test(description = "login performed",dependsOnMethods = "createUsersMethod")				
	  public void logoutMethod() {
		  Reporter.log("Method3 For Logout Page ", true);
	  }
}
