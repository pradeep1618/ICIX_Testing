package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
 
import icix.Modules.TPGroupCompliance;
 
 
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPComplianceTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TestBase;
 






import org.testng.annotations.Test;

public class TC10797_Test extends TestBase {
	//FormProcess ObjForm = new FormProcess();
	TPGroupCompliance ObjTP = new TPGroupCompliance();

	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();


	@Test
	public void VerifySendReqAtRespSide() throws Exception {

		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");
		// Create New Form
		ObjFormList.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
		Log.info("Form Created Successfully");

		// Create a Trading partner Group
		ObjTP.createTPG(TPComplianceTestData.tpgName_TC10797, TPComplianceTestData.tpgTags_TC10797, TPComplianceTestData.tpgStatus_TC10797, TPComplianceTestData.tpgType_TC10797);
		Common.deleteCookies(8000);
		Log.info("TPG Created Successfully");

		// Set the Requirements then send
		ObjTP.SetRequirement(TPComplianceTestData.requestType_TC10797, FormListTestData.formNames_TC9670, TPComplianceTestData.saveOrSend_TC10797);
		// Verify the request at Requester side
		// then search
		Log.info("Requirement is set successfully ");

		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0],TPComplianceTestData.SearchTab);
		
		
		Log.info("Data is been searched");
		// Verify the request at requester side
		ObjTP.assertReqWFnStatus( TPComplianceTestData.ReqStatus_TC10797, TPComplianceTestData.wfStatus_TC10797);
		Log.info("Status is been checked successfully ");
		// Verify the request at Responder side
		objLoginOut.logout();
		Log.info("Logout from Requrestor side");
		//Thread.sleep(100000);
		objLoginOut.loginAs(LoginOutTestData.Responder);
		Log.info("Login As Responder");
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		Log.info("search for the Request at Responder side ");
		ObjTP.assertReqWFnStatus(TPComplianceTestData.ReqStatus_TC10797, TPComplianceTestData.wfStatus_TC10797);
		objLoginOut.logout();
	}
}


