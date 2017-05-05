package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.Modules.TPGroupCompliance;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.TestData.TPGroupComplianceTestData;
import icix.Utils.Common;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TestBase;

import java.lang.reflect.Method;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/* Tp Group Compliance - Request status by removing a member which exists 
 in multiple groups
 */

public class TC10774_Test extends TestBase{

	LoginOut objLoginOut = new LoginOut();
	FormList ObjFormList=new FormList();
	TPGroupCompliance ObjTP=new TPGroupCompliance();

	@Test
	public void removeMemberWhichExistsInMultipleGroups(Method method) throws Exception {

		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		// Login as Requester 

		objLoginOut.loginAs(LoginOutTestData.Requestor);
		Log.info("Creating New Form");
		ObjFormList.createNewForm(FormBuilderTestData.BPform_TC9670, FormBuilderTestData.NoOfTabs_TC9670, FormBuilderTestData.NoOfSections_TC9670, FormBuilderTestData.generateServiceSection_TC9670, 
				FormBuilderTestData.NoOfQuestions_TC9670, FormBuilderTestData.NoOfLinkedQuest_TC9670, FormBuilderTestData.NoOfReqQuest_TC9670, FormBuilderTestData.NoOfReadOnlyQuest_TC9670,
				FormBuilderTestData.ansType_TC9670, FormBuilderTestData.picklistVal_TC9670, FormBuilderTestData.MultiPickVal_TC9670, 
				FormBuilderTestData.NamenValue_TC9670, FormBuilderTestData.defaultVal_TC9670, FormBuilderTestData.dependencyValue_TC9670, 
				FormBuilderTestData.newFeature_TC9670, FormBuilderTestData.formNames_TC9670);

		Log.info("Creating TPG");
		ObjTP.createTPG(TPGroupComplianceTestData.tpgName__TC10774, TPGroupComplianceTestData.tpgTags_TC10774, TPGroupComplianceTestData.tpgStatus_TC10774, TPGroupComplianceTestData.tpgType_TC10774);
		Common.deleteCookies(80);
		Log.info("Set Requirement");
		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10774, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10774);

		// then Create second tpg and set same reqs
		ObjTP.createTPG(TPGroupComplianceTestData.tpgName2_TC10774,TPGroupComplianceTestData.tpgTags2_TC10774,TPGroupComplianceTestData.tpgStatus2_TC10774,TPGroupComplianceTestData.tpgType2_TC10774);
		Common.deleteCookies(80);

		ObjTP.SetRequirement(TPGroupComplianceTestData.requestType_TC10774, FormBuilderTestData.formNames_TC9670, TPGroupComplianceTestData.saveOrSend_TC10774);
		// Remove Member
		ObjTP.editTPG(TPGroupComplianceTestData.editTags_TC10774);
		// // then search
		ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10774, TPGroupComplianceTestData.searchKeyWord_TC10774);

		// Verify the request at requester side
		ObjTP.assertReqWFnStatus(TPGroupComplianceTestData.reqStatus_TC10774,TPGroupComplianceTestData.wfStatus_TC10774);

	}
}
