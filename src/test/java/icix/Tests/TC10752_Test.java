package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPComplianceTestData;
import icix.TestData.TPGroupComplianceTestData;
import icix.TestData.TPGroupTestData;
import icix.Utils.Common;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class TC10752_Test extends TestBase{

	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	
	@Test
	public  void VerifySendReqAtRespSide(Method method) throws Exception {
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
		ObjTP.createTPG(TPGroupComplianceTestData.tpgName_TC10752, TPGroupComplianceTestData.tpgTags_TC10752, TPGroupComplianceTestData.tpgStatus_TC10752, TPGroupComplianceTestData.tpgType_TC10752);
		Log.info("Set Requirement");
		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10752, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10752);
		Log.info("Logout from Requester End");
		objLoginOut.logout();
		Log.info("Login as Responder");
		objLoginOut.loginAs(LoginOutTestData.Responder);
		Log.info("Searching request at respomnder end");
		//Common.GlobalSearch(TPGroupComplianceTestData.tabName_TC10752, TPGroupComplianceTestData.searchKeyWord_TC10752);
		//Thread.sleep(400000);
		//AutomationFormMon Feb 27 20:35:01 IST 2017 2017-02-27 15:08:12
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10752,TPGroupComplianceTestData.searchKeyWord_TC10752);
	 //   ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10752,"AutomationFormWed Mar 01 20:06:35 IST 2017");
		
	    //ObjTP.assertReqWFnStatus(TPGroupComplianceTestData.reqStatus_TC10752, TPGroupComplianceTestData.wfStatus_TC10752);

	    TakeScreenshots.takescreenshotOnSuccess();
		
	}
}
