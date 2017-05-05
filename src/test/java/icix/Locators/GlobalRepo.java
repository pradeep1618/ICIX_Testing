package icix.Locators;

import org.openqa.selenium.By;

public class GlobalRepo {
	
	public static By txtGlobalSrc=By.xpath("//input[@placeholder='Search Salesforce']");
	 public static By optionSearchInSalesforce=By.xpath("//input[@placeholder='Search Salesforce']/following-sibling::div/div[@class='listContent']/ul/li/a/span[contains(text(),'in Salesforce')]");
	 public static By lnkShowMore=By.linkText("Show More");
	 public static By divLeftSideMenu=By.id("allItemsList");
	 public static By appLauncherIcon=By.xpath("//div[@class='slds-icon-waffle_container']");
	 public static By closeAppLauncher=By.xpath("//div[contains(@class,'appLauncherModalHeader')]/parent::h2/following-sibling::button");
	 public static By globalSearchRequestTab=By.xpath("//div[@data-aura-class='forceSearchScopesList']/ul/li/a[contains(text(),'Requests')]");
	 public static By globalSearchWorkflowsTab=By.xpath(".//*[@id='allItemsList']/ul/li/a[contains(text(),'Workflows')]");
	 public static By globalSearchResult=By.xpath("//div[@class='active oneContent']/div/div/div/div/div/div[contains(@class,'searchResultsGridHeader')]/div/div/div[1]/p");
	 public static By globalSearchResultNumber1=By.xpath("//div[@class='active oneContent']/div/div/div/div/div/div[contains(@class,'searchResultsGridHeader')]/div/div/div[2]/p[contains(text(),'1')]");
	 public static By imgWaitingLoader = By.xpath("//img[@class='waitingImage']");

	//For selectDate() method in Common.java
	public static By tblDate = By.xpath("//table[@class='datepicker__month']");
	public static By tblNextMonth = By.xpath("//button[@title='Next Month']");
	public static By tblTd = By.tagName("td");
	public static By frame=By.tagName("iframe");

}
