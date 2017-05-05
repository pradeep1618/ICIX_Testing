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

public class TC9826_Test extends TestBase {

	
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

	

	@Test
	public void BPF_Form1(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		
		ConsoleLog.info("Login sucessfully");
		
		ObjForm.createNewForm(FormBuilderTestData.BPform_9826, FormBuilderTestData. NoOfTabs_9826, FormBuilderTestData.NoOfSections_9826, 
				FormBuilderTestData.generateServiceSection_9826, FormBuilderTestData.NoOfQuestions_9826 , FormBuilderTestData.NoOfLinkedQuest_9826, 
				 FormBuilderTestData.NoOfReqQuest_9826, FormBuilderTestData.NoOfReadOnlyQuest_9826 , FormBuilderTestData.ansType_9826, FormBuilderTestData.picklistVal_9826, 
				 FormBuilderTestData.MultiPickVal_9826, FormBuilderTestData.NamenValue_9826, FormBuilderTestData.defaultVal_9826, FormBuilderTestData.dependencyValue_9826, 
				 FormBuilderTestData.newFeature_9826, FormBuilderTestData.formNames_9826);
		ConsoleLog.info("Form created sucessfully");
		TakeScreenshots.takescreenshotOnSuccess();
		}	
}

