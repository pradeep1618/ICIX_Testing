package icix.Locators;

import org.openqa.selenium.By;

public class TPGroupComplianceRepo {
	// tpg 	
			
	public static By lnkRequests=By.xpath("//span[@class='label slds-truncate slds-text-link'][contains(.,'Requests')]");
	        public static By tpgTab = By.xpath("//span[@class='label slds-truncate slds-text-link'][contains(.,'Trading Partner Groups')]");
			public static By tpgNewBtn =By.cssSelector("div[title='New']");
			public static By tpgName =By.id("txtGroupName");
		//	public static By tagName = "//span[contains(.,'GFSI Certified')]";
			public static By tpgSave = By.xpath("//button[@assistive-text='Save']");
			public static By successMsg =By.xpath("//p[@class='ng-binding']");
			public static By tpgPopupClose =By.cssSelector("div.slds-x-small-buttons--horizontal > button.slds-button.slds-button--brand");
			public static By statusTab =By.xpath("//a[contains(.,'Status')]");
		//	public static By statusPending = "//span[contains(.,'Pending')]";
		//	public static By statusActive = "//span[contains(.,'Active')]";
			public static By moveIconRight =By.xpath(".//*[@id='icnMoveRight']");
			public static By typeTab = By.xpath("//a[contains(.,'Type')]");
	/*	public static By typeAgent = "//span[contains(.,'Agent')]";
			public static By typeBroker = "//span[contains(.,'Broker')]";
			public static By editTPG = "//a[@title='Edit']";*/

		// tpg compliance 	
			public static By showMoreActionsIcon =By.xpath("//a[contains(@title,'Show more actions for this record')]");
			public static By showMoreIconBtn = By.xpath("//a[contains(.,'Show more actions for this record')]");
			public static By setReqBtn =By.xpath("//a[@title='Set Requirements']");
			public static By tpgRelated =By.xpath("//span[contains(.,'Related')]");
			public static By tpgCompLink =By.xpath("//span[contains(.,'Trading Partner Group Requirements')]");
			public static By reqList =By.xpath("//th[@tabindex='-1']");
			public static By showMore =By.xpath("//span[contains(@title,'Show more actions for this record')]");
			public static By oneContent =By.xpath("//div[@class='active oneContent']");
			//public static By btnDeleteReq =By.xpath("//a[@role='menuitem']//following::div[@title='Delete']");
			public static By btnDeleteReq =By.xpath("//li[@class='slds-button slds-button--neutral slds-truncate'][1]//following::a[@title='Delete'][1]//following::div[@title='Delete'][2]");
			//public static By delete =By.xpath(".//div[@title='Delete']");
			
			
			public static By btnDelete=By.xpath("//a[@title='Show more actions for this record']//following::span[@class='slds-icon_container slds-icon-utility-down slds-button__icon forceIcon']");
			/*public static By RequestType = "RequestType0";
			public static By DocType ="DocType0";
			public static By dueDate = "//input[@id='']";
			public static By calender = ".slds-day.ng-binding.ng-scope";
			public static By reqSaveUpdateMsg = "//h3[@class='ng-binding']";
			public static By reqSendMsg=".ng-binding>div";*/
			
		public static By BtnDelete=By.xpath("//button[@title='Delete']");
		// Global	
			public static By searchBox = By.xpath("//input[@title='Search Salesforce']");
		
		// Workflows
			public static By wfStatus = By.xpath("//span[contains(.,'Workflow Status')]/following::span[2]");
			public static By ReqStatus =By.xpath( "//span[contains(.,'Closed')]");
			
			public static By editTPG =By.xpath("//a[@title='Edit']");

	// New Workflow locators (Rishu)23.12.16
			//public static By ReqStatusN ="//span[contains(.,'Closed')]";*/
			
			
			// Abhay 
			
public static By TradingPartnerRelationship=By.xpath("//span[@class='label slds-truncate slds-text-link'][contains(.,'Trading Partner Relationships')]");
			
			public static By Relationshipdropdown=By.xpath("//select[@id='ddl_UURelationship_Type']");
			public static By btnSavePro=By.id ("btn_UPRelationship_Save");
			public static By TpgRelationshipClose=By.xpath("//button[contains(text(),'Close')]");
			public static By Addanothercompliance =(By.xpath("//button[contains(.,'Add another compliance criteria')]"));

		
		
// Due Date
			
			public static By requirementType = By.id("RequirementType0");
			public static By secondRequirementType = By.id("RequirementType1");
			public static By docType= By.id("DocType0");
			public static By secondDocType= By.id("DocType1");
			public static By requestType =By.id("RequestType0");
			public static By secondRequestType =By.id("RequestType1");
			public static By clickOncalendar=	By.id("0");
			public static By selectDueDate=By.xpath("//span[contains(.,'24')]");
			public static By addNewRequirement= By.xpath("html/body/form/div[2]/div[2]/button");
			 public static By delReqmIcon = By.xpath("html/body/form/div[1]/div[6]/button");
			   public static By btnSaveReqm = By.id("btnSave");
			   public static By btnCloseSuccessMsg = By.xpath("//button[@class='slds-button slds-button--brand'][contains(.,'Close')]");
			
		 

}
