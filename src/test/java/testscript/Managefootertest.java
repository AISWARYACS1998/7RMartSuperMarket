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
	@Parameters({ "username", "password","address","email","phone" })
	public void manageFooterTestMethods(String username, String password,String address,String email,String phone) throws IOException {
		Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername(username,password);
		Homepage homepage = loginpage.clickLogin();
		
		managefooter = homepage.moreinfofootertext();
		managefooter.enterEditFooter().enterAddressFooter(address)
				.enterEmailFooter(email)
				.enterPhoneNumber(phone).enterUpdate();

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