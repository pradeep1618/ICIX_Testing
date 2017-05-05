package icix.Tests;

import icix.Modules.FormList;
 
import icix.Modules.LoginOut;
  
import icix.Modules.TPGroupCompliance;
 
import icix.TestData.FormListTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPComplianceTestData;
import icix.Utils.Common;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;
 





import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


	public class TC10461_Test extends TestBase {

		FormList ObjFormList=new FormList();

		LoginOut objLoginOut = new LoginOut();
		TPGroupCompliance ObjTP=new TPGroupCompliance();

		@Test
		public void CreateTpg() throws Exception {

			objLoginOut.loginAs(LoginOutTestData.Requestor);
			Log.info("LoginSuccessfully");
			// Create New Form
			ObjFormList.createNewForm(FormListTestData.BPform_TC9670, FormListTestData.NoOfTabs_TC9670, FormListTestData.NoOfSections_TC9670, FormListTestData.generateServiceSection_TC9670, 
				    FormListTestData.NoOfQuestions_TC9670, FormListTestData.NoOfLinkedQuest_TC9670, FormListTestData.NoOfReqQuest_TC9670, FormListTestData.NoOfReadOnlyQuest_TC9670,
				    FormListTestData.ansType_TC9670, FormListTestData.picklistVal_TC9670, FormListTestData.MultiPickVal_TC9670, 
				    FormListTestData.NamenValue_TC9670, FormListTestData.defaultVal_TC9670, FormListTestData.dependencyValue_TC9670, 
				    FormListTestData.newFeature_TC9670, FormListTestData.formNames_TC9670);
			Log.info("Form Created Successfully");
			Log.info("Form Created Successfully");

			//	Common.openAppLauncher();
			Log.info("Form created");
			// Create a Trading partner Group
			ObjTP.createTPG(TPComplianceTestData.tpgName_TC10461, TPComplianceTestData.tpgTags_TC10461, TPComplianceTestData.tpgStatus_TC10461, TPComplianceTestData.tpgType_TC10461);
			Common.deleteCookies(8000);
			Log.info("TPG Created Successfully");
			Common.deleteCookies(8000);
			TakeScreenshots.takescreenshotOnSuccess();
			
		}

}	