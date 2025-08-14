package testscript;
import org.testng.annotations.Test;

import pages.Loginpage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Loginpagetest extends Baseclass {
	
	 @Test @Parameters({"username","password"})
	  public void verifyusercanabletologincorrectusernameandpassword(String username,String password)
	  {
		 Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername(username,password);
		 loginpage.clickLogin();
		  
	  }
	  @Test
	  public void verifyusercanabletologincorrectusernameandincorrectpassword()
	  {
		 Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("admin","1q2w3e5e");
		 loginpage.clickLogin();
		  
	 }
	  @Test(dataProvider = "credentials1")
	 public void verifyusercanabletologinincorrectusernameandcorrectpassword(String username,String password)
	  {
		 Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername(username,password);
		 loginpage.clickLogin();
		  
	  }
	  @Test
	  public void verifyusercanabletologinincorrectusernameandincorrectpassword()
	  {
		Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("carols","1q2w3e5e");
		loginpage.clickLogin();
		  
	  }
	  @DataProvider(name="credentials1")
	  public Object[][] testdata()
	  {
		  Object data[][]= {{"admin","admin"},{"carols","admin"}};
		  return data;
	  }
	  
	}
 

