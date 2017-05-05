package icix.Tests;



import java.lang.reflect.Method;

import org.testng.annotations.Test;





import icix.Modules.DocumentLibrary;
import icix.Modules.LoginOut;
import icix.TestData.DocumentLibraryTestData;
import icix.TestData.LoginOutTestData;
import icix.Utils.ConsoleLog;
import icix.Utils.Log;
import icix.Utils.TakeScreenshots;
import icix.Utils.TestBase;





public class TC9676_Test extends TestBase {
	
	DocumentLibrary ObjDoc = new DocumentLibrary();
	LoginOut objLoginOut = new LoginOut();
	
	String document = DocumentLibraryTestData.document;
	String documentInfoCategory = DocumentLibraryTestData.documentInfoCategory;
	String comment = DocumentLibraryTestData.comments;



	@Test
	public void Private_document(Method method) throws Exception {
		Log.info("The Testcase name is :" + method.getName());
		ConsoleLog.info("The Testcase name is :" + method.getName());
		Log.info("Login as requester");
		objLoginOut.loginAs(LoginOutTestData.Requestor);
		ObjDoc.UploadDocument(".txt");
		Log.info("Private document uploaded sucessfully ");
		TakeScreenshots.takescreenshotOnSuccess();
	}


}
