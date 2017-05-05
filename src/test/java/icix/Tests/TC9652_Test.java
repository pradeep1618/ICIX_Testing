package icix.Tests;

import org.testng.annotations.Test;

import icix.Modules.Account;
import icix.Modules.LoginOut;
import icix.TestData.LoginOutTestData;
import icix.TestData.TradingPatnerTestData;
import icix.Utils.TestBase;

public class TC9652_Test extends TestBase {
	String requesterUserType = null;
	Account objAccount = new Account();
	LoginOut objLoginOut = new LoginOut();



	@Test
	public void testSearchByAddAndName() throws Exception {

		objLoginOut.loginAs(LoginOutTestData.Requestor);
		// Login to the salesforce
		objAccount.searchByTpNameAndAddress(TradingPatnerTestData.tradingPartnerName, TradingPatnerTestData.address, TradingPatnerTestData.city, TradingPatnerTestData.state,TradingPatnerTestData.postalCode);

	}

}
