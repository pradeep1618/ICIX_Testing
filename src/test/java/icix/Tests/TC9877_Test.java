package icix.Tests;
 
 
import icix.Modules.FormList;
import icix.Modules.LoginOut;
 
 
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.TestBase;

 
 



import org.testng.annotations.Test;



public class TC9877_Test extends TestBase{
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void CF_Scenario49() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjForm.createNewForm(FormBuilderTestData.BPform_9877, FormBuilderTestData.NoOfTabs_9877, FormBuilderTestData.NoOfSections_9877, FormBuilderTestData.generateServiceSection_9877, 
				FormBuilderTestData.NoOfQuestions_9877, FormBuilderTestData.NoOfLinkedQuest_9877, FormBuilderTestData.NoOfReqQuest_9877, FormBuilderTestData.NoOfReadOnlyQuest_9877,
				FormBuilderTestData.ansType_9877, FormBuilderTestData.picklistVal_9877, FormBuilderTestData.MultiPickVal_9877, 
				FormBuilderTestData.NamenValue_9877, FormBuilderTestData.defaultVal_9877, FormBuilderTestData.dependencyValue_9877, 
				FormBuilderTestData.newFeature_9877, FormBuilderTestData.formName);
		
	}	
}