package icix.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import icix.Modules.FormList;
import icix.Modules.LoginOut;
import icix.TestData.FormBuilderTestData;
import icix.TestData.LoginOutTestData;
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TC9845_Test extends TestBase {
	
	FormList ObjForm=new FormList();
	LoginOut objLoginOut = new LoginOut();
	
	
	@Test
	public void CF_Form1(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		
		ConsoleLog.info("Login sucessfully");
		
		ObjForm.createNewForm(FormBuilderTestData.BPform_9842, FormBuilderTestData. NoOfTabs_9842, FormBuilderTestData.NoOfSections_9842, 
				FormBuilderTestData.generateServiceSection_9842, FormBuilderTestData.NoOfQuestions_9842 , FormBuilderTestData.NoOfLinkedQuest_9842, 
				 FormBuilderTestData.NoOfReqQuest_9842, FormBuilderTestData.NoOfReadOnlyQuest_9842 , FormBuilderTestData.ansType_9842, FormBuilderTestData.picklistVal_9842, 
				 FormBuilderTestData.MultiPickVal_9842, FormBuilderTestData.NamenValue_9842, FormBuilderTestData.defaultVal_9842, FormBuilderTestData.dependencyValue_9842, 
				 FormBuilderTestData.newFeature_9842, FormBuilderTestData.formNames_9842);
		ConsoleLog.info("Form created sucessfully");
		TakeScreenshots.takescreenshotOnSuccess();
		}	
}


