package icix.TestData;

 

import java.util.Date;

public class FormListTestData {
	
	static Date d = new Date(System.currentTimeMillis());
	
	//public static String BrandLimitResult= "Fail";
	public static String BrandLimitResult="Pass";

	public static String RequestName="AutoTest "+d;
	
	public static String TradingPartnerName= "Day-Based QA Testing 02 SD";
	public static String RegulatoryLimitResult="Fail";
	
	public static String ProductName="Rk_Product test";
	public static String TestingFacility="feature06";
	public static String RejectComments="Comments to reject request";

	public static String DocumentNamefor2Actor= "Testing09";
	public static String ContaninerNamefor2Actor= "AutomationForm_01";
	
	public static String formName[] = {"formsForAutomation"};
	public static String nameOfCopyForm = "NewFormsAutomation"+d;
	public static String formNames[]={"Automation form "+d};
	
	//TC9670
	public static boolean BPform_TC9670 = true; 
	public static int NoOfTabs_TC9670 = 1; 
	public static int NoOfSections_TC9670 = 1;
	public static boolean generateServiceSection_TC9670 = false;  
	public static int NoOfQuestions_TC9670 = 1;
	public static int NoOfLinkedQuest_TC9670 = 0; 
	public static int NoOfReqQuest_TC9670 = 0; 
	public static int NoOfReadOnlyQuest_TC9670 = 0; 
	public static String[] ansType_TC9670 = {"text"}; 
	public static String picklistVal_TC9670 = null; 
	public static String MultiPickVal_TC9670 = null; 
	public static String[][] NamenValue_TC9670 = {{},{}}; 
	public static String defaultVal_TC9670 = null;
	public static String dependencyValue_TC9670 = null; 
	public static String newFeature_TC9670 = null; 
	public static String[] formNames_TC9670 = {"Automation form "+d};
	public static String[] formNames2_TC9670 = {"Automation  "+d};
	public static String tPRequestName = formNames_TC9670[0];
	//9833
	
	public static boolean BPform_TC9833 = true; // Best practice form or not?
	public static int NoOfTabs_TC9833 = 2; // No of Tabs
	public static int NoOfSections_TC9833 = 4; // No of sections in each tab
	public static boolean generateServiceSection_TC9833 = false; // generate Service Section
	public static int NoOfQuestions_TC9833 = 8; // No of Questions in each Section
	public static int NoOfLinkedQuest_TC9833 = 0; // No of Linked Questions
	public static int NoOfReqQuest_TC9833 = 1; // No of Mandatory fields Questions in Total questions 
	public static int NoOfReadOnlyQuest_TC9833 = 2; // No of Read Only Questions in Total questions 
	public static String ansType_TC9833[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
	public static String picklistVal_TC9833;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
	public static String MultiPickVal_TC9833; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
	public static String NamenValue_TC9833[][] = {{},{}}; // add picklist or multi-picklist options -- add name here
							  // // add picklist  or multi-picklist options -- add Value here
	public static String defaultVal_TC9833; // Select default value for picklist and multi-picklist
	public static String dependencyValue_TC9833 ;  // Select dependency value , It should be in NamenValue list
	public static String newFeature_TC9833; // it's created for feature purpose, now leave it.
	public static String formNames_TC9833[] = {"AutomationTestForm"+d}; //New Added
	
}
