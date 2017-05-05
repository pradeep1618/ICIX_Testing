package icix.Tests;

import icix.Modules.FormList;
 
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
 
 
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPComplianceTestData;
import icix.Utils.Common;
import icix.Utils.TestBase;

import org.testng.annotations.Test;

public class TC10805_Test extends TestBase{



	FormList ObjForm=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	LoginOut objLoginOut = new LoginOut();
	


	@Test
	public void RemoveReqAfterRespSubmitted() throws Exception {
		
		// Login as Requester 
	
		objLoginOut.loginAs(LoginOutTestData.Requestor);

		// Create New Form
		ObjForm.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
		 
		// Create Trading Partner Group

		ObjTP.createTPG(TPComplianceTestData.TC10805tpgName,  TPComplianceTestData.TC10805tpgTags, TPComplianceTestData.TC10805tpgStatus , TPComplianceTestData.TC10805tpgType);
		Common.deleteCookies(8000);
//Set Requirement 
		ObjTP.SetRequirement(TPComplianceTestData.TC10805requestType, FormListTestData.formNames_TC9670, TPComplianceTestData.TC10805saveOrSend);
		//	Verify the request at Responder	side
		objLoginOut.logout();
		Thread.sleep(60000);
		//Login Responder
		objLoginOut.loginAs(LoginOutTestData.Responder);

	
		//searchKeyWord ="formsForAutomationTue Feb 21 15:51:32 IST 2017";
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		// submit request at responder side	
		ObjTP.submitRequest(FormListTestData.tPRequestName);
		objLoginOut.logout();
		Thread.sleep(600000);

		// Login as Requester 
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		// Search and approve request
		
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		
	
		ObjTP.approveOrRejectRequest(TPComplianceTestData.TC10805approveOrReject);

		// search for tpg	
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		Common.deleteCookies(8000);
		// Remove requirement	
		ObjTP.deleteReqs(TPComplianceTestData.TC10805removeReqs);


		//	ObjTP.assertAndDeleteReqs(assertReqsSize,removeReqs);

		// Re-add same requirement and send
		
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		//Common.deleteCookies(8000);

		
		ObjTP.SetRequirement(TPComplianceTestData.TC10805requestType,FormListTestData.formName, TPComplianceTestData.TC10805saveOrSend);
		
		// Search for request
		
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		// Assert workflow status
		ObjTP.assertWFStatusAtRequesterEnd(TPComplianceTestData.TC10805reqStatus, TPComplianceTestData.TC10805wfStatus);

		//	ObjTP.assertReqWFStatus(ReqStatus, wfStatus);

	}	
}
