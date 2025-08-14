package testscript;

import org.testng.annotations.Test;

import pages.Adminuser;
import pages.Loginpage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class Adminusertest extends Baseclass{
	
	
  @Test
  public void adminusers() 
  {
	  Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("admin","admin");
		 loginpage.clickLogin();
		 
	  Adminuser test=new  Adminuser(driver);
	  test.moreinfo();
	  test.clicks();
	  test.home("aiswarya@123","123");
	  test.user();
	  test.saveclick();
	
	  
	  
  }
  
  
	

  }


