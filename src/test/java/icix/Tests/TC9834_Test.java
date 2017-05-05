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

public class TC9834_Test extends TestBase {

	
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

	

	@Test
	public void BPF_Form1(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		
		ConsoleLog.info("Login sucessfully");
		
		ObjForm.createNewForm(FormBuilderTestData.BPform_9834, FormBuilderTestData. NoOfTabs_9834, FormBuilderTestData.NoOfSections_9834, 
				FormBuilderTestData.generateServiceSection_9834, FormBuilderTestData.NoOfQuestions_9834 , FormBuilderTestData.NoOfLinkedQuest_9834, 
				 FormBuilderTestData.NoOfReqQuest_9834, FormBuilderTestData.NoOfReadOnlyQuest_9834 , FormBuilderTestData.ansType_9834, FormBuilderTestData.picklistVal_9834, 
				 FormBuilderTestData.MultiPickVal_9834, FormBuilderTestData.NamenValue_9834, FormBuilderTestData.defaultVal_9834, FormBuilderTestData.dependencyValue_9834, 
				 FormBuilderTestData.newFeature_9834, FormBuilderTestData.formNames_9834);
		ConsoleLog.info("Form created sucessfully");
		TakeScreenshots.takescreenshotOnSuccess();
		}	
}

