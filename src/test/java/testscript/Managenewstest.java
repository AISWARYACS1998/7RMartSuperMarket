package testscript;

import org.testng.annotations.Test;

import pages.Adminuser;
import pages.Homepage;
import pages.Loginpage;
import pages.Managenews;

public class Managenewstest extends Baseclass{
	Adminuser adminuser;
	Managenews managenews;
  @Test
  public void managenewses() {

	  Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("admin","admin");
		Homepage homepage = loginpage.clickLogin();
		 
	 managenews=homepage.moreinfonews();
	 managenews.item().enternews().buttonclick();
  }
}
