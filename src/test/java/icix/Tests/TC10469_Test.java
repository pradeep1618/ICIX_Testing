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

public class TC10469_Test extends TestBase{

	TPGroupCompliance ObjTP=new TPGroupCompliance();
	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();




	@Test
	public void Save_reqs() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");
		
		ObjFormList.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
	// Creating simple Trading partner group using tag		
		ObjTP.createTPG(TPComplianceTestData.tpgName_TC10469, TPComplianceTestData.tpgTags_TC10469, TPComplianceTestData.tpgStatus_TC10469, TPComplianceTestData.tpgType_TC10469);

		// Set requirements	then save	
		ObjTP.SetRequirement(TPComplianceTestData.requestType_TC10469, FormListTestData.formNames, TPComplianceTestData.saveOrSend_TC10469);
		// Verify the request at Requester side






	}
}	