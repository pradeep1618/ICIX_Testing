package icix.Tests;
 
 import icix.Modules.LoginOut;
 
import icix.Modules.Product;
import icix.TestData.LoginOutTestData;
import icix.TestData.ProductTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;
 

 






import org.testng.annotations.Test;
/*
Verify user is able to create New Tags in create Product page
 */
public class TC9659_Test extends TestBase{

	Product objProduct = new Product();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void CreateNewTagsICIXProdct() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		TakeScreenshots.takescreenshotOnSuccess();
		Log.info("Login Successfully ");
	  	objProduct.addAndVerifyTag(ProductTestData.TradingPartnerName_9659, ProductTestData.NameofProduct_9659, ProductTestData.TpgTagsName_9659);
		Common.LogoutUser();		
	}

}
