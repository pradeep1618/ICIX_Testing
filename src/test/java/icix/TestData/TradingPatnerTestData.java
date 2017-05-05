package icix.TestData;

import java.util.Date;

public class TradingPatnerTestData {
	public static Date d = new Date(System.currentTimeMillis());

	
	public static String tradingPartnerName="Day-Based QA Testing 02";
	public static String address="1014 Main St.";
	public static String city="San Francisco";
	public static String state="CA";
	public static String postalCode="94107";
	
	
	/////9665
	
	public static String tpgName_9665 = "Tags Only TPG" + d; // Trading partner Group Name
	public static String tpgTags_9665[] = { "Organic"};  // Tag Names
	public static String tpgStatus_9665[]= {}; // tpg Status
	public static String tpgType_9665[] = {}; // tpg Relationship types
	public static String editTags_9665[]={"Organic"};

///////////9663
	
	
	
	public static String TPGRelationName_9663 ="Dev AQA 03";
	public static String RelationshipType_9663="Cold Storage";
	public static String ChangeRelationship_9663="Broker";
	
	///////9672
	
	public static String FormName_9672="BSE Statement";
	public static String[] formNames_9672 = {"Testing-Tr"};
	public static String RequestName_9672="AutoTest"+ d;
	public static boolean selectTP_9672=true;
	public static String TradingPartnerName_9672="Day Based QA02";
	public static String ProductName_9672=null;
	public static String DocumentName_9672="Dev PKG 02";
	public static String SendRequestComments_9672="Test comment";
	public static String ContainerName_9672= "Testcontainer";
	public static String AttentionComments_9672="Request is sent..";
	public static String TestingFacility_9672=null;

///////9733
	 public static String TradingPartnerName_9733="Clean Org 07";
	 public static String DocumentName_9733="Testcontainer";
	 public static String SendRequestComments_9733="Request is sent..";
	 public static String ContainerName_9733= "Testcontainer";
	 public static String AttentionComments_9733="Comments from responder";
		public static String RequestName_9733="AutoTest"+ d;
		public static String TestingFacility_9733="";
	///////9735
		 public static String TradingPartnerName_9735="Clean Org 07";
		 public static String DocumentName_9735="Testcontainer";
		 public static String SendRequestComments_9735="Request is sent..";
		 public static String ContainerName_9735= "Testcontainer";
		 public static String AttentionComments_9735="Comments from responder";
			public static String RequestName_9735="Automation Request "+ d;
			public static String TestingFacility_9735="";
			 public static String ProductName_9735="Test Product";//"Tu-Test"; /*"Tu-Test-Product";*/			 
			 public static String ApprovedComments_9735="";
				///////9856
			 public static String RejectComments_9856="Request Rejected...";
			 public static String TradingPartnerName_9856="Clean Org 07";
			 public static String DocumentName_9856="Testcontainer";
			 public static String SendRequestComments_9856="Request is sent..";
			 public static String ContainerName_9856= "Testcontainer";
			 public static String AttentionComments_9856="Comments from responder";
				public static String RequestName_9856="AutoTest"+ d;
				public static String TestingFacility_9856="";
				 public static String ProductName_9856="Tu-Test-Product";
				 
				 public static String ApprovedComments_9856="";
			 
}
