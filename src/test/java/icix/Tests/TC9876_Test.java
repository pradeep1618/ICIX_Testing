package icix.Tests;

import java.lang.reflect.Method;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;

import org.testng.annotations.Test;

public class TC9876_Test extends TestBase {

	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();


	@Test
	public void CF_Scenario48(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());

		objLoginOut.loginAs(LoginOutTestData.Requestor);


		ConsoleLog.info("Login sucessfully");
		ObjForm.createNewForm(FormBuilderTestData.BPform_TC9876, FormBuilderTestData.NoOfTabs_TC9876, FormBuilderTestData.NoOfSections_TC9876, 
				FormBuilderTestData.generateServiceSection_TC9876, FormBuilderTestData.NoOfQuestions_TC9876, FormBuilderTestData.NoOfLinkedQuest_TC9876, 
				FormBuilderTestData.NoOfReqQuest_TC9876, FormBuilderTestData.NoOfReadOnlyQuest_TC9876, FormBuilderTestData.ansType_TC9876, FormBuilderTestData.picklistVal_TC9876, 
				FormBuilderTestData.MultiPickVal_TC9876, FormBuilderTestData.NamenValue_TC9876, FormBuilderTestData.defaultVal_TC9876, FormBuilderTestData.dependencyValue_TC9876, 
				FormBuilderTestData.newFeature_TC9876, FormBuilderTestData.formNames_TC9876);
		Log.info("Form Created Successfully ");
	}
}




