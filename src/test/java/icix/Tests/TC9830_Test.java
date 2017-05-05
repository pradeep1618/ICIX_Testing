package icix.Tests;
 
 
import icix.Modules.FormList;
import icix.Modules.LoginOut;
 
 
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.TestBase;

 
 



import org.testng.annotations.Test;



public class TC9830_Test extends TestBase{
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void CF_Scenario19() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjForm.createNewForm(FormBuilderTestData.BPform_9830, FormBuilderTestData.NoOfTabs_9830, FormBuilderTestData.NoOfSections_9830, FormBuilderTestData.generateServiceSection_9830, 
				FormBuilderTestData.NoOfQuestions_9830, FormBuilderTestData.NoOfLinkedQuest_9830, FormBuilderTestData.NoOfReqQuest_9830, FormBuilderTestData.NoOfReadOnlyQuest_9830,
				FormBuilderTestData.ansType_9830, FormBuilderTestData.picklistVal_9830, FormBuilderTestData.MultiPickVal_9830, 
				FormBuilderTestData.NamenValue_9830, FormBuilderTestData.defaultVal_9830, FormBuilderTestData.dependencyValue_9830, 
				FormBuilderTestData.newFeature_9830, FormBuilderTestData.formName);
		
	}	
}