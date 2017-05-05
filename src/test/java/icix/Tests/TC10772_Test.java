package icix.Tests;
import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPComplianceTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

import org.testng.annotations.Test;

/*Tp Group Compliance - Workflow Status and Request Status are unaffected, 
  after a requirement is removed from a group which is also existing on other group*/




public class TC10772_Test extends TestBase {


	FormList ObjForm=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	LoginOut objLoginOut = new LoginOut();



	@Test
	public void VerifySendReqAtRespSide() throws Exception {
		// Login as Requester 
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");
		// Create New Form
		ObjForm.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
		Log.info("Form Created Successfully");

		//	Common.openAppLauncher();
		Log.info("Form created");
		// Create a Trading partner Group
		ObjTP.createTPG(TPComplianceTestData.TC10772tpgName, TPComplianceTestData.TC10772tpgTags, TPComplianceTestData.TC10772tpgStatus, TPComplianceTestData.TC10772tpgType);
		Common.deleteCookies(80);
		Log.info("TPG Created Successfully");
		// Create Trading Partner Group

			
		ObjTP.SetRequirement(TPComplianceTestData.TC10772requestType, FormListTestData.formNames_TC9670, TPComplianceTestData.TC10772saveOrSend);
		
		Log.info("Requirement is been send ");
		ObjTP.deleteReqs(TPComplianceTestData.TC10772removeReqs);
	//	ObjTP.deleteRequirement(TPComplianceTestData.TC10772tpgName);
		Log.info("Requirement is been deleted ");

		//searchKeyWord ="formsForAutomationThu Feb 16 12:07:21 IST 2017";
		
		ObjTP.searchAnything(TPComplianceTestData.TC10772tabName, TPComplianceTestData.TC10772searchKeyWord);
	//	ObjTP.searchAnything(TPComplianceTestData.TC10772tabName,"RemoveAndReAddReqSendThu Mar 02 14:13:53 IST 2017");
		
		Common.deleteCookies(80);
		ObjTP.SetRequirement(TPComplianceTestData.TC10772requestType2, FormListTestData.formNames_TC9670, TPComplianceTestData.TC10772saveOrSend2);
		Log.info("Requirement is been send again ");
		TakeScreenshots.takescreenshotOnSuccess();
/*
		ObjTP.searchAnything(TPComplianceTestData.TC10772tabName1, TPComplianceTestData.TC10772searchKeyWord);

		//ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);


		ObjTP.assertReqWFnStatus(TPComplianceTestData.TC10772reqStatus, TPComplianceTestData.TC10772wfStatus);
*/


	}
}
