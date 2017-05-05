package icix.Tests;

import icix.Modules.Account;
import icix.Modules.LoginOut;
 
 
import icix.TestData.LoginOutTestData;
import icix.TestData.ProductTestData;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
 

 

import icix.Utils.TestBase;

import org.testng.annotations.Test;


public class TC9647_Test extends TestBase{
	
	Account objAccount = new Account();
	LoginOut objLoginOut = new LoginOut();

	 
	 

	@Test
	public void Account_verification() throws Exception {
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		TakeScreenshots.takescreenshotOnSuccess();
		Log.info("Login Successfully ");
			 
		objAccount.searchTradingPartner(ProductTestData.ICIXiD_9647,null, ProductTestData.type_9647);
		
	}



}
