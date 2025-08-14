package testscript;

import pages.Loginpage;

import org.testng.annotations.Test;

import pages.Homepage;

public class Hometest extends Baseclass {
  @Test
  
  public void verifyusercanlogout()
  {
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUsername("admin","admin");
		 loginpage.clickLogin();
		
		 Homepage log=new  Homepage(driver);
		 log.adminclick();
		 log.logoutclick();
		 
  }
}
