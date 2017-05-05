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

public class TC10796_Test extends TestBase {
	//FormProcess ObjForm = new FormProcess();
	TPGroupCompliance ObjTP = new TPGroupCompliance();

	FormList ObjForm=new FormList();

	LoginOut objLoginOut = new LoginOut();


	@Test
	public void VerifySendReqAtRespSide() throws Exception {

		objLoginOut.loginAs(LoginOutTestData.Requestor);
	 
		// Create New Form
		ObjForm.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
		Log.info("Form Created Successfully");

		// Create a Trading partner Group
		ObjTP.createTPG(TPComplianceTestData.tpgName_TC10796, TPComplianceTestData.tpgTags_TC10796, TPComplianceTestData.tpgStatus_TC10796, TPComplianceTestData.tpgType_TC10796);
		Common.deleteCookies(8000);
		Log.info("TPG Created Successfully");

		// Set the Requirements then send
		ObjTP.SetRequirement(TPComplianceTestData.requestType_TC10796, FormListTestData.formNames_TC9670, TPComplianceTestData.saveOrSend_TC10796);
		// Verify the request at Requester side
		// then search
		Log.info("Requirement is set successfully ");
	 
		// Verify the request at Responder side
		objLoginOut.logout();
		
		
		Log.info("Logout from Requrestor side");
		//Thread.sleep(100000);
		objLoginOut.loginAs(LoginOutTestData.Responder);
		

		Log.info("Login As Responder");
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		Log.info("search for the Request at Responder side ");
		
		ObjTP.submitRequest(null); 
		
		objLoginOut.logout();
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
	 //ObjTP.deleteRequirement(TPComplianceTestData.tpgName_TC10796);
	 
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		 
		
		
	}
}


