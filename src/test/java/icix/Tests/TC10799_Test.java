package icix.Tests;

import java.lang.reflect.Method;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;

import org.testng.annotations.Test;

//Scenario : Tp Group Compliance - Automatic request creation by adding a member automatically to a group

public class TC10799_Test extends TestBase{

	FormList ObjForm=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void AutoReqCreationAddTP(Method method) throws Exception {
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjForm.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
		// Create a Trading partner Group
		ConsoleLog.info("Creating TPG");
		ObjTP.createTPG(TPGroupComplianceTestData.tpgName_TC10799, TPGroupComplianceTestData.tpgTags_TC10799, TPGroupComplianceTestData.tpgStatus_TC10799, TPGroupComplianceTestData.tpgType_TC10799);

		// Set the Requirements then save
		ConsoleLog.info("SetRequirement");
		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10799, TPGroupComplianceTestData.formNames_TC10799, TPGroupComplianceTestData.saveOrSend_TC10799);	

		// Edit tpg to add members
		ConsoleLog.info("Edit TPG");
		ObjTP.editTPG(TPGroupComplianceTestData.editTags_TC10799);
		
		// Search for request
		ConsoleLog.info("Search Anything");
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10799, TPGroupComplianceTestData.searchKeyWord_TC10799);
		
	}
}
