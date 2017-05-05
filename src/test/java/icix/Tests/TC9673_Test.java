package icix.Tests;

import icix.Modules.FormList;
 

import icix.Modules.LoginOut;
import icix.Modules.Request;
import icix.TestData.FormBuilderTestData;
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.ProductTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TestBase;

 

import org.testng.annotations.Test;

//import com.utils.Data_loading;
public class TC9673_Test extends TestBase {

	FormList ObjForm=new FormList();
	Request ObjReq=new Request();
	LoginOut objLoginOut = new LoginOut();
	
	boolean selectTP=ProductTestData.selectTP_9673;
	String TradingPartnerName=ProductTestData.TradingPartnerName_9673;
	String ProductName=ProductTestData.ProductName_9673;
	String DocumentName=ProductTestData.DocumentName_9673;
	String SendRequestComments=ProductTestData.SendRequestComments_9673;
	String ContainerName ="";
	String AttentionComments=ProductTestData.AttentionComments_9673;
	String TestingFacility =ProductTestData.TestingFacility_9673;
	String FormName="BSE Statement";
	String formNames[] = FormBuilderTestData.formName;
	String RequestName=ProductTestData.RequestName_9673;
 

	@Test
	public void productTwoactor_workflow() throws Exception {
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("LoginSuccessfully");

		ObjReq.sendRequest(RequestName, selectTP, TradingPartnerName, FormListTestData.formNames_TC9670, DocumentName, ProductName,SendRequestComments);
		// code for logout
		objLoginOut.logout();
		//Responder
		objLoginOut.loginAs(LoginOutTestData.Responder);
		Log.info("LoginSuccessfully");
		Common.openAppLauncher();	
		ObjReq.FillAndSubmit2ActorForm(RequestName, ContainerName, AttentionComments, TestingFacility);	

		// logout responder
		objLoginOut.logout();

	}
}