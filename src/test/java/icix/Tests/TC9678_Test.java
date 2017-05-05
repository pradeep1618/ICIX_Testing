package icix.Tests;


import java.lang.reflect.Method;

import org.testng.annotations.Test;

import icix.Modules.DocumentLibrary;
import icix.Modules.LoginOut;
import icix.TestData.DocumentLibraryTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.Common;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;

public class TC9678_Test extends TestBase {
	DocumentLibrary ObjDoc = new DocumentLibrary();
	LoginOut objLoginOut = new LoginOut();
	
	String document = DocumentLibraryTestData.document;
	String documentInfoCategory = DocumentLibraryTestData.documentInfoCategory;
	String comment = DocumentLibraryTestData.comments;


	

	@Test
	public void sendDocumentRequest(Method method) throws Exception{
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		
		
		ObjDoc.SendDocument(DocumentLibraryTestData.requestName_TC9678,DocumentLibraryTestData.comments_TC9678,DocumentLibraryTestData.tradingPaartnerName_TC9678);
		Common.LogoutUser();
		objLoginOut.loginAs(LoginOutTestData.Responder);
		Log.info("Searching request at respomnder end");
		Common.GlobalSearch(DocumentLibraryTestData.tabName_TC9678, DocumentLibraryTestData.searchKeyWord_TC9678);
		
		
	//	ObjTP.searchAnything(TPGroupComplianceTestData.tabName_TC10752,TPGroupComplianceTestData.searchKeyWord_TC10752);
		TakeScreenshots.takescreenshotOnSuccess();
	//	objDocument.verifyRequestByComment(comment,1000);
	}


}
