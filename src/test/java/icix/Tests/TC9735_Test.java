package icix.Tests;

import icix.Modules.Account;
 
import icix.Modules.FormList;
 
import icix.Modules.LoginOut;
 
import icix.Modules.Request;
 
 
 

 

import icix.TestData.FormBuilderTestData;
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TradingPatnerTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TestBase;

import org.testng.annotations.Test;
public class TC9735_Test extends TestBase {
 
	Account ObjAcc = new Account();
	Request ObjReq=new Request();
	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	public static
	boolean selectTP=false;
	String TestingFacility=null;
 	// ** This test will create a new product in the specific org ID**//
	@Test
	public void productTwoactor_workflow() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");

		ObjFormList.createNewForm(FormBuilderTestData.BPform_TC9670, FormBuilderTestData.NoOfTabs_TC9670, FormBuilderTestData.NoOfSections_TC9670, FormBuilderTestData.generateServiceSection_TC9670, 
				FormBuilderTestData.NoOfQuestions_TC9670, FormBuilderTestData.NoOfLinkedQuest_TC9670, FormBuilderTestData.NoOfReqQuest_TC9670, FormBuilderTestData.NoOfReadOnlyQuest_TC9670,
				FormBuilderTestData.ansType_TC9670, FormBuilderTestData.picklistVal_TC9670, FormBuilderTestData.MultiPickVal_TC9670, 
				FormBuilderTestData.NamenValue_TC9670, FormBuilderTestData.defaultVal_TC9670, FormBuilderTestData.dependencyValue_TC9670, 
				FormBuilderTestData.newFeature_TC9670, FormBuilderTestData.formNames_TC9670);

		Log.info("Form Created Successfully");

		ObjReq.sendRequest(TradingPatnerTestData.RequestName_9735, selectTP, TradingPatnerTestData.tradingPartnerName, FormBuilderTestData.formNames_TC9670, TradingPatnerTestData.ProductName_9735, TradingPatnerTestData.DocumentName_9735, TradingPatnerTestData.SendRequestComments_9735);
		
		objLoginOut.logout();
		
// Login as Responder
		 
		objLoginOut.loginAs(LoginOutTestData.Responder);
				
		ObjReq.FillAndSubmit2ActorForm(TradingPatnerTestData.RequestName_9735, TradingPatnerTestData.ContainerName_9735, TradingPatnerTestData.AttentionComments_9735, TestingFacility);	
		
		// logout responder
		objLoginOut.logout();

				// login by requester
		objLoginOut.loginAs(LoginOutTestData.Requestor);
				
				 	Common.openAppLauncher();
				ObjReq.ApproveRequest(TradingPatnerTestData.RequestName_9735, TradingPatnerTestData.ApprovedComments_9735);
	}
}
				