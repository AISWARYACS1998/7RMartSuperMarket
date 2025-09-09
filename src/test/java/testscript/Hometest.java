package testscript;

import pages.Loginpage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Contants;
import pages.Homepage;

public class Hometest extends Baseclass {
	Homepage homepage;
  @Test
		 @Parameters({"username","password"})
  
  public void verifyusercanlogout(String username,String password)
  {
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUsername(username,password);
		homepage= loginpage.clickLogin();
		homepage.adminclick().logoutclick();
		//boolean isdisplay=homepage.isAvatarDisplayed();
		//Assert.assertTrue(isdisplay,Contants.NOTDISPLAYIMAGE);
		//String title = driver.getTitle();
		 //System.out.println(title);
		 // String expectedTitle = "Login | 7rmart supermarket";
		//  String actualTitle  = driver.getTitle();
		 // Assert.assertEquals(actualTitle,expectedTitle,Contants.TITLEDISPLAY);
		
		// Homepage log=new  Homepage(driver);
		// log.adminclick();
		// log.logoutclick();
		// String expected="Login | 7mart supermarket";
		// String actual=driver.getTitle();
		 
  }
}
