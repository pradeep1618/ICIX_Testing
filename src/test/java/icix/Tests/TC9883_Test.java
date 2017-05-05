package icix.Tests;
 
 
import icix.Modules.FormList;
import icix.Modules.LoginOut;
 
 
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.TestBase;

 
 



import org.testng.annotations.Test;



public class TC9883_Test extends TestBase{

	FormList ObjForm=new FormList();
 
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void CF_Scenario19() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
	
		
		ObjForm.createNewForm(FormBuilderTestData.BPform_9883, FormBuilderTestData.NoOfTabs_9883, FormBuilderTestData.NoOfSections_9883, FormBuilderTestData.generateServiceSection_9883, 
				FormBuilderTestData.NoOfQuestions_9883, FormBuilderTestData.NoOfLinkedQuest_9883, FormBuilderTestData.NoOfReqQuest_9883, FormBuilderTestData.NoOfReadOnlyQuest_9883,
				FormBuilderTestData.ansType_9883, FormBuilderTestData.picklistVal_9883, FormBuilderTestData.MultiPickVal_9883, 
				FormBuilderTestData.NamenValue_9883, FormBuilderTestData.defaultVal_9883, FormBuilderTestData.dependencyValue_9883, 
				FormBuilderTestData.newFeature_9883, FormBuilderTestData.formName);
		
		ObjForm.copyAndEditForm();
		
	}	
}