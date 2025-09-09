package testscript;

import org.testng.annotations.Test;

import constants.Contants;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageCategory;

public class ManageCategoryTest extends Baseclass{
	ManageCategory manage;
  @Test(retryAnalyzer = retry.Retry.class)
  public void managecategory() {

	  
	Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("admin","admin");
		Homepage homepage = loginpage.clickLogin();
		
		manage = homepage.moreinfocategory();
		manage.savebutton().categorypage().discountoption().choosefile(Contants.imagepath).topmenushow().leftmenushow().button();
		
  }
}
