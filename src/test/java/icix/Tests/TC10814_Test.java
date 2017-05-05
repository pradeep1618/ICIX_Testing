package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;
import icix.Utils.Common;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;

import java.lang.reflect.Method;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*TP Group Compliance - Remove the member for which request is Rejected and 
  Re-add same member*/


public class TC10814_Test extends TestBase{

	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();




	@Test
	public void RemoveRejectedMemberThenAddSameMember(Method method) throws Exception {

		// Login as Requester 
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
		ObjTP.createTPG(TPGroupComplianceTestData.tpgName_TC10814, TPGroupComplianceTestData.tpgTags_TC10814, TPGroupComplianceTestData.tpgStatus_TC10814, TPGroupComplianceTestData.tpgType_TC10814);
		Log.info("Set Requirement");
		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10814, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10814);
		Log.info("Logout from Requester End");
		objLoginOut.logout();
		Log.info("Login as Responder");
		objLoginOut.loginAs(LoginOutTestData.Responder);
		Log.info("Searching request at respomnder end");
		Common.GlobalSearch(TPGroupComplianceTestData.tabNameForGlobalSearch_TC10814, TPGroupComplianceTestData.searchKeyWord__TC10814);
		//Common.GlobalSearch(TPGroupComplianceTestData.tabNameForGlobalSearch_TC10814,"AutomationFormTue Feb 28 09:36:55 IST 2017");

		
		//searchKeyWord ="AutomationFormMon Feb 27 20:35:01 IST 2017 2017-02-27 15:08:12";
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10814,TPGroupComplianceTestData.searchKeyWord__TC10814);
		// submit request at responder side	
		ObjTP.submitRequest(null);
		Common.LogoutUser();
		Thread.sleep(300000);

		// Login as Requester 
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		// Search and approve request


	//Common.GlobalSearch(TPGroupComplianceTestData.tabNameForGlobalSearch_TC10814, "AutomationFormTue Feb 28 09:36:55 IST 2017");


		//searchKeyWord ="AutomationFormMon Feb 27 20:35:01 IST 2017 2017-02-27 15:08:12";
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10814,TPGroupComplianceTestData.searchKeyWord__TC10814);

		ObjTP.approveOrRejectRequest(TPGroupComplianceTestData.approveOrReject_TC10814);



		// search for tpg	
		
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName1_TC10814,TPGroupComplianceTestData.searchKeyWord__TC10814);
		//	Common.deleteCookies(8000);
		// remove member
		ObjTP.editTPG(TPGroupComplianceTestData.editTags_TC10814);
		Common.deleteCookies(8000);
		// Re-add same member	
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName1_TC10814,TPGroupComplianceTestData.searchKeyWord__TC10814);

		//	Common.deleteCookies(8000);
		ObjTP.editTPG(TPGroupComplianceTestData.editTags_TC10814);
		// Search for request
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10814,TPGroupComplianceTestData.searchKeyWord__TC10814);
		// Assert workflow status
		
		//ObjTP.assertWFStatusAtRequesterEnd(reqStatus, wfStatus);	
		//ObjTP.assertReqWFnStatus(ReqStatus, wfStatus);



	}
}
