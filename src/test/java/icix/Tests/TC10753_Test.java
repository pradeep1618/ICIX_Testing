package icix.Tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.Request;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;
import icix.Utils.ConsoleLog;
 
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

public class TC10753_Test extends TestBase{
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	LoginOut objLoginOut = new LoginOut();
	Request objRequest = new Request();
	@Test
	public void  VerifyRequestClosedAfterRemovingRequirement(Method method) throws Exception {
		ConsoleLog.info("The testcase name is VerifyRequestClosedAfterRemovingRequirement");
		TakeScreenshots.takescreenshotOnSuccess();	
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjFormList.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
			    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
			    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
			    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
			    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
		Thread.sleep(8000);
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		objRequest.VerifyRequestStatus("Open");
		ObjTP.deleteRequirement(TPGroupComplianceTestData.tpgName_TC9666);
		ObjTP.searchAnythingTest(FormListTestData.formNames_TC9670[0], FormListTestData.tPRequestName);
		objRequest.VerifyRequestStatus("Closed");
		//Deleting the form
		ObjFormList.deleteForm(FormListTestData.formNames_TC9670);

	}
}
