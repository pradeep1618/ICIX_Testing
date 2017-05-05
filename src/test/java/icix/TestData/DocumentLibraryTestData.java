package icix.TestData;

import java.util.Date;

public class DocumentLibraryTestData {

	static Date d = new Date(System.currentTimeMillis());

	public static String document = "Automation test document " + d;
	public static String fileName=".\\TestFile.doc";
	public static String documentInfoCategory = "Form";
	public static String request_Name = "DocumentSending";
	public static String tpName = "Day-Based QA";
	public static String comments = "Testing Automation";
	
	 // Test data for TC9678
		public static String categor_TC9678 = "Form";
		public static String requestName_TC9678 = "DocumentRequest"+d;
		public static String tradingPaartnerName_TC9678 = "Day-Based QA Testing 02 SD";
		public static String comments_TC9678 = "Testing Document Request";
		public static String tabName_TC9678= "Requests";
		public static String searchKeyWord_TC9678 =requestName_TC9678;
}
