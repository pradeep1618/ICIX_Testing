package icix.Modules;

import icix.Locators.AccountRepo;
import icix.TestData.AccountTestData;
import icix.Utils.Common;
 
import org.testng.Assert;
public class Account {
	


	public void searchTPBy(String sendkey) throws Exception{
Common.openAppLauncher();
	
		Common.ClickElement(AccountRepo.linkAccount, 10);
		Common.ClickElement(AccountRepo.btnNew, 10);
		Common.SwitchToFrame();
		switch (sendkey) {
		case "IcixId":
			Common.ClickElement(AccountRepo.linkAdvanceSearch, 10);
			Common.ClearAndSendKeys(AccountRepo.txtFieldICIXID, AccountTestData.icixId, 10);
			break;

		case "NameAndAddress":
			Common.ClearAndSendKeys(AccountRepo.tpName, AccountTestData.TradingPartnerName_9648, 10);
			Common.ClearAndSendKeys(AccountRepo.address, AccountTestData.Address_9648, 10);
			Common.ClearAndSendKeys(AccountRepo.city, AccountTestData.City_9648, 10);
			Common.ClearAndSendKeys(AccountRepo.state, AccountTestData.State_9648, 10);
			Common.ClearAndSendKeys(AccountRepo.postalCode, AccountTestData.PostalCode_9648, 10);
			
			break;

		case "CompanyName":
			Common.ClickElement(AccountRepo.linkAdvanceSearch, 10);
			Common.ClearAndSendKeys(AccountRepo.tpName, AccountTestData.CompanyName, 10);
			break;
		default:
			System.out.println("Not a valid Search");
			break;
		}
		
		Common.ClickElement(AccountRepo.btnSearch, 10);
		Common.assertText(AccountRepo.verifySearchResult, "We found 1 match in the ICIX Network.", 10);
		
	}
	
	public void searchTPByIcixId(String IcixId) throws Exception{
		Common.openAppLauncher();
		Common.ClickElement(AccountRepo.linkAccount, 10);
		Common.ClickElement(AccountRepo.btnNew, 10);
		Common.SwitchToFrame();
		
		Common.ClickElement(AccountRepo.linkAdvanceSearch, 10);
		Common.ClearAndSendKeys(AccountRepo.txtFieldICIXID, IcixId, 10);
		Common.ClickElement(AccountRepo.btnSearch, 10);
		Common.assertText(AccountRepo.verifySearchResult, "We found 1 match in the ICIX Network.", 10);
		
		
	}

	public void searchByTpNameAndAddress(String tradingPartnerName,String address,String city, String state,String postalCode ) throws Exception{
		
		Common.openAppLauncher();
		Common.ClickElement(AccountRepo.linkAccount, 10);
		Common.ClickElement(AccountRepo.btnNew, 10);
		Common.SwitchToFrame();
		Common.ClearAndSendKeys(AccountRepo.tpName, tradingPartnerName, 10);
		Common.ClearAndSendKeys(AccountRepo.address, address, 10);
		Common.ClearAndSendKeys(AccountRepo.city, city, 10);
		Common.ClearAndSendKeys(AccountRepo.state, state, 10);
		Common.ClearAndSendKeys(AccountRepo.postalCode, postalCode, 10);
		Common.ClickElement(AccountRepo.btnSearch, 10);
		Common.assertText(AccountRepo.verifySearchResult, "We found 1 match in the ICIX Network.", 10);
		
		}
	
	
	//////// Vishal =====================
	
public void searchTradingPartner(String icixID, String tpName, String type){
		Common.openAppLauncher();
		Common.ClickElement(AccountRepo.lnkAccount, 10);
		Common.ClickElement(AccountRepo.btnNew, 10);
		Common.SwitchToFrame();
		Common.ClickElement(AccountRepo.lnkAdvanced, 10);
		
		switch(type){
		case "tc9647":
			if(icixID!=null)
				Common.ClearAndSendKeys(AccountRepo.txtIcixId, icixID, 10);
				break;
			
		case "tc9653":
			if(tpName!=null)
				Common.ClearAndSendKeys(AccountRepo.txtTradingPartnerName, tpName, 10);
				break;
		}
		
		Common.ClickElement(AccountRepo.btnSearch, 10);
		Common.SwitchToDefaultContent(10);
	}
	
	public void connectTradingPartner(String relType, String relInforComnts, String tagName){
		if(Common.checkExistenceOfElement(AccountRepo.btnConnect, 10)==true){
			Common.ClickElement(AccountRepo.btnConnect, 10);
			Common.SelectDropdownText(AccountRepo.drpDwnRelationshipType, relType, 10);
			Common.ClearAndSendKeys(AccountRepo.txtComments, relInforComnts, 10);
			Common.ClickElement(AccountRepo.tabRelationshipTags, 10);
			Common.ClickElement(AccountRepo.lnkAddATag, 10);
			Common.ClearAndSendKeys(AccountRepo.txtAddATag, tagName, 10);
		}
		else{
			Assert.assertTrue(false, "Trading partner is already connected");
		}
	}
	
	public void verifyConnect(){
		String actual = Common.getElementText(AccountRepo.divConnected, 10);
		Assert.assertEquals(actual, "Connected");
	}
	
	
	
}
