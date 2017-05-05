package icix.Tests;

 
 
 
import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
 




import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPComplianceTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;

import org.testng.annotations.Test;

public class TC10803_Test extends TestBase {
	FormList ObjForm=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	LoginOut objLoginOut = new LoginOut();
 

 
	@Test
	public void VerifySendReqAtRespSide() throws Exception {
	 
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");

		// Assert. i.e No of forms
		ObjForm.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
		
		
		Log.info("Form Created Successfully");
		// Create a Trading partner Group
		ObjTP.createTPG(TPComplianceTestData.tpgName_10803, TPComplianceTestData.tpgTags_10803, TPComplianceTestData.tpgStatus_10803, TPComplianceTestData.tpgType_10803);

		Log.info("TPG created Successfully");

		ObjTP.SetRequirement(TPComplianceTestData.requestType_10803, FormListTestData.formNames_TC9670, TPComplianceTestData.saveOrSend_10803);

		ObjTP.createTPG(TPComplianceTestData.tpgName2_10803, TPComplianceTestData.tpgTags2_10803, TPComplianceTestData.tpgStatus2_10803, TPComplianceTestData.tpgType2_10803);
		// Set the Requirements then send
		ObjTP.SetRequirement(TPComplianceTestData.requestType_10803, FormListTestData.formNames_TC9670, TPComplianceTestData.saveOrSend_10798);
		// Edit tpg to no member
		Log.info("Requirement is been set ");
		ObjTP.editTPG(TPComplianceTestData.editTags_10803);	

		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
// 		Verify the request at requester side
		Log.info("Request is been searched");
//		ObjTP.assertReqWFnStatus(TPComplianceTestData.ReqStatus_10803, TPComplianceTestData.wfStatus_10803);
	
	}
	
}
