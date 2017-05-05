package icix.TestData;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

public class ProductTestData {
	
	
	static Date d = new Date(System.currentTimeMillis());
	
	public static String NameofProduct= ("TestProduct")+d;
	public static String CategoryName="TestCategory";
	static String RandomNumbers=RandomStringUtils.randomNumeric(8);
	
	public static String TestClass="4.15 (ASTM F963-11), Stability and Overlo";
	public static String TestName="Decabromodiphenyl ether (DecaBDE)";
	public static String TestType="Quantitative";
	public static String TestMethodName="Test Method";
	public static String Operator="<=";
	public static String Value="3";
	public static String Measure="%";
	public static String Message="Fail";

	public static String ProductRelationshipWithTP="Day-Based QA Testing 02 SD";
	public static String FormName="Product Test Form 1/4/2017 3:20 AM";
	public static String SearchProductForTradingPartner= "Day-Based QA Testing 03 SD";
	
	//S
	public static String RequestName="AutoTest"+d;
	public static String TradingPartnerName= "Day-Based QA Testing 02 SD";
	public static String ProductName="Rk_Product test";
	
	public static String DocumentName="Product Test Form 1/24/2017 4:42 AM";
	public static String SendRequestComments= "Request is sent..";
	public static String ContaninerName="Product Test Form 1/24/2017 4:42 AM";
	public static String AttentionComments="Attention Comments From Responder";
	public static String ApprovedComments= "Comments to approve request";
	
	//TC10781	
		public static String selectTP_TC10781 = "Rel PKG 05";
		public static String univeralID_TC10781 = "111";
		public static String ProductName_TC10781 = "New Automation Testing";
		public static String id_TC10781 = "UPC";
		public static String idtxt_TC10781 = "1231231231";
		public static String Description_TC10781 = "Automation Testing";
		public static String TradingpRel_TC10781= "Rel PKG 05";
		
		//TC10782	
		public static String selectTP_TC10782 = "Rel PKG 05";
		public static String univeralID_TC10782 = "111";
		public static String ProductName_TC10782 = "New Automation Testing";
		public static String id_TC10782 = "UPC";
		public static String idtxt_TC10782 = "1231231231";
		public static String Description_TC10782 = "Automation Testing";
		public static String TradingpRel_TC10782= "Rel PKG 05";
	//9654





	public static String UPCproduct_9654 = "Automation"+RandomNumbers;
	
	public static String SearchProductForTradingPartner_9654="Day-Based QA Testing 02";
	public static String StringTradingPartnerNameRequestor_9654="SD Dev Org 05";
	public static String ProductRelationshipWithTP_9654="Day-Based QA Testing 02";
	public static String ProgramName_9654="";
	public static String privacysetting_9654="Public";
	public static String productstatus_9654="Connect to Product";
	public static String NameofProduct_9654="TestProduct" +RandomNumbers;
	public static String iDs_9654="UPC" ;
 
	
 
		//9656
		
		public static String Product_9656[]= {"TestProduct" + d};
	 	public static String UPCproduct_9656 = "1111" + RandomNumbers;
		public static String SearchProductForTradingPartner_9656="Rel PKG 05";
		public static String StringTradingPartnerNameRequestor_9656="Rel PKG 04";
		public static String ProductRelationshipWithTP_9656="Rel PKG 05";
		public static String ProgramName_9656="";
		public static String privacysetting_9656="Private";
		public static String NameofProduct_9656= "TestProduct" + d;
		public static String productstatus_9656="";
		public static String iDs_9656="UPC" ;
		
		//10781

		public static String UPCproduct_10781 = "test12121"+RandomNumbers;
		public static String SearchProductForTradingPartner_10781="sdd3v06";
		public static String StringTradingPartnerNameRequestor_10781="sdd3v05";
		public static String ProductRelationshipWithTP_10781="sdd3v06";
		public static String ProgramName_10781="";
		public static String privacysetting_10781="Public";
		public static String productstatus_10781="Connect to Product";
		public static String NameofProduct_10781="Automation ";
		public static String iDs_10781="UPC" ;
		public static String UPCofProduct_10781 = "";
		
		//10782
		
		 
		

		public static String SearchProductForTradingPartner_10782="sdd3v06";
		public static String StringTradingPartnerNameRequestor_10782="sdd3v05";
		public static String ProductRelationshipWithTP_10782="sdd3v06";
		public static String ProgramName_10782="";
		public static String privacysetting_10782="Public";
		public static String productstatus_10782="Connect to Product";
		public static String NameofProduct_10782="Automation"+RandomNumbers;
		public static String iDs_10782="UPC" ;
		public static String UPCofProduct_10782 = "UPCproduct"+RandomNumbers;
		
		
	 
		
		//9647
		public static  String ICIXiD_9647 = "112";
		public static  String type_9647 = "tc9647";
		
		 
		 
		//9659
		public static String NameofProduct_9659 = "Product Test" + d;
		public static String ProductRelationshipWithTP_9659 = ""; 
		public static String ProgramName_9659 = "";
		public static String TradingPartnerName_9659="sdd3v06";
		public static String TpgTagsName_9659="QA"+d;
		
		//9673
		
	 
		public static String RequestName_9673 ="AutoTest"+ d;
		public static boolean selectTP_9673 =false;
		public static String TradingPartnerName_9673 ="Day Based QA02";
		public static String ProductName_9673 ="Rk_Product test";
		public static String DocumentName_9673 ="Dev PKG 02";
		public static String SendRequestComments_9673 ="Test comment";
		public static String ContainerName_9673 = "Testcontainer";
		public static String AttentionComments_9673 ="Request is sent..";
		public static String TestingFacility_9673  =null;
	 
	 


	

	//TC9667
	public static String productGroupName = "Automation Product Group " + d;
	
 

	//9667
	public static String productGroupName_9667 = "Automation Product Group " + d;

	///9668

	public static String Group_9668="Productgroup" + d;
	public static String TagName_9668="Organic";
	public static String Edittag_9668="Organic";
}
