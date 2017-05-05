package icix.Tests;

import org.testng.annotations.Test;

import icix.Modules.FormList;
 
 
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;
 
public class TC9827_Test extends TestBase {

	
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void BPF_Scenario2() throws Exception {
	 
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Login Successfully ");
		ObjForm.createNewForm(FormBuilderTestData.BPform_TC9827, FormBuilderTestData.NoOfTabs_TC9827, FormBuilderTestData.NoOfSections_TC9827, 
				FormBuilderTestData.generateServiceSection_TC9827, FormBuilderTestData.NoOfQuestions_TC9827, FormBuilderTestData.NoOfLinkedQuest_TC9827, 
				 FormBuilderTestData.NoOfReqQuest_TC9827, FormBuilderTestData.NoOfReadOnlyQuest_TC9827, FormBuilderTestData.ansType_TC9827, FormBuilderTestData.picklistVal_TC9827, 
				 FormBuilderTestData.MultiPickVal_TC9827, FormBuilderTestData.NamenValue_TC9827, FormBuilderTestData.defaultVal_TC9827, FormBuilderTestData.dependencyValue_TC9827, 
				 FormBuilderTestData.newFeature_TC9827, FormBuilderTestData.formNames_TC9827);
		Log.info("Form Created Successfully ");
	}
	
	
}
