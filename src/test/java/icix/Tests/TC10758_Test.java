package icix.Tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormBuilderTestData;
 
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;
 
 
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

//Scenario ---  Verify that No same requirement addition in same group

public class TC10758_Test extends TestBase{
	FormList ObjFormList=new FormList();
	LoginOut objLoginOut = new LoginOut();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	
	@Test
	public void VerifyNoSameReqAddInSameGrp (Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());

		//Login with requester
		objLoginOut.loginAs(LoginOutTestData.Requestor);

		//Create New Form
		ObjFormList.createNewForm(FormBuilderTestData.BPform_TC9670, FormBuilderTestData.NoOfTabs_TC9670, FormBuilderTestData.NoOfSections_TC9670, FormBuilderTestData.generateServiceSection_TC9670, 
				FormBuilderTestData.NoOfQuestions_TC9670, FormBuilderTestData.NoOfLinkedQuest_TC9670, FormBuilderTestData.NoOfReqQuest_TC9670, FormBuilderTestData.NoOfReadOnlyQuest_TC9670,
				FormBuilderTestData.ansType_TC9670, FormBuilderTestData.picklistVal_TC9670, FormBuilderTestData.MultiPickVal_TC9670, 
				FormBuilderTestData.NamenValue_TC9670, FormBuilderTestData.defaultVal_TC9670, FormBuilderTestData.dependencyValue_TC9670, 
				FormBuilderTestData.newFeature_TC9670, FormBuilderTestData.formNames_TC9670);
		ObjTP.createTPG(TPGroupComplianceTestData.TC10758tpgName, TPGroupComplianceTestData.tpgTags_10758, TPGroupComplianceTestData.TC10758tpgStatus, TPGroupComplianceTestData.TC10758tpgType);
		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10760, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10760);
		//ObjTP.verifySameRequirementAddedInSameGroup(FormBuilderTestData.formNames_TC9670);
		TakeScreenshots.takescreenshotOnSuccess();
	}

}
