package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;
import icix.Utils.Common;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;

import java.lang.reflect.Method;

import org.testng.annotations.Test;


/*Tp Group Compliance - Workflow Status and Request Status are unaffected, 
after a requirement is removed from a group which is also existing on other group*/

public class TC10771_Test extends TestBase{

	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();


	@Test
	public void VerifySendReqAtRespSide(Method method) throws Exception {
		
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
				ObjTP.createTPG(TPGroupComplianceTestData.tpgName_TC10771, TPGroupComplianceTestData.tpgTags_TC10771, TPGroupComplianceTestData.tpgStatus_TC10771, TPGroupComplianceTestData.tpgType_TC10771);
				Common.deleteCookies(80);
				Log.info("Set Requirement");
				ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10771, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10771);
		

		// then create 2nd tpg and then set requirements
				ObjTP.createTPG(TPGroupComplianceTestData.tpgName2_TC10771, TPGroupComplianceTestData.tpgTags2_TC10771,TPGroupComplianceTestData. tpgStatus2_TC10771,TPGroupComplianceTestData. tpgType2_TC10771);
				Common.deleteCookies(80);

				Log.info("Set Requirement");
				ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10771, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10771);
				Log.info("Remove requirement");
				ObjTP.deleteRequirement(TPGroupComplianceTestData.tpgName_TC10771);
				/*ObjTP.searchAnything(tabName, searchKeyWord);
				ObjTP.deleteWorkflow();*/
				ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10771,TPGroupComplianceTestData.searchKeyWord_TC10771);
				//ObjTP.assertWFStatusAtRequesterEnd(reqStatus, wfStatus);
		

		
	}
}
