package icix.Tests;

 
 
import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.TestBase;

import org.testng.annotations.Test;



public class TC9871_Test extends TestBase {

	FormList ObjForm=new FormList();
 
	LoginOut objLoginOut = new LoginOut();

 
	boolean BPform = false; // Best practice form or not?

	@Test
	public void CF_Scenario54() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjForm.createNewForm(FormBuilderTestData.BPform_9871, FormBuilderTestData.NoOfTabs_9871, FormBuilderTestData.NoOfSections_9871, FormBuilderTestData.generateServiceSection_9871, 
				FormBuilderTestData.NoOfQuestions_9871, FormBuilderTestData.NoOfLinkedQuest_9871, FormBuilderTestData.NoOfReqQuest_9871, FormBuilderTestData.NoOfReadOnlyQuest_9871,
				FormBuilderTestData.ansType_9871, FormBuilderTestData.picklistVal_9871, FormBuilderTestData.MultiPickVal_9871, 
				FormBuilderTestData.NamenValue_9871, FormBuilderTestData.defaultVal_9871, FormBuilderTestData.dependencyValue_9871, 
				FormBuilderTestData.newFeature_9871, FormBuilderTestData.formName);
	}
}

