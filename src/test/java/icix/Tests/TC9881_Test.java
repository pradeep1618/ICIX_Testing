package icix.Tests;
 
 
import icix.Modules.FormList;
 
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.TestBase;

 
 




import org.testng.annotations.Test;



public class TC9881_Test extends TestBase{
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void CF_Scenario53() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjForm.createNewForm(FormBuilderTestData.BPform_9881, FormBuilderTestData.NoOfTabs_9881, FormBuilderTestData.NoOfSections_9881, FormBuilderTestData.generateServiceSection_9881, 
				FormBuilderTestData.NoOfQuestions_9881, FormBuilderTestData.NoOfLinkedQuest_9881, FormBuilderTestData.NoOfReqQuest_9881, FormBuilderTestData.NoOfReadOnlyQuest_9881,
				FormBuilderTestData.ansType_9881, FormBuilderTestData.picklistVal_9881, FormBuilderTestData.MultiPickVal_9881, 
				FormBuilderTestData.NamenValue_9881, FormBuilderTestData.defaultVal_9881, FormBuilderTestData.dependencyValue_9881, 
				FormBuilderTestData.newFeature_9881, FormBuilderTestData.formName);
		
	}	
}