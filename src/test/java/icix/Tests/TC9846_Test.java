package icix.Tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

public class TC9846_Test extends TestBase{
	
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

	
	@Test
	public void CF_Scenario02(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		
		ConsoleLog.info("Login sucessfully");
		
		ObjForm.createNewForm(FormBuilderTestData.BPform_TC9846, FormBuilderTestData.NoOfTabs_TC9846, FormBuilderTestData.NoOfSections_TC9846, 
				FormBuilderTestData.generateServiceSection_TC9846, FormBuilderTestData.NoOfQuestions_TC9846, FormBuilderTestData.NoOfLinkedQuest_TC9846, 
				 FormBuilderTestData.NoOfReqQuest_TC9846, FormBuilderTestData.NoOfReadOnlyQuest_TC9846, FormBuilderTestData.ansType_TC9846, FormBuilderTestData.picklistVal_TC9846, 
				 FormBuilderTestData.MultiPickVal_TC9846, FormBuilderTestData.NamenValue_TC9846, FormBuilderTestData.defaultVal_TC9846, FormBuilderTestData.dependencyValue_TC9846, 
				 FormBuilderTestData.newFeature_TC9846, FormBuilderTestData.formNames_TC9846);
		Log.info("Form Created Successfully ");
		TakeScreenshots.takescreenshotOnSuccess();
	}
}


