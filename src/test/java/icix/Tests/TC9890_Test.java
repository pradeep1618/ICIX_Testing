package icix.Tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;
class TC9890_Test extends TestBase {

		
		FormList ObjForm=new FormList();
		LoginOut objLoginOut = new LoginOut();
	@Test
	public void CF_Scenario57(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ConsoleLog.info("Login sucessfully");
		ObjForm.createNewForm(FormBuilderTestData.BPform_TC9890, FormBuilderTestData.NoOfTabs_TC9890, FormBuilderTestData.NoOfSections_TC9890, 
				FormBuilderTestData.generateServiceSection_TC9890, FormBuilderTestData.NoOfQuestions_TC9890, FormBuilderTestData.NoOfLinkedQuest_TC9890, 
				 FormBuilderTestData.NoOfReqQuest_TC9890, FormBuilderTestData.NoOfReadOnlyQuest_TC9890, FormBuilderTestData.ansType_TC9890, FormBuilderTestData.picklistVal_TC9890, 
				 FormBuilderTestData.MultiPickVal_TC9890, FormBuilderTestData.NamenValue_TC9890, FormBuilderTestData.defaultVal_TC9890, FormBuilderTestData.dependencyValue_TC9890, 
				 FormBuilderTestData.newFeature_TC9890, FormBuilderTestData.formNames_TC9890);
		Log.info("Form Created Successfully ");
	}

}