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

public class TC10804_Test extends TestBase {

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
		
		ObjForm.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames2_TC9670);
		 
		// Create Trading Partner Group

		ObjTP.createTPG(TPComplianceTestData.TC10805tpgName,  TPComplianceTestData.TC10805tpgTags, TPComplianceTestData.TC10805tpgStatus , TPComplianceTestData.TC10805tpgType);
		Common.deleteCookies(8000);
//Set Requirement 
		ObjTP.SetRequirement(TPComplianceTestData.TC10805requestType, FormListTestData.formNames_TC9670, TPComplianceTestData.TC10805saveOrSend);
		//	Verify the request at Responder	side
		
		ObjTP.SendNewRequirement(TPComplianceTestData.TC10805requestType,  FormListTestData.formNames2_TC9670,  TPComplianceTestData.TC10805saveOrSend);
		
		
	}
	
}
