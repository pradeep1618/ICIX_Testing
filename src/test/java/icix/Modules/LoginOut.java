package icix.Modules;

import org.testng.Assert;
 
import icix.TestData.LoginOutTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;

public class LoginOut {

	public void loginAs(String actor){
		switch(actor){
		case "Requestor":
			Common.LoginUser(LoginOutTestData.RequesterUserName, LoginOutTestData.RequestorPassword);
			Log.info("Requestor logged in successfully.");
			break;

		case "Responder":
			Common.LoginUser(LoginOutTestData.ResponderUsername, LoginOutTestData.ResponderPassword);
			Log.info("Responder logged in successfully.");
			break;

		case "Laboratory":
			Common.LoginUser(LoginOutTestData.LabUserName, LoginOutTestData.LabPassword);
			Log.info("Laboratory logged in successfully.");
			break;

		default:
			Assert.assertTrue(false, "Not a valid user type.");
		}
	}

	public void logout(){
		Common.LogoutUser();
		Log.info("Logging out the user");
		TakeScreenshots.takescreenshotOnSuccess();
	}
}
