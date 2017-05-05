package icix.Tests;

import org.testng.annotations.Test;

import icix.Modules.LoginOut;
 
import icix.Modules.Product;
 
import icix.TestData.LoginOutTestData;
import icix.TestData.ProductTestData;
import icix.Utils.Log;
import icix.Utils.TestBase;
 

public class TC9668_Test extends TestBase{

	Product ObjPG=new Product();
	LoginOut objLoginOut = new LoginOut();

	@Test
	public void TPG_Tags() throws Exception {
		//Login as Requestor 
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Login Successfully ");
		//Create Product Group 
		ObjPG.createproductgroup(ProductTestData.Group_9668,ProductTestData.TagName_9668);
		Log.info("Product created successfully");

		ObjPG.editproductgroup(ProductTestData.Group_9668,ProductTestData.Edittag_9668);
		Log.info("product group is edited successfully");
	}

}