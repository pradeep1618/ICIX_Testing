package icix.Tests;



import org.testng.annotations.Test;

import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.AccountTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;

import java.lang.reflect.Method;



public class TC9663_Test extends TestBase  {
	LoginOut objLoginOut = new LoginOut();
	TPGroupCompliance ObjTP=new TPGroupCompliance();

	@Test
	public void TPG_Tags(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		// Login as Requester 
			

				objLoginOut.loginAs(LoginOutTestData.Requestor);
       ObjTP.TPRelationshipChange(AccountTestData.tPGRelationName_TC9663, AccountTestData.relationshipType_TC9663, AccountTestData.changeRelationship_TC9663);
		
	
		
	
	
		
		
	}

}