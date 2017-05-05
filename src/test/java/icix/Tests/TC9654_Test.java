package icix.Tests;

import org.testng.annotations.Test;

 
 
 
import icix.Modules.LoginOut;
import icix.Modules.Product;
 
import icix.TestData.LoginOutTestData;
import icix.TestData.ProductTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;
 
 

public class TC9654_Test extends TestBase{

Product ObjIPr = new Product();
LoginOut objLoginOut = new LoginOut();


	@Test
	public void  CreatingPublicProductWithUPC () throws Exception{
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjIPr.createProduct(ProductTestData.SearchProductForTradingPartner_9654, ProductTestData.NameofProduct_9654, ProductTestData.ProductRelationshipWithTP_9654, ProductTestData.ProgramName_9654, ProductTestData.privacysetting_9654, ProductTestData.UPCproduct_9654);

		objLoginOut.logout();
		objLoginOut.loginAs(LoginOutTestData.Responder);
		ObjIPr.verifycreateProduct(ProductTestData.StringTradingPartnerNameRequestor_9654, ProductTestData.ProductRelationshipWithTP_9654, ProductTestData.NameofProduct_9654,ProductTestData.UPCproduct_9654,ProductTestData.productstatus_9654);





	}

}
