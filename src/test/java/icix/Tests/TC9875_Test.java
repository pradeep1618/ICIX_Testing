package icix.Tests;

import org.testng.annotations.Test;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;

 
 
 

public class TC9875_Test extends TestBase{

	

	FormList ObjForm=new FormList();
 
	LoginOut objLoginOut = new LoginOut();
 
	@Test
	public void BPF_Scenario2() throws Exception {
	 
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Login Successfully");
		
		ObjForm.createNewForm(FormBuilderTestData.BPform_9875, FormBuilderTestData.NoOfTabs_9875, FormBuilderTestData.NoOfSections_9875, 
				FormBuilderTestData.generateServiceSection_9875, FormBuilderTestData.NoOfQuestions_9875, FormBuilderTestData.NoOfLinkedQuest_9875, 
				 FormBuilderTestData.NoOfReqQuest_9875,  FormBuilderTestData.NoOfReadOnlyQuest_9875, FormBuilderTestData.ansType_9875, FormBuilderTestData.picklistVal_9875, 
				 FormBuilderTestData.MultiPickVal_9875, FormBuilderTestData.NamenValue_9875, FormBuilderTestData.defaultVal_9875, FormBuilderTestData.dependencyValue_9875, 
				 FormBuilderTestData.newFeature_9875, FormBuilderTestData.formName);
		Log.info("Form is created");
	}
	
	
}
