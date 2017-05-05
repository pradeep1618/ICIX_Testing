package icix.Tests;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

import java.lang.reflect.Method;
import java.util.ArrayList;
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



public class TC9887_Test extends TestBase  {

	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();	

	
	

	@Test
	public void CF_Scenario18(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		
		ConsoleLog.info("Login sucessfully");
		ObjForm.createNewForm(FormBuilderTestData.BPform_TC9887, FormBuilderTestData.NoOfTabs_TC9887, FormBuilderTestData.NoOfSections_TC9887, 
				FormBuilderTestData.generateServiceSection_TC9887, FormBuilderTestData.NoOfQuestions_TC9887, FormBuilderTestData.NoOfLinkedQuest_TC9887, 
				 FormBuilderTestData.NoOfReqQuest_TC9887, FormBuilderTestData.NoOfReadOnlyQuest_TC9887, FormBuilderTestData.ansType_TC9887, FormBuilderTestData.picklistVal_TC9887, 
				 FormBuilderTestData.MultiPickVal_TC9887, FormBuilderTestData.NamenValue_TC9887, FormBuilderTestData.defaultVal_TC9887, FormBuilderTestData.dependencyValue_TC9887, 
				 FormBuilderTestData.newFeature_TC9887, FormBuilderTestData.formNames_TC9887);
		Log.info("Form Created Successfully ");
		TakeScreenshots.takescreenshotOnSuccess();
	}
}