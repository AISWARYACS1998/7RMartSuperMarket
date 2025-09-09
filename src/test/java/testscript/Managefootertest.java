package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Contants;
import pages.Homepage;
import pages.Loginpage;
import pages.Managefootertext;
import utilities.Excelutility;



public class Managefootertest extends Baseclass {
	Homepage homepage;
	Managefootertext managefooter;

	@Test
	@Parameters({ "username", "password" })
	public void manageFooterTestMethods(String username, String password) throws IOException {
		Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("admin","admin");
		Homepage homepage = loginpage.clickLogin();
		
		managefooter = homepage.moreinfofootertext();
		managefooter.enterEditFooter().enterAddressFooter(Excelutility.getStringData(1, 0, "managefootertest"))
				.enterEmailFooter(Excelutility.getStringData(1, 1, "managefootertest"))
				.enterPhoneNumber(Excelutility.getStringData(1, 2, "managefootertest")).enterUpdate();

		boolean isdisplay = managefooter.assertMethod();
		Assert.assertTrue(isdisplay, Contants.ERRORMESSAGEFORDISPLAY);

		/*
		 * ManageFooter managefooter = new ManageFooter(driver);
		 * managefooter.enterFootermoreInfo(); managefooter.enterEditFooter();
		 * managefooter.enterAddressFooter("AbC street");
		 * managefooter.enterEmailFooter("abc@gmail.com");
		 * managefooter.enterPhoneNumber("90909087"); managefooter.enterUpdate();
		 */
	}
}