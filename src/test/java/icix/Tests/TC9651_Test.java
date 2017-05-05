package icix.Tests;

import org.testng.annotations.Test;

import icix.Modules.Account;
 
 
import icix.Modules.LoginOut;
import icix.TestData.AccountTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;
 

public class TC9651_Test extends TestBase {
	Account ObjAcc = new Account();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void TPSearchByAddress () throws Exception{

		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Login Succesful");

		ObjAcc.searchByTpNameAndAddress( AccountTestData.tradingPartnerName_9651, AccountTestData.Address_9651,  AccountTestData.city_9651, AccountTestData.state_9651, AccountTestData.zipcode_9651);

		Log.info("Search Succesffuly ");
	}


}
