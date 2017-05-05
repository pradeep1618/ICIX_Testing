package icix.Tests;

import org.testng.annotations.Test;

import icix.Modules.Account;
import icix.Modules.LoginOut;
import icix.TestData.AccountTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;
 



public class TC9653_Test extends TestBase {
	String requesterUserType = null;

	Account objAccount = new Account();
	LoginOut objLoginOut = new LoginOut();

	


	
	@Test
	public void Account_verification() throws Exception {


		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");


		objAccount.searchTradingPartner(null, AccountTestData.tagName_9653, AccountTestData.type_9653);
		objAccount.connectTradingPartner(AccountTestData.relationshipType_9653,AccountTestData.relInfoCmnts_9653,AccountTestData.tagName_9653);
		objAccount.verifyConnect();
		objLoginOut.logout();
	}

}
