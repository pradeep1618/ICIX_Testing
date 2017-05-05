package icix.Tests;


import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.Common;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TC9832_Test extends TestBase {

	
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();
	
	
	

	@Test
	public void BPF_Scenario05(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		
		ConsoleLog.info("Login sucessfully");
		ObjForm.createNewForm(FormBuilderTestData.BPform_TC9832, FormBuilderTestData.NoOfTabs_TC9832, FormBuilderTestData.NoOfSections_TC9832, 
				FormBuilderTestData.generateServiceSection_TC9832, FormBuilderTestData.NoOfQuestions_TC9832, FormBuilderTestData.NoOfLinkedQuest_TC9832, 
				 FormBuilderTestData.NoOfReqQuest_TC9832, FormBuilderTestData.NoOfReadOnlyQuest_TC9832, FormBuilderTestData.ansType_TC9832, FormBuilderTestData.picklistVal_TC9832, 
				 FormBuilderTestData.MultiPickVal_TC9832, FormBuilderTestData.NamenValue_TC9832, FormBuilderTestData.defaultVal_TC9832, FormBuilderTestData.dependencyValue_TC9832, 
				 FormBuilderTestData.newFeature_TC9832, FormBuilderTestData.formNames_TC9832);
		Log.info("Form Created Successfully ");
		TakeScreenshots.takescreenshotOnSuccess();
	}
}

