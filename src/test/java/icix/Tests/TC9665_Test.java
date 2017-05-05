package icix.Tests;
import org.testng.annotations.Test;
 




import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.LoginOutTestData;
import icix.TestData.TradingPatnerTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;
 
public class TC9665_Test extends TestBase {
 
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	LoginOut objLoginOut = new LoginOut();
	FormList ObjForm=new FormList();
	@Test
	public void TPG_Tags() throws Exception {

		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Login Successfull");
		// Creating simple Trading partner group using tag		
		ObjTP.createTPG(TradingPatnerTestData.tpgName_9665,  TradingPatnerTestData.tpgTags_9665, TradingPatnerTestData.tpgStatus_9665,  TradingPatnerTestData.tpgType_9665);
		Thread.sleep(5000);
		Log.info("TPG Created Successfully");

		ObjTP.editTPG(TradingPatnerTestData.editTags_9665);	
		Log.info("Tag is been editted ");
	}
}	