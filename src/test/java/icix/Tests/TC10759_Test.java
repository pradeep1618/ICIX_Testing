package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;

import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

// Verify Sending a request to a trading partner having Active TP relationship

public class TC10759_Test extends TestBase {
	
	
	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	@Test
	public void SendReqToActiveStatusTPG(Method method) throws Exception {
		
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Creating New Form");
		ObjFormList.createNewForm(FormBuilderTestData.BPform_TC9670, FormBuilderTestData.NoOfTabs_TC9670, FormBuilderTestData.NoOfSections_TC9670, FormBuilderTestData.generateServiceSection_TC9670, 
				FormBuilderTestData.NoOfQuestions_TC9670, FormBuilderTestData.NoOfLinkedQuest_TC9670, FormBuilderTestData.NoOfReqQuest_TC9670, FormBuilderTestData.NoOfReadOnlyQuest_TC9670,
				FormBuilderTestData.ansType_TC9670, FormBuilderTestData.picklistVal_TC9670, FormBuilderTestData.MultiPickVal_TC9670, 
				FormBuilderTestData.NamenValue_TC9670, FormBuilderTestData.defaultVal_TC9670, FormBuilderTestData.dependencyValue_TC9670, 
				FormBuilderTestData.newFeature_TC9670, FormBuilderTestData.formNames_TC9670);

		Log.info("Creating TPG");
		ObjTP.createTPG(TPGroupComplianceTestData.tpgName_TC10759, TPGroupComplianceTestData.tpgTags_TC10759, TPGroupComplianceTestData.tpgStatus_TC10759, TPGroupComplianceTestData.tpgType_TC10759);
		TakeScreenshots.takescreenshotOnSuccess();
		Log.info("Set Requirement");
		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10759, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10759);
		Log.info("Logout from Requester End");
		TakeScreenshots.takescreenshotOnSuccess();
		
		
	
	}
}
