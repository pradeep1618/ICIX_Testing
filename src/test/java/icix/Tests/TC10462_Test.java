package icix.Tests;

import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupTestData;
 
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

import java.lang.reflect.Method;
 import org.testng.annotations.Test;

//Verify Creating a TP group with Relationship Type only

public class TC10462_Test extends TestBase{
	
	LoginOut objLoginOut = new LoginOut();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	
	


	@Test
	public void TPG_RelationshipType(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		Log.info("==== Login with requestor =====");
		//Login with requestor
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
	//	objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		Log.info("==== Creating New Trading Partner Group with RelationshipType =====");
		// Creating New Trading Partner Group with RelationshipType
		ObjTP.createTPG(TPGroupTestData.tpgName_TC10462, TPGroupTestData.tpgTags_TC10462, TPGroupTestData.tpgStatus_TC10462, TPGroupTestData.tpgType_TC10462);
		TakeScreenshots.takescreenshotOnSuccess();
	}
}	