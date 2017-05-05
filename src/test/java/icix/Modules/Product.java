package icix.Modules;

import icix.Locators.ProductRepo;
import icix.Locators.RequestRepo;
import icix.Utils.Common;
import icix.Utils.WaitTool;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Product {
	String randomNumbers=RandomStringUtils.randomNumeric(8);
	 

	public void createProductManager(String ProgramName,String CategoryName,String TestClass,
			String TestName,String  TestType,String TestMethodName,String Operator,String Value,String Measure,String Message) throws InterruptedException{

		Common.ClickElement(ProductRepo.lnkProductTestManager,6000);

		List<WebElement> NewRequestFrame=Common.FindAllElements(RequestRepo.frmFrameNewRequest, 1);
		System.out.println(NewRequestFrame.size());

		if (NewRequestFrame.size()>0)
		{
			if (NewRequestFrame.size()>1)
			{
				Common.SwitchToFrame();
			}
			else
			{
				Common.SwitchToFrame();
			}
		}	

		Common.ClickElement(ProductRepo.btnCreateNewTestProgram,6000);
		Common.ClearAndSendKeys(ProductRepo.txtBoxTestProgramName, ProgramName, 3000);
		Common.ClickElement(ProductRepo.btnProgramNameNext,3000);
		Common.ClickElement(ProductRepo.selectApprovedLabs,3000);
		Common.ClickElement(ProductRepo.moveRight,6000);
		Common.ClickElement(ProductRepo.btnCreateTProgram,3000);
		//AddNewCategory
		Common.ClickElement(ProductRepo.btnAddNewCategory,3000);
		Common.ClearAndSendKeys(ProductRepo.txtBoxCategoryName, CategoryName, 3000);
		Common.ClearAndSendKeys(ProductRepo.txtBoxTestClass, TestClass, 3000);
		Common.ClearAndSendKeys(ProductRepo.txtBoxTestName, TestName, 3000);
		Common.SelectDropdownText(ProductRepo.dropDownTestType, TestType, 100);
		Common.ClearAndSendKeys(ProductRepo.txtBoxTestMethod, TestMethodName, 8000);
		Common.mouseHover(ProductRepo.dropdownLimit,ProductRepo.limti,1);
		Common.SelectDropdownText(ProductRepo.dropDownOperator, Operator, 100);
		Common.ClearAndSendKeys(ProductRepo.txtboxValue, Value, 1);
		Common.SelectDropdownText(ProductRepo.dropDownMeasure, Measure, 100);
		Common.SelectDropdownText(ProductRepo.dropDownMessage,Message, 4000);
		Common.ClickElement(ProductRepo.btnAddTestLimit,1);
		Common.ClickElement(ProductRepo.btnSaveCategory,3000);
		Common.SwitchToDefaultContent(1);


	}


	public void Container(String FormName, String ProgramName) throws InterruptedException
	{
		Common.SwitchToLightiningView();
		Common.ClickElement(ProductRepo.lnkContainerTemplates,6000);
		Common.searchAndPublishProductForm(FormName);
		Common.ClickElement(ProductRepo.statusbutton,6000);
		Common.ClickElement(ProductRepo.StatusDropdown,6000);
		// Common.testP(ProgramName);
		Common.ClearAndSendKeys(ProductRepo.searchTestingProgram,ProgramName, 1);
		Common.ClickElement(By.xpath("//div[@title='"+ProgramName+"']"),6000);
		Common.ClickElement(ProductRepo.btnSaveForm,6000);

	}
///code fo 3 actor  create product 
	public void createProduct(String SearchProductForTradingPartner, String NameofProduct,String ProductRelationshipWithTP,String ProgramName,String privacysetting,String UPCproduct) throws InterruptedException

	{

		Common.openAppLauncher();
		Common.ClickElement(ProductRepo.linkProduct,8000);
		Common.RefreshPage(3000);
		Common.ClickElement(ProductRepo.btnNewProduct,3000);

		Common.SwitchToFrame();
		
		Common.ClearAndSendKeys(ProductRepo.tbSearchTP, SearchProductForTradingPartner, 1);
		Common.ClickElement(ProductRepo.selectTP,6000);
		//Common.ClickElement(By.xpath("//a[contains(.,'"+SearchProductForTradingPartner+"')]"),6000);

		Common.ClickElement(ProductRepo.btnProductSearch,6000);

		Common.ClickElement(ProductRepo.btnCreateProduct,6000);

		Common.ClearAndSendKeys(ProductRepo.tbPName, NameofProduct, 4000);
		
		
		Common.SelectDropdownText(ProductRepo.idsDrop, "UPC", 1);
		Common.ClearAndSendKeys(ProductRepo.idTxt, UPCproduct , 1);
		
		Common.ClickElement(ProductRepo.btnNextProduct,1);
		Common.ClearAndSendKeys(ProductRepo.tbRelationshipTPName,ProductRelationshipWithTP, 3000);
		Common.ClickElement(By.xpath("//h3[contains(.,'"+ProductRelationshipWithTP+"')]"), 1);
		 
		//Common.ClickElement(By.xpath("//h3[contains(text(),'"+ProductRelationshipWithTP+"')]"),6000);
		Common.ClickElement(ProductRepo.tabPravacySettings,1);
		Common.ClickElement(By.xpath("//span[contains(.,'"+privacysetting+"')]"),4000);
		/*Common.ClickElement(ProductRepo.tabProductTest,6000);
		Common.ClickElement(ProductRepo.radioBtnFinishedGood,1);
		//Common.ClickElement(By.xpath("//span[contains(.,'"+ProgramName+"')]"),1);
		Common.ClickElement(ProductRepo.selectProgram,1);
		Common.ClickElement(ProductRepo.moveRight,3000);
		Common.ClickElement(ProductRepo.selectProgram,1);
		Common.ClickElement(ProductRepo.selectCategory,1);*/
		Common.ClickElement(ProductRepo.btnSavePro,1);
	//	Common.assertText(ProductRepo.verifyCreateProductMessage,"New Product Relationship created successfully.", 100); 
	//	Common.ClickElement(ProductRepo.popupClose,1);

	}
	
	public void verifySuccessMessage(){
		if(Common.checkExistenceOfElement(ProductRepo.successMessageProdGrp, 1)==true){
			Assert.assertTrue(true, "Group saved successfully.");
		}
		else{
			Assert.assertFalse(true, "Success message did not appear.");
		}
	}	
	public void addProductGroup(String prodGrpName){
		//Open Product group page
		Common.openAppLauncher();
		Common.ClickElement(ProductRepo.lnkProductGroups, 3000);
		Common.ClickElement(ProductRepo.btnNew, 1);

		Common.SwitchToFrame();
		
		//enter product group details
		Common.ClearAndSendKeys(ProductRepo.txtNameOfGroup, prodGrpName, 1);
		
		//add tags
		Common.ClickElementByIndex(ProductRepo.chkbxTag, 0, 0);
		
		//add status
		Common.ClickElement(ProductRepo.tabStatus, 1);
		Common.ClickElement(ProductRepo.activeStatus, 0);
		Common.ClickElement(ProductRepo.btnMoveRight, 1);
		
		//add type
//		Common.ClickElement(ProductGroupsRepo.tabType, 1);
//		Common.ClickElement(ProductGroupsRepo.buyType, 1);
//		Common.ClickElement(ProductGroupsRepo.btnMoveRight, 1);
		
		//add attributes
//		for(int counter=0; counter < Common.getCount(ProductGroupsRepo.divRelAttrFieldCount, 0); counter++){
//			if(Start.driver.findElements(By.xpath("//select[@id='countryDropdwn"+i+"'][@class='slds-select']")).size()!= 0){
//			if(((List<WebElement>) ProductsRepo.relAttrDrpDwn).size()!= 0){
//				Start.driver.findElement(By.xpath("//select[@id='countryDropdwn"+i+"'][@class='slds-select']")).click();
//				Common.SelectDropdownText(ProductsRepo.relAttrDrpDwn, objProdParam.CountryOfOrigin, 0);
//			}
		Common.ClickElement(ProductRepo.btnSaveProdGrp, 3000);
//		}
	}
	
	public void verifyProductCreated(String productGroupName){
		if(Common.checkExistenceOfElement(By.xpath("//a[contains(text(),'"+productGroupName+"')]"), 1)==true){
			Assert.assertEquals(productGroupName, productGroupName);
			 
		}
		else{
			Assert.assertFalse(true, "Success pop-up did not appear.");
			 
		}
	}

	// V
	
	
public void addAndVerifyTag(String SearchProductForTradingPartner, String NameofProduct, String tagName) throws InterruptedException{
		
		Common.openAppLauncher();
		Common.ClickElement(ProductRepo.linkProduct,8000);
		Common.RefreshPage(3000);
		Common.ClickElement(ProductRepo.btnNewProduct,3000);

		Common.SwitchToFrame();
		
		Common.ClearAndSendKeys(ProductRepo.tbSearchTP, SearchProductForTradingPartner, 1);
		Common.ClickElement(ProductRepo.selectTP,6000);
		//Common.ClickElement(By.xpath("//a[contains(.,'"+SearchProductForTradingPartner+"')]"),6000);

		Common.ClickElement(ProductRepo.btnProductSearch,6000);

		Common.ClickElement(ProductRepo.btnCreateProduct,6000);

		Common.ClearAndSendKeys(ProductRepo.tbPName, NameofProduct, 4000);
		Common.ClickElement(ProductRepo.btnNextProduct,6000);
		Common.ClickElement(ProductRepo.tabRelationshipTags, 1);
		Common.ClickElement(ProductRepo.lnkAddATag, 1);
		Common.ClearAndSendKeys(ProductRepo.txtAddATag, tagName, 1);
		Common.ClickElement(ProductRepo.tabRelationshipTags, 1);
		
		for(int counter=0; counter<= Common.getCount(ProductRepo.divRelTagTagName, 1); counter++){
			if(tagName.equals(Common.getElementText(ProductRepo.divRelTagTagName, 100)))
				Assert.assertTrue(true);
		}
			
		//	Assert.assertFalse(true, "Tag not added");
		
	}

	
	
	
	//Added By abhay  on 7/2/2017
	
	
public void  createproductgroup(String Group,String TagName) throws Exception
{
	Common.openAppLauncher();
	Common.ClickElement(ProductRepo.LinkProduct, 1);
	Thread.sleep(3000);
	Common.ClickElement(ProductRepo.btnNewProduct, 10);
	Common.SwitchToFrame();
	Common.ClearAndSendKeys(ProductRepo.txtgroup, Group, 1);
	System.out.println(TagName);
	Common.ClickElement(By.xpath("//span[contains(text(),'"+TagName+"')]"), 2);
	Common.ClickElement(ProductRepo.btnSaveCategory, 2);
	
	//Common.ClickElement(ProductRepo.close, 1);
	Common.RefreshPage(3000);
}

public void editproductgroup(String Group,String EditTag) throws InterruptedException
{
	Common.openAppLauncher();
	Common.ClickElement(ProductRepo.LinkProduct, 5);	
	System.out.println(Group);
	Thread.sleep(3000);
	Common.ClickElement(By.xpath("//a[@title='"+Group+"']"), 1);
	Thread.sleep(3000);
	Common.ClickElement(ProductRepo.Editbutton, 1);
	Common.SwitchToFrame();
	Common.ClickElement(By.xpath("//span[contains(text(),'"+EditTag+"')]"), 1);
	Common.ClickElement(By.xpath("//span[contains(text(),'"+EditTag+"')]"), 1);
	Common.ClickElement(ProductRepo.saveproductgroup, 1);
}

	public void verifycreateProduct (String SearchProductForTradingPartner,String ProductRelationshipWithTP,String NameofProduct,String UPCproduct,String productstatus) throws Exception

	{

	//	Common.SwitchToLightiningView();
		Common.openAppLauncher();
		Common.ClickElement(ProductRepo.linkProduct,8000);
		Common.RefreshPage(3000);
		Common.ClickElement(ProductRepo.btnNewProduct,3000);

		Common.SwitchToFrame();
		
		Common.ClearAndSendKeys(ProductRepo.tbSearchTP, SearchProductForTradingPartner, 1);
		Common.ClickElement(ProductRepo.tpDrop,6000);
		 
		Common.ClearAndSendKeys(ProductRepo.searchBoxPName, UPCproduct, 1);
	
	//	Common.assertText(By.xpath("//td[contains(.,'"+NameofProduct+"')]", NameofProduct, 1);
		

		Common.ClickElement(ProductRepo.btnProductSearch,6000);
		//td[contains(.,'Testing_AB')]
		
	
		if(productstatus=="Connect to Product")
		{
//			Common.assertText(By.xpath("//td[contains(.,'"+productstatus+"')]"),productstatus,1);
			
		}
		 
 
		}
	
	
	////////////////////////created by pradeep for product search 

	public void ProductSearchByUniID(String TradingPartner, String UniID, String ProductNam, String Upcode, String Upcodetxt,
			String Productdisc, String TPRelation){
		Common.ClickElement(ProductRepo.lnkIcixProduct, 1);
		Common.ClickElement(ProductRepo.btnNew, 1);
		Common.SwitchToFrame();
		
		Common.ClearAndSendKeys(ProductRepo.SearchTP, TradingPartner, 1);
		Common.ClickElement(ProductRepo.tpDrop, 1);
		Common.ClearAndSendKeys(ProductRepo.universalID, UniID + randomNumbers, 1);
		Common.ClickElement(ProductRepo.btnSearch, 1);
		Common.ClickElement(ProductRepo.createPrdt, 1);
		Common.ClearAndSendKeys(ProductRepo.productName, ProductNam, 1);
		Common.SelectDropdownText(ProductRepo.idsDrop, Upcode, 1);
		Common.ClearAndSendKeys(ProductRepo.idTxt, Upcodetxt + randomNumbers, 1);
		Common.ClearAndSendKeys(ProductRepo.productDescrip, Productdisc, 1);
		Common.ClickElement(ProductRepo.btnNext, 1);
		Common.ClearAndSendKeys(ProductRepo.relationTP, TPRelation, 1);
		Common.ClickElement(ProductRepo.btnSave, 1);
		Common.SwitchTab(1);
		Common.ClickElement(ProductRepo.btnClose, 1);
		
	}


	public void ProductSearchWithoutUID(String TradingPartner,  String ProductNam, String Upcode, String Upcodetxt,
			String Productdisc, String TPRelation) throws InterruptedException{
		
		
		Common.openAppLauncher();
		Common.ClickElement(ProductRepo.lnkIcixProduct, 1);
		Common.ClickElement(ProductRepo.btnNew, 1);
		Common.SwitchToFrame();
		Common.ClearAndSendKeys(ProductRepo.SearchTP, TradingPartner, 1);
		Common.ClickElement(ProductRepo.tpDrop, 1);
		Common.ClickElement(ProductRepo.btnSearch, 1);
		Common.ClickElement(ProductRepo.createPrdt, 1);
		Common.ClearAndSendKeys(ProductRepo.productName, ProductNam, 1);
		Common.SelectDropdownText(ProductRepo.idsDrop, Upcode, 1);
		Common.ClearAndSendKeys(ProductRepo.idTxt, Upcodetxt + randomNumbers, 1);
		Common.ClearAndSendKeys(ProductRepo.productDescrip, Productdisc, 1);
		Common.ClickElement(ProductRepo.btnNext, 1);
		Common.ClearAndSendKeys(ProductRepo.relationTP, TPRelation, 1);
		Common.ClickElement(ProductRepo.btnSave, 1);
		Common.SwitchTab(1);
		Common.ClickElement(ProductRepo.btnClose, 1);
		
	}
}
