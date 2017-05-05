package icix.Tests;
 
import icix.Modules.FormList;
import icix.Modules.LoginOut;
 
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;

import org.testng.annotations.Test;

 
 
 
 

public class TC9833_Test extends TestBase {


	FormList ObjForm=new FormList();
	String requesterUserType = null;
	LoginOut objLoginOut = new LoginOut();

 

 

	@Test
	public void BPF_Scenario2() throws Exception {

		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Login Successfully ");
		ObjForm.createNewForm(FormBuilderTestData.BPform_TC9833, FormBuilderTestData.NoOfSections_TC9833, FormBuilderTestData.NoOfSections_TC9833, 
				FormBuilderTestData.generateServiceSection_TC9833, FormBuilderTestData.NoOfQuestions_TC9833, FormBuilderTestData.NoOfLinkedQuest_TC9833, 
				 FormBuilderTestData.NoOfReqQuest_TC9833, FormBuilderTestData.NoOfReadOnlyQuest_TC9833, FormBuilderTestData.ansType_TC9833, FormBuilderTestData.picklistVal, 
				 FormBuilderTestData.MultiPickVal, FormBuilderTestData.NamenValue_TC9833, FormBuilderTestData.defaultVal, FormBuilderTestData.dependencyValue, 
				 FormBuilderTestData.newFeature, FormBuilderTestData.formNames_TC9833);
		Log.info("Form Created Successfully ");

	}


}
