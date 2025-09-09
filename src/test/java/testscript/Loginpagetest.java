package testscript;
import org.testng.annotations.Test;

import constants.Contants;
import pages.Homepage;
import pages.Loginpage;
import utilities.Excelutility;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Loginpagetest extends Baseclass {
	Homepage homepage;
	
	 @Test @Parameters({"username","password"})
	  public void verifyusercanabletologincorrectusernameandpassword(String username,String password)
	  {
		 Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername(username,password);
		 
		homepage= loginpage.clickLogin();
		 boolean ishomepageisloaded=loginpage.IsDashboardisDisplayed();
		 Assert.assertTrue(ishomepageisloaded,Contants.ERRORMESSAGEFORLOGIN);
		  
	  }
	  @Test
	  public void verifyusercanabletologincorrectusernameandincorrectpassword() throws IOException
	  {
		  String username=Excelutility.getStringData(1, 0, "Loginpagetest");
		  String password=Excelutility.getStringData(1, 1, "Loginpagetest");
		 Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("admin","1q2w3e5e");
		 loginpage.clickLogin();
		 boolean isalertdisplayed1=loginpage.isalertDisplayed();
		 Assert.assertTrue(isalertdisplayed1,Contants.ERRORMESSAGEFORALERT);
		  
	 }
	  @Test(dataProvider = "credentials1")
	 public void verifyusercanabletologinincorrectusernameandcorrectpassword(String username,String password)
	  {
		 Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername(username,password);
		 loginpage.clickLogin();
		 boolean isalertdisplayed2=loginpage.isalertDisplayed();
		 Assert.assertTrue(isalertdisplayed2,Contants.ERRORMESSAGEFORALERT1);
		  
		  
	  }
	  @Test
	  public void verifyusercanabletologinincorrectusernameandincorrectpassword() throws IOException
	  {
		  String username=Excelutility.getStringData(2, 0, "Loginpagetest");
		  String password=Excelutility.getStringData(2, 1, "Loginpagetest");
		  
		Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("carols","1q2w3e5e");
		loginpage.clickLogin();
		 boolean isalertdisplayed3=loginpage.isalertDisplayed();
		 Assert.assertTrue(isalertdisplayed3,Contants.ERRORMESSAGEFORALERT2);
		  
		  
	  }
	  @DataProvider(name="credentials1")
	  public Object[][] testdata()
	  {
		  Object data[][]= {{"admin","admins1"},{"carols","admin"}};
		  return data;
	  }
	  
	}
 

