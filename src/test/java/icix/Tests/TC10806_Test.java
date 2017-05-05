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

import org.testng.annotations.Test;

//TP group Compliance - Remove the member for which request is approved and Re-add same


public class TC10806_Test extends TestBase {
	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();


	@Test
	public void RemoveMemberApprovedReqReadd(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		// Login as Requester 
			

				objLoginOut.loginAs(LoginOutTestData.Requestor);
				Log.info("Creating New Form");
				ObjFormList.createNewForm(FormBuilderTestData.BPform_TC9670, FormBuilderTestData.NoOfTabs_TC9670, FormBuilderTestData.NoOfSections_TC9670, FormBuilderTestData.generateServiceSection_TC9670, 
						FormBuilderTestData.NoOfQuestions_TC9670, FormBuilderTestData.NoOfLinkedQuest_TC9670, FormBuilderTestData.NoOfReqQuest_TC9670, FormBuilderTestData.NoOfReadOnlyQuest_TC9670,
						FormBuilderTestData.ansType_TC9670, FormBuilderTestData.picklistVal_TC9670, FormBuilderTestData.MultiPickVal_TC9670, 
						FormBuilderTestData.NamenValue_TC9670, FormBuilderTestData.defaultVal_TC9670, FormBuilderTestData.dependencyValue_TC9670, 
						FormBuilderTestData.newFeature_TC9670, FormBuilderTestData.formNames_TC9670);

				Log.info("Creating TPG");
				ObjTP.createTPG(TPGroupComplianceTestData.tpgName_TC10806, TPGroupComplianceTestData.tpgTags_TC10806, TPGroupComplianceTestData.tpgStatus_TC10806, TPGroupComplianceTestData.tpgType_TC10806);
				Log.info("Set Requirement");
				ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10806, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10806);
				Log.info("Logout from Requester End");
				objLoginOut.logout();
				Log.info("Login as Responder");
				objLoginOut.loginAs(LoginOutTestData.Responder);
				Log.info("Searching request at respomnder end");
				Common.GlobalSearch(TPGroupComplianceTestData.tabNameForGlobalSearch_TC10814, TPGroupComplianceTestData.searchKeyWord_TC10806);
				//Common.GlobalSearch(TPGroupComplianceTestData.tabNameForGlobalSearch_TC10806,"AutomationFormTue Feb 28 09:36:55 IST 2017");

				
				//searchKeyWord ="AutomationFormMon Feb 27 20:35:01 IST 2017 2017-02-27 15:08:12";
				ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10806,TPGroupComplianceTestData.searchKeyWord_TC10806);
				// submit request at responder side	
				ObjTP.submitRequest(null);
				Common.LogoutUser();
				Thread.sleep(300000);

				// Login as Requester 
				objLoginOut.loginAs(LoginOutTestData.Requestor);
				// Search and approve request


			//Common.GlobalSearch(TPGroupComplianceTestData.tabNameForGlobalSearch_TC10806, "AutomationFormTue Feb 28 09:36:55 IST 2017");


				//searchKeyWord ="AutomationFormMon Feb 27 20:35:01 IST 2017 2017-02-27 15:08:12";
				ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10806,TPGroupComplianceTestData.searchKeyWord_TC10806);

				ObjTP.approveOrRejectRequest(TPGroupComplianceTestData.approveOrReject_TC10806);



				// search for tpg	
				
				ObjTP.searchAnything(TPGroupComplianceTestData.tabName1_TC10806,TPGroupComplianceTestData.searchKeyWord_TC10806);
				//	Common.deleteCookies(8000);
				// remove member
				ObjTP.editTPG(TPGroupComplianceTestData.editTags_TC10806);
				Common.deleteCookies(80);
				// Re-add same member	
				ObjTP.searchAnything(TPGroupComplianceTestData.tabName1_TC10806,TPGroupComplianceTestData.searchKeyWord_TC10806);

				//	Common.deleteCookies(8000);
				ObjTP.editTPG(TPGroupComplianceTestData.editTags_TC10806);
				// Search for request
				ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10806,TPGroupComplianceTestData.searchKeyWord_TC10806);
				// Assert workflow status
				
				//ObjTP.assertWFStatusAtRequesterEnd(reqStatus, wfStatus);	
				//ObjTP.assertReqWFnStatus(ReqStatus, wfStatus);

	}
}
