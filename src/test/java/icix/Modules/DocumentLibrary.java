package icix.Modules;

import icix.Locators.DocumentLibraryRepo;
import icix.Locators.RequestRepo;
import icix.Utils.Common;
import icix.Utils.TakeScreenshots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;





import org.openqa.selenium.WebElement;

public class DocumentLibrary {


	public void UploadDocument(String docType) throws InterruptedException, AWTException{
		Common.openAppLauncher();
		Common.ClickElement(DocumentLibraryRepo.linkDocument, 120);
		Common.SwitchToFrame();
		int numberOfDocumentBeforeUpload=Common.FindAllElements(DocumentLibraryRepo.documentList,10).size();
		
		Common.ClickElement(DocumentLibraryRepo.btnAddDocument, 120);

		StringSelection sel = new StringSelection(Common.getTextFile(docType));

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);

		// This will click on Browse button
		Common.ClickElement(DocumentLibraryRepo.browseLink, 120);

		System.out.println("Browse button clicked");

		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		//   Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		Common.ClickElement(DocumentLibraryRepo.btnSave, 120);		
		Common.ClickElement(DocumentLibraryRepo.uploadButton, 120);
		Common.ClickElement(DocumentLibraryRepo.btnShowMore, 120);
		Common.assertTrue(++numberOfDocumentBeforeUpload, Common.FindAllElements(DocumentLibraryRepo.documentList, 10).size());
		Common.assertTrue(Common.getTextFile(docType).contains(Common.getElementText(DocumentLibraryRepo.uploadedDocumentName, 120)));
		TakeScreenshots.takescreenshotOnSuccess();
	}
	
	
	public void SendDocument (String ReqNames, String CommeNt, String TPName){
		Common.ClickElement(DocumentLibraryRepo.lnkDocument, 5);
		List<WebElement> NewRequestFrame=Common.FindAllElements(DocumentLibraryRepo.frame,10);
		System.out.println(NewRequestFrame.size());
					if (NewRequestFrame.size()>0)
					{
					if (NewRequestFrame.size()>1)
					{
						Common.SwitchToFrame(NewRequestFrame.get(1), 50);
					}
					else
					{
						Common.SwitchToFrame(NewRequestFrame.get(0), 50);
					}
					}
		Common.mouseHover(DocumentLibraryRepo.btnShowMore, DocumentLibraryRepo.Sendlnk, 50);
		Common.ClearAndSendKeys(DocumentLibraryRepo.ReqName, ReqNames, 50);
		Common.ClearAndSendKeys(DocumentLibraryRepo.Resipents, TPName, 10);
		Common.ClickElement(DocumentLibraryRepo.ResipentDrop, 20);
		Common.ClearAndSendKeys(DocumentLibraryRepo.coment, CommeNt, 5);
		Common.ClickElement(DocumentLibraryRepo.btnSend, 70);
		Common.ClickElement(RequestRepo.btnClose, 20);
		
		}

}
