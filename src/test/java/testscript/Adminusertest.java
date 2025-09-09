package testscript;

import org.testng.annotations.Test;

import pages.Adminuser;
import pages.Homepage;
import pages.Loginpage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class Adminusertest extends Baseclass{
	Homepage homepage;
	Adminuser adminuser;
	
	
  @Test
  @Parameters({"username","password"})
  
  public void adminusers(String username,String password) 
  {
	  Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername(username,password);
		homepage= loginpage.clickLogin();
		 
	 adminuser=homepage.moreinfo();
	 adminuser.clicks().home("aiswarya1234", "admin2").user().saveclick();
	 
	// adminuser= test.moreinfo();
	 // test.clicks();
	  //test.home("aiswarya@123","123");
	 // test.user();
	 // test.saveclick();
	
	  
	  
  }
  
  
	

  }


