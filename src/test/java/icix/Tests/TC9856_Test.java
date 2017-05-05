package icix.Tests;
 
import org.testng.annotations.Test;
 







import icix.Modules.Account;
 
import icix.Modules.FormList;
 
import icix.Modules.LoginOut;
import icix.Modules.Request;
 
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TradingPatnerTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TestBase;
 

 
 

 


public class TC9856_Test extends TestBase{

	Account ObjAcc = new Account();
	Request ObjReq=new Request();
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();

 


	 
	String ProductName=null;
	public static
	boolean selectTP=true;
 
	String TestingFacility=null;
 
	//String RequestName="AutoTestFri Feb 24 10:55:56 IST 2017";




	@Test
	public void Reject_Request() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");
		ObjForm.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
				FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
				FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
				FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
				FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);

		Log.info("Form Created Successfully");
		ObjReq.sendRequest(TradingPatnerTestData.RequestName_9856, selectTP, TradingPatnerTestData.TradingPartnerName_9856, FormListTestData.formNames_TC9670,ProductName, TradingPatnerTestData.DocumentName_9856, TradingPatnerTestData.SendRequestComments_9856);

		//code for logout
		objLoginOut.logout();
		// Login as Responder
		objLoginOut.loginAs(LoginOutTestData.Responder);
		Common.openAppLauncher();

		ObjReq.FillAndSubmit2ActorForm(TradingPatnerTestData.RequestName_9856, TradingPatnerTestData.ContainerName_9856, TradingPatnerTestData.AttentionComments_9856, TestingFacility);	

		// logout responder
		objLoginOut.logout();

		// login by requester
		objLoginOut.loginAs(LoginOutTestData.Requestor);

		 Common.openAppLauncher();
		ObjReq.RejectRequest(TradingPatnerTestData.RequestName_9856, TradingPatnerTestData.RejectComments_9856);


	}
}