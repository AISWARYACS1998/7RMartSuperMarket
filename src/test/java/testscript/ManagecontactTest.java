package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Contants;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageContacts;
import utilities.Excelutility;

public class ManagecontactTest extends Baseclass {
	Homepage homepage;
	ManageContacts managecontact;

	@Test
	@Parameters({ "username", "password" })
	public void manageContactTestMethod(String username, String password) throws IOException {
		Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterUsername("admin","admin");
		Homepage homepage = loginpage.clickLogin();
		
		
		managecontact = homepage.moreinfocontact();
		managecontact.contactedit().updatePhoneNumber(Excelutility.getStringData(1, 0, "ManageContacttest"))
				.updateEmail(Excelutility.getStringData(1, 1, "ManageContacttest"))
				.updateAddress(Excelutility.getStringData(1, 2, "ManageContacttest"))
				.updateDeliveryTime(Excelutility.getStringData(1, 3, "ManageContacttest"))
				.updateDeliveryLimit(Excelutility.getStringData(1, 4, "ManageContacttest")).updateStatus();

		boolean isdisplay = managecontact.assertioncheck();
		Assert.assertTrue(isdisplay, Contants.ERRORMESSAGEFORDISPLAY);

		/*
		 * ManageContact managecontact = new ManageContact(driver);
		 * managecontact.contactMoreInfo(); managecontact.contactedit();
		 * managecontact.updatePhoneNumber("23445566");
		 * managecontact.updateEmail("aaannn@gmail.com");
		 * managecontact.updateAddress("Abc Street");
		 * managecontact.updateDeliveryTime("1 hr");
		 * managecontact.updateDeliveryLimit("30 sec"); managecontact.updateStatus();
		 */

	}
}