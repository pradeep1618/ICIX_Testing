package icix.Tests;

 
import icix.Modules.LoginOut;
import icix.Modules.Product;
import icix.TestData.LoginOutTestData;
import icix.TestData.ProductTestData;
import icix.Utils.TestBase;

import org.testng.annotations.Test;




 

public class TC9656_Test extends TestBase{

Product ObjIPr = new Product();
LoginOut objLoginOut = new LoginOut();

	@Test
	public void  CreatingPublicProductWithUPC () throws Exception{
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjIPr.createProduct(ProductTestData.SearchProductForTradingPartner_9656, ProductTestData.NameofProduct_9656, ProductTestData.ProductRelationshipWithTP_9656, ProductTestData.ProgramName_9656, ProductTestData.privacysetting_9656, ProductTestData.UPCproduct_9656);

		objLoginOut.logout();
		objLoginOut.loginAs(LoginOutTestData.Responder);
		ObjIPr.verifycreateProduct(ProductTestData.StringTradingPartnerNameRequestor_9656, ProductTestData.ProductRelationshipWithTP_9656, ProductTestData.NameofProduct_9656,ProductTestData.UPCproduct_9656,ProductTestData.productstatus_9656);





	}

}
