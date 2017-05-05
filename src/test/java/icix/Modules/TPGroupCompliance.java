package icix.Modules;


import icix.Locators.ProductRepo;
import icix.Locators.RequestRepo;
import icix.Locators.TPGroupComplianceRepo;
import icix.Start.Start;

import icix.TestData.FormListTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.WaitTool;






import java.awt.AWTException;
import java.util.List;







import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class TPGroupCompliance {




	public void createTPG(String tpgName, String tpgTags[], String tpgStatus[],String tpgType[]) throws Exception {

		Common.openAppLauncher();
		List<WebElement> taskElements=Common.FindAllElements(TPGroupComplianceRepo.tpgTab,3);
		Common.clickElementPoint(taskElements.get(0));
		Common.ClickElement(TPGroupComplianceRepo.tpgNewBtn, 1000);	
		Common.SwitchToFrame();
		Common.ClearAndSendKeys(TPGroupComplianceRepo.tpgName,tpgName, 1000);	
		for(int t=0; t<tpgTags.length; t++){
			Common.ClickElement(By.xpath("//span[contains(.,'"+tpgTags[t]+"')]"),1000);

		}
		if(tpgStatus.length>0){
			Common.ClickElement(TPGroupComplianceRepo.statusTab, 2000);

			Thread.sleep(3000);
			for(int s=0; s<tpgStatus.length; s++){
				Common.ClickElement(By.xpath("//span[contains(.,'"+tpgStatus[s]+"')]"), 1000);

			}
			Common.ClickElement(TPGroupComplianceRepo.moveIconRight, 0);

		}
		if(tpgType.length>0){
			Common.ClickElement(TPGroupComplianceRepo.typeTab, 5000);

			for(int t=0; t<tpgType.length; t++){
				Common.ClickElement(By.xpath("//span[contains(.,'"+tpgType[t]+"')]"), 1000);
			}

			List<WebElement> ar=Common.FindAllElements(TPGroupComplianceRepo.moveIconRight, 0);
			//It is finding 2 elements of same ID
			//driver.findElement(By.id("icnMoveRight")).click();
			//clicking the 2nd one
			ar.get(1).click();
			Thread.sleep(1000);
		}
		Common.ClickElement(TPGroupComplianceRepo.tpgSave, 30);
		//String msg =Common.FindAnElement(TPGroupComplianceRepo.successMsg).getText();

		//	Assert.assertTrue(msg.contains("Trading partner group has been created successfully"));
		Thread.sleep(1000);
		//Common.ClickElement(TPGroupComplianceRepo.tpgPopupClose, 4000);
		Common.SwitchToDefaultContent(3000);
		Common.RefreshPage(1000);
		Common.clickPartialLinkText(tpgName,100);

	}

	// Set Requirements then save	
	public void SetRequirement(String requestType[], String formNames[],String saveOrSend) throws Exception {
		
		Common.RefreshPage(2000); 
		if(Common.FindAllElements(TPGroupComplianceRepo.showMoreActionsIcon,10).size()>0)
		{
			Common.ClickElement(TPGroupComplianceRepo.showMoreActionsIcon, 10);
			Log.info("Clicking on the down arrow to click set requirement.");
			TakeScreenshots.takescreenshotOnSuccess();
		}

		Common.ClickElement(TPGroupComplianceRepo.setReqBtn, 10);
		Log.info("Clicking on the down arrow to click set requirement.");

		Common.SwitchToFrame();
		// Common.switchFrame(TPGroupComplianceRepo.setReqmFrame, 10);
		for(int r=1; r<=formNames.length; r++){
			int id=r-1;
			int reqid=r+1;
			if(requestType.length==formNames.length){
				System.out.println(Start.getDriverInstance());
				new Select(Common.FindAnElement(By.id("RequestType"+id+""),10)).selectByVisibleText(requestType[id]);
				//new Select(driver.findElement(By.id("RequestType"+id+""))).selectByVisibleText(requestType[id]);

				Log.info("Selecting the Request type");
				TakeScreenshots.takescreenshotOnSuccess();
			}
			else{
				new Select(Common.FindAnElement(By.id("RequestType"+id+""),10)).selectByVisibleText("All");
				Log.info("Selecting All");
				TakeScreenshots.takescreenshotOnSuccess();
			}

			new Select(Common.FindAnElement(By.id("DocType"+id+""),10)).selectByVisibleText(formNames[id]);//formNames[id]);
			Log.info("Selecting the form: " + formNames);
			TakeScreenshots.takescreenshotOnSuccess();

			Common.selectDate(By.id(""+id+""), 10);
			Log.info("Selecting the due date for full filling the requirement.");
			TakeScreenshots.takescreenshotOnSuccess();

			Thread.sleep(5000);
			new Select(Common.FindAnElement(By.id("RequirementType"+id+""),10)).selectByVisibleText("Approval");
			Log.info("Selecting the Requirment as approval");
			TakeScreenshots.takescreenshotOnSuccess();
			if(r<formNames.length){
				// add new requirement
				Common.ClickElement(By.xpath("html/body/form/div["+reqid+"]/div[2]/button"), 10);
			}
		}
		Common.ClickElement(By.id(saveOrSend), 10);
		Log.info("Clicking on send button.");
		TakeScreenshots.takescreenshotOnSuccess();

		/*if(saveOrSend.equals("btnSave")){
		 String saveMsg = driver.findElement(By.xpath(TPGroupCompRepo.reqSaveUpdateMsg)).getText();
		 Assert.assertTrue(saveMsg.contains("Requirements updated successfully"));
		 Thread.sleep(1000);
		 }
		 if(saveOrSend.equals("btnSend")){
		  String sendMsg = driver.findElement(By.cssSelector(TPGroupCompRepo.reqSendMsg)).getText();
		  Assert.assertTrue(sendMsg.contains("Request is sent for the following Requirements and Members of the Group"));
		 }*/
		Common.ClickElement(TPGroupComplianceRepo.tpgPopupClose, 10);
		Common.SwitchToDefaultContent(3000);
	}

	public void assertAndDeleteReqs(int assertReqsSize, boolean removeReqs,String formNames[]) throws InterruptedException {
		Common.ClickElement(TPGroupComplianceRepo.tpgRelated,3000);
		Thread.sleep(3000);
		Common.ClickElement(TPGroupComplianceRepo.tpgCompLink,3000);
		List<WebElement> listInputs =Common.FindAllElements(TPGroupComplianceRepo.reqList, 0);
		//List<WebElement> listInputs = driver.findElements(TPGroupComplianceRepo.reqList));

		if(assertReqsSize!=0){
			Assert.assertEquals(listInputs.size(), assertReqsSize);
		}

		// for remove reqs	
		if(removeReqs==true && listInputs.size()>0){
			for(int i=0; i<listInputs.size();i++){
				Common.ClickElement(By.xpath("//th[@tabindex='-1']//a[contains(text(),'"+formNames+"')]"),5000);
				WebElement element =Common.FindAnElement(By.xpath("//div[@class='active oneContent']"), 0);
				if (element != null) {
					element.findElement(By.xpath(".//div[@title='Delete']")).click();
					Thread.sleep(5000);
					Common.ClickElement(TPGroupComplianceRepo.btnDeleteReq,5000);


				}
				else
				{
					throw new NullPointerException();
				}



			}
		}

	}
	public void deleteReqs(boolean removeReqs) throws InterruptedException, AWTException {
		Common.ClickElement(TPGroupComplianceRepo.tpgRelated,3000);

		Common.ClickElement(TPGroupComplianceRepo.tpgCompLink,3000);
		/*List<WebElement> listInputs =Common.FindAllElements(TPGroupComplianceRepo.reqList);
				//List<WebElement> listInputs = driver.findElements(TPGroupComplianceRepo.reqList));
				System.out.println("Requirements Saved " +listInputs.size());*/

		Common.ClickElement(By.xpath("//th[@tabindex='-1']//a[contains(text(),'')]"),10);
		Common.RefreshPage(1000);
		if(Common.FindAnElement(TPGroupComplianceRepo.btnDeleteReq, 15).isDisplayed())
		{

			Common.ClickElement(TPGroupComplianceRepo.btnDeleteReq, 15);
		}
		else
		{

			WebElement element =Common.FindAnElement(TPGroupComplianceRepo.oneContent, 10);



			if (element != null) {

				element.findElement(TPGroupComplianceRepo.btnDelete).click();
				Thread.sleep(1000);

				Common.ClickElement(By.xpath("//a[contains(.,'Clone')]/preceding::a[1]"), 2000);

				Thread.sleep(3000);

				Common.ClickElement(TPGroupComplianceRepo.BtnDelete, 2000);

				//Common.ClickElement(TPGroupComplianceRepo.btnDeleteReq,5000);
				/*

				// for remove reqs	
				if(removeReqs==true ){
					for(int i=0; i<listInputs.size();i++){
						//Common.ClickElement(TPGroupComplianceRepo.reqList,5000);
						Common.ClickElement(By.xpath("//th[@tabindex='-1']//a[contains(text(),'')]"),5000);


						WebElement element =Common.FindAnElement(TPGroupComplianceRepo.oneContent);

						if (element != null) {
							element.findElement(TPGroupComplianceRepo.delete).click();
							Thread.sleep(5000);
							Common.ClickElement(TPGroupComplianceRepo.btnDeleteReq,5000);


						}
						else
						{
							throw new NullPointerException();
						}
					}*/
			}
		}
	}

	public void searchAnything(String tabName, String searchKeyWord) throws InterruptedException {
		
		Common.openAppLauncher();
		Common.ClickElement(TPGroupComplianceRepo.lnkRequests, 3000);
		Thread.sleep(5000);
		Common.ClearAndSendKeys(TPGroupComplianceRepo.searchBox, searchKeyWord, 3000);
		Common.sendKeys(TPGroupComplianceRepo.searchBox, Keys.ENTER, 3000);
		Common.ClickElement(By.cssSelector(".buttonLabel"), 4000);

		List<WebElement> allTabs=(List<WebElement>) Common.FindAllElements(By.xpath("//div[@id='allItemsList']//li//a"), 0);
		for(WebElement myTab:allTabs){
			if(myTab.getText().equals(tabName)){
				myTab.click();
				break;
			}
		}

		Common.ClickElement(By.partialLinkText(searchKeyWord), 3000);
	}

	public void assertReqWFnStatus(String ReqStatus,String wfStatus) throws Exception {

		Thread.sleep(5000);
		Common.RefreshPage(1000);



		Common.assertText(By.xpath("//span[contains(.,'Status')][1]//following::div[@class='dataCol readonly slds-no-space'][1]"), ReqStatus, 0);
		//Common.assertText(By.xpath("//span[contains(.,'Status')]//following::span[contains(.,'"+ReqStatus+"')]"), ReqStatus, 0);



		Common.assertText(By.xpath("//span[contains(.,'Status')]//following::span[contains(.,'"+wfStatus+"')]"), wfStatus, 0);

		Thread.sleep(3000);
	}

	public void assertWFStatusAtRequesterEnd(String reqStatus, String wfStatus) throws Exception {


		//Common.assertText(By.xpath("//span[contains(.,'"+ReqStatus+"')]"), ReqStatus, 0);
		Common.assertText(By.xpath("//span[contains(.,'Status')]//following::span[contains(.,'"+reqStatus+"')]"), reqStatus, 0);

		//Common.RefreshPage(5000);
		Common.ClickElement(TPGroupComplianceRepo.tpgRelated, 7000);
		Common.assertText(By.xpath("//span[contains(.,'Status')]//following::span[contains(.,'"+wfStatus+"')]"), wfStatus, 0);
		Thread.sleep(3000);
	}




	public void editTPG(String editTags[]) throws InterruptedException {
		
		
		Common.ClickElement(TPGroupComplianceRepo.editTPG, 1000);
		List<WebElement> frames = Common.FindAllElements(RequestRepo.frmFrameNewRequest, 0);



		Common.SwitchToFrame();
	
		for(int t=0; t<editTags.length; t++){
			Common.ClickElement(By.xpath("//span[contains(.,'"+editTags[t]+"')]"), 1000);	

		}
		Common.ClickElement(TPGroupComplianceRepo.tpgSave, 3000);
			Common.SwitchToDefaultContent(3000);
	}
	// Set Requirements then save	

	public void submitRequest(String tPRequestName) throws InterruptedException {

		Common.ClickElement(TPGroupComplianceRepo.tpgRelated,3000);
		Common.ClickElement(By.xpath("//td//following::a[@class='outputLookupLink slds-truncate forceOutputLookup']//following::a[contains(.,'"+tPRequestName+"')]"), 5000);
		Common.deleteCookies(5000);
		if(Common.FindAllElements(TPGroupComplianceRepo.showMoreIconBtn, 0).size()>0)
		{
			Common.ClickElement(TPGroupComplianceRepo.showMoreIconBtn, 1000);

		}
//		Common.ClickElement(TPGroupComplianceRepo.setReqBtn, 1000);

		Common.ClickElement(By.xpath("//a[@title='Open Form']"), 3000);
		List<WebElement> fl=Common.FindAllElements(RequestRepo.frmFrameNewRequest, 0);
		WebElement frames = Common.FindAnElement(RequestRepo.frmFrameNewRequest, 0);
		Common.SwitchToFrame(frames, 0);

		List<WebElement> allInputs = Common.FindAllElements(By.xpath("//div[@class='slds-form-element__control']//input"), 0);
		for(int f=1; f<=allInputs.size(); f++){
			Common.ClearAndSendKeys(By.xpath("(//div[@class='slds-form-element__control']//input)["+f+"]"), "QA Submit"+f, 1000);	
		}
		Common.ClickElement(By.xpath("//button[contains(.,'Submit')]"), 3000);
		Common.SwitchToDefaultContent(1000);

	}

	public void approveOrRejectRequest(String approveOrReject)throws InterruptedException{
		Common.deleteCookies(8000);
		Common.ClickElement((By.xpath("//span[@alt='Show more actions for this record']")), 0);
		Common.ClickElement((By.xpath("//a[@title='"+approveOrReject+"']")), 8000);
		List<WebElement> frames = Common.FindAllElements(RequestRepo.frmFrameNewRequest, 0);
		if(frames.size()>1){
			Common.SwitchToFrame();
		}
		else{
			Common.SwitchToFrame();
		}
		//Common.sendKeys(By.xpath("//textarea[@placeholder='Enter Comments ']"), "QA Test", 0);
		Common.ClearAndSendKeys(By.xpath("//textarea[@placeholder='Enter Comments ']"), "QA Test", 0);
		Common.ClickElement(By.xpath("//input[@value='Submit']"), 0);

	}

	// ========== Abhay 

	public void TPRelationshipChange(String TPGRelationName,String RelationshipType,String ChangeRelationship) throws InterruptedException
	{
		Common.openAppLauncher();
		Common.ClickElement(TPGroupComplianceRepo.TradingPartnerRelationship, 3000);

		Thread.sleep(5000);
		Common.ClickElement(By.xpath("//a[contains(.,'"+TPGRelationName+"')]"), 3000);
		Common.ClickElement(TPGroupComplianceRepo.editTPG, 2000);
		List<WebElement> NewRequestFrame=Common.FindAllElements(ProductRepo.iframe, 0);
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

		Common.SelectDropdownText(TPGroupComplianceRepo.Relationshipdropdown, RelationshipType, 2000);
		Common.ClickElement(TPGroupComplianceRepo.btnSavePro, 2000);
		Thread.sleep(2000);
		Common.ClickElement(TPGroupComplianceRepo.TpgRelationshipClose, 2000);
		Common.SwitchToDefaultContent(2000);
		Common.ClickElement(TPGroupComplianceRepo.editTPG, 2000);
		List<WebElement> NewRequestFram=Common.FindAllElements(ProductRepo.iframe, 0);
		if (NewRequestFram.size()>0)
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

		Common.SelectDropdownText(TPGroupComplianceRepo.Relationshipdropdown, ChangeRelationship, 2000);
		Common.ClickElement(TPGroupComplianceRepo.btnSavePro, 2000);
		Thread.sleep(2000);
		Common.ClickElement(TPGroupComplianceRepo.TpgRelationshipClose, 2000);
	}
	public void SendNewRequirement(String requestType[],String formName2[],String saveOrSend) throws Exception {

		Common.RefreshPage(2000);
		Thread.sleep(5000);
		if(Common.FindAllElements(TPGroupComplianceRepo.showMoreActionsIcon, 0).size()>0)
		{
			Common.ClickElement(TPGroupComplianceRepo.showMoreActionsIcon, 1000);

		}
		Common.ClickElement(TPGroupComplianceRepo.setReqBtn, 1000);
		Common.SwitchToFrame();
		Common.ClickElement(TPGroupComplianceRepo.Addanothercompliance, 2000);
		/////////
		for(int r=2; r<=formName2.length; r++){
			int id=r-1;
			int reqid=r+1;
			if(requestType.length==formName2.length){
				new Select(Common.FindAnElement(By.id("RequestType"+id+""), 10)).selectByVisibleText(requestType[id]);
				//new Select(driver.findElement(By.id("RequestType"+id+""))).selectByVisibleText(requestType[id]);
			}
			else{
				new Select(Common.FindAnElement(By.id("RequestType"+id+""), 10)).selectByVisibleText("All");
			}
			Thread.sleep(3000);
			new Select(Common.FindAnElement(By.id("DocType"+id+""), 10)).selectByVisibleText(formName2[id]);
			Thread.sleep(3000);
			//	Common.selectDueDate(By.xpath("html/body/form/div["+r+"]/div[4]/section/div/div/slds-datepicker/div/div[1]/div/input"), By.xpath("html/body/form/div["+r+"]/div[4]/section/div/div/slds-datepicker/div/div[2]/table/tbody/tr[5]/td[3]/span"), 5000);
			Common.selectDate(By.id(""+id+""),10);	
			Thread.sleep(5000);
			new Select(Common.FindAnElement(By.id("RequirementType"+id+""), 0)).selectByVisibleText("Approval");
			if(r<formName2.length){                  
				// add new requirement
				Common.ClickElement(By.xpath("html/body/form/div["+reqid+"]/div[2]/button"), 5000);	

			}
		}
		Common.ClickElement(By.id(saveOrSend),10000);	

	
		Common.ClickElement(TPGroupComplianceRepo.tpgPopupClose,3000);
		Common.SwitchToDefaultContent(2000);
		Thread.sleep(6000);

	}				

	public void verifySameRequirementAddedInSameGroup(String formName2[]) throws InterruptedException{
		Common.RefreshPage(2000);
		if(Common.FindAllElements(TPGroupComplianceRepo.showMoreActionsIcon, 0).size()>0)
		{
			Common.ClickElement(TPGroupComplianceRepo.showMoreActionsIcon,2000);

		}
		Common.ClickElement(TPGroupComplianceRepo.setReqBtn,1000);

		//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		//Common.SwitchToFrame(1, 0);
		Common.SwitchToFrame();
		new Select(Common.FindAnElement(TPGroupComplianceRepo.requestType, 0)).selectByVisibleText("All");
		Thread.sleep(3000);
		new Select(Common.FindAnElement(TPGroupComplianceRepo.docType, 0)).selectByVisibleText(FormListTestData.formNames_TC9670[0]);
		Thread.sleep(3000);
		Common.selectDueDate1(TPGroupComplianceRepo.clickOncalendar,TPGroupComplianceRepo.selectDueDate,5000);

		/*Actions action = new Actions(driver);
				WebElement we = driver.findElement(By.xpath("html/body/form/div[1]/div[4]/section/div/div/slds-datepicker/div/div[1]/div/input"));
				action.moveToElement(we).moveToElement(driver.findElement(By.xpath("html/body/form/div[1]/div[4]/section/div/div/slds-datepicker/div/div[2]/table/tbody/tr[5]/td[3]/span"))).click().build().perform();
				Thread.sleep(3000);*/
		new Select(Common.FindAnElement(TPGroupComplianceRepo.requirementType, 0)).selectByVisibleText("Approval");

		// add new requirement
		Common.ClickElement(TPGroupComplianceRepo.addNewRequirement, 5000);

		new Select(Common.FindAnElement(TPGroupComplianceRepo.secondRequestType, 0)).selectByVisibleText("All");

		WebElement dropdown = Common.FindAnElement(TPGroupComplianceRepo.secondDocType, 0);
		Select select = new Select(dropdown);    

		int DuplicateReqFlag=0;
		List<WebElement> options = select.getOptions();  
		for(WebElement we1:options)  
		{  
			if (we1.getText().equals(FormListTestData.formNames2_TC9670)){
				System.out.println("Failed:" +FormListTestData.formNames_TC9670+ "already used, Still available to Use ");
				DuplicateReqFlag=1;
				break;
			} 
			//System.out.println("Success: BSE Statement already used, we con't use again ");
		}		
		Assert.assertNotEquals(DuplicateReqFlag, 1);  
		Common.SwitchToDefaultContent(1000);


	}

	public void searchAnythingTest(String searchKeyWord, String SearchTab) throws InterruptedException {
		WaitTool.waitForPageLoadToComplete(Start.getDriverInstance(), 20);
		Common.GlobalSearch(SearchTab,searchKeyWord);
		Log.info("The " + searchKeyWord + " is searched.");
		Common.SwitchToFrame();
		Common.clickPartialLinkText(searchKeyWord, 4);
		Common.RefreshPage(100);
		TakeScreenshots.takescreenshotOnSuccess();

		 
	}
	public void deleteRequirement(String TPGroupName) throws Exception{
		 
		Common.GlobalSearch("Trading Partner Groups", TPGroupName);
		Common.RefreshPage(1000);
		Common.clickPartialLinkText(TPGroupName, 5000);
		TakeScreenshots.takescreenshotOnSuccess();
		Common.ClickElement(TPGroupComplianceRepo.setReqBtn, 20);
		Log.info("Set requirement button for TP group " + TPGroupName + " is clicked.");
		Common.RefreshPage(100);
		Common.SwitchToFrame();
		Common.ClickElement(TPGroupComplianceRepo.delReqmIcon, 20);
		Log.info("Requirement for TP group " + TPGroupName + " is deleted.");
		Common.ClickElement(TPGroupComplianceRepo.btnSaveReqm, 20);
		Thread.sleep(4000);
		Log.info("TP group " + TPGroupName + " is clicked after deleting requirment.");
		Common.ClickElement(TPGroupComplianceRepo.btnCloseSuccessMsg, 20);
		Common.SwitchToDefaultContent(3000);
		Thread.sleep(4000);
	}
}


