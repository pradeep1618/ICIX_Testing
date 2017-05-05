package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;

import java.lang.reflect.Method;

import org.testng.annotations.Test;


public class TC10808_Test extends TestBase{

	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();
	@Test
	public void SendSameReqDifferentTpg(Method method) throws Exception{
		
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		// Login as Requester 
			

				objLoginOut.loginAs(LoginOutTestData.Requestor);
				Log.info("Creating New Form");
				ObjFormList.createNewForm(FormBuilderTestData.BPform_TC9670, FormBuilderTestData.NoOfTabs_TC9670, FormBuilderTestData.NoOfSections_TC9670, FormBuilderTestData.generateServiceSection_TC9670, 
						FormBuilderTestData.NoOfQuestions_TC9670, FormBuilderTestData.NoOfLinkedQuest_TC9670, FormBuilderTestData.NoOfReqQuest_TC9670, FormBuilderTestData.NoOfReadOnlyQuest_TC9670,
						FormBuilderTestData.ansType_TC9670, FormBuilderTestData.picklistVal_TC9670, FormBuilderTestData.MultiPickVal_TC9670, 
						FormBuilderTestData.NamenValue_TC9670, FormBuilderTestData.defaultVal_TC9670, FormBuilderTestData.dependencyValue_TC9670, 
						FormBuilderTestData.newFeature_TC9670, FormBuilderTestData.formNames_TC9670);

				Log.info("Creating TPG");
				ObjTP.createTPG(TPGroupComplianceTestData.tpgName_TC10806, TPGroupComplianceTestData.tpgTags_TC10806, TPGroupComplianceTestData.tpgStatus_TC10806, TPGroupComplianceTestData.tpgType_TC10806);
				Log.info("Set Requirement");
				ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10806, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10806);
				Log.info("Logout from Requester End");

		
		
		Log.info("Creating another Trading Partner Group");
		ObjTP.createTPG(TPGroupComplianceTestData.tpgName2_TC10808, TPGroupComplianceTestData.tpgTags2_TC10808, TPGroupComplianceTestData.tpgStatus_TC10806, TPGroupComplianceTestData.tpgType_TC10806);
		Log.info("Set Requirement");
		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10806, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10806);
		Log.info("Logout from Requester End");

		

	}
}
