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


// Verify Creating a TP group with Tags only

public class TC10460_Test extends TestBase{
	
	LoginOut objLoginOut = new LoginOut();
	TPGroupCompliance ObjTP=new TPGroupCompliance();

	

	@Test
	public void TPG_Tags(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		Log.info("==== Login with requestor =====");
		//Login with requestor
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
	//	objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		Log.info("==== Creating New Trading Partner Group with Tag  =====");
		// Creating New Trading Partner Group with Tag
		ObjTP.createTPG(TPGroupTestData.tpgName_TC10460, TPGroupTestData.tpgTags_TC10460, TPGroupTestData.tpgStatus_TC10460, TPGroupTestData.tpgType_TC10460);
		TakeScreenshots.takescreenshotOnSuccess();
	}
}	