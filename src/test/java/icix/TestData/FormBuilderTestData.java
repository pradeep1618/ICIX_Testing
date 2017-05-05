package icix.TestData;

import java.util.Date;


public class FormBuilderTestData {
	
	static Date d = new Date(System.currentTimeMillis());
	public static String containerName= "AutomationForm"+d;
	//public static String BrandLimitResult= "Fail";
	public static String BrandLimitResult="Pass";

	public static String RequestName="AutoTest "+d;
	public static String ApprovedComments= "Comments to approve request";
	public static String TradingPartnerName= "Day-Based QA Testing 02 SD";
	public static String RegulatoryLimitResult="Fail";
	
	public static String ProductName="Rk_Product test";
	public static String DocumentName= "Product Test Form 1/4/2017 9:44 AM";
	public static String SendRequestComments= "Request is sent..";
	public static String ContaninerName="Product Test Form 1/4/2017 9:44 AM";
	public static String AttentionComments="Attention Comments From Responder";
	public static String TestingFacility="feature06";
	public static String RejectComments="Comments to reject request";

	public static String DocumentNamefor2Actor= "Testing09";
	public static String ContaninerNamefor2Actor= "AutomationForm_01";
	
	public static String formName[] = {"formsForAutomation"};
	public static String nameOfCopyForm = "NewFormsAutomation"+d;
	
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
	public static String[] formNames_TC9670 = {"Automation form"+d};
	public static String tPRequestName = formNames_TC9670[0];
	
	
	// ======= Create Form Test Data for TP Compliance ===========

		public static boolean BPform = true; // Best practice form or not?
		public static int NoOfTabs = 1; // No of Tabs
		public static int NoOfSections = 1; // No of sections in each tab
		public static boolean generateServiceSection = false; // generate Service Section
		public static int NoOfQuestions = 1; // No of Questions in each Section
		public static int NoOfLinkedQuest = 0; // No of Linked Questions
		public static int NoOfReqQuest = 0; // No of Mandatory fields Questions in Total questions
		public static int NoOfReadOnlyQuest = 0; // No of Read Only Questions in Total questions
		public static String ansType[] = { "text" }; // for different answer type, available types

		public static String picklistVal; // If answer type is picklist then set values available

		public static String MultiPickVal; // If answer type is multi-picklist then set values
		public static	String NamenValue[][] = { {}, // add picklist or multi-picklist options --
			// add name here
			{} }; // // add picklist or multi-picklist options -- add Value here
		public static String defaultVal; // Select default value for picklist and multi-picklist
		public static String dependencyValue; // Select dependency value , It should be in
		// NamenValue list
		public static String newFeature; // it's created for feature purpose, now leave it.
		//public static String formNames[] = { "AutomationForm" };







		//=========== TC9886 Test Data ================

		public static boolean TC9886BPform = false; // Best practice form or not?
		public static	int TC9886NoOfTabs = 2; // No of Tabs
		public static	int TC9886NoOfSections = 4; // No of sections in each tab
		public static	boolean TC9886GenerateServiceSection = false; // generate Service Section
		public static	int TC9886NoOfQuestions = 4; // No of Questions in each Section
		public static	int TC9886NoOfLinkedQuest = 2; // No of Linked Questions
		public static	int TC9886NoOfReqQuest = 2; // No of Mandatory fields Questions in Total questions
		public static	int TC9886NoOfReadOnlyQuest = 0; // No of Read Only Questions in Total questions
		public static	String TC9886ansType[] = { "text" }; // for different answer type, available types
		// text,checkbox, date,
		// datetime,multi-picklist,
		// number,picklist,long
		// text,upload,search,multi-search,radio,email
		// address
		public static	String TC9886PicklistVal; // If answer type is picklist then set values available
		// types
		// boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static	String TC9886MultiPickVal; // If answer type is multi-picklist then set values
		// available types
		// boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static	String TC9886NamenValue[][] = { {}, // add picklist or multi-picklist options --
			// add name here
			{} }; // // add picklist or multi-picklist options -- add Value here
		public static	String TC9886DefaultVal; // Select default value for picklist and multi-picklist
		public static	String TC9886DependencyValue; // Select dependency value , It should be in
		// NamenValue list
		public static	String TC9886NewFeature; // it's created for feature purpose, now leave it.
		//String formNames[]={FormBuilderTestData.formNameForTPCompliance};


		//=========== TC9884 Test Data ================	

		public static boolean TC9884BPform = true; // Best practice form or not?
		public static int TC9884NoOfTabs = 1; // No of Tabs
		public static int TC9884NoOfSections = 1; // No of sections in each tab
		public static boolean TC9884GenerateServiceSection = false; // generate Service Section
		public static int TC9884NoOfQuestions = 5; // No of Questions in each Section
		public static int TC9884NoOfLinkedQuest = 0; // No of Linked Questions
		public static int TC9884NoOfReqQuest = 0; // No of Mandatory fields Questions in Total questions 
		public static int TC9884NoOfReadOnlyQuest = 0; // No of Read Only Questions in Total questions 
		public static String TC9884AnsType[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String TC9884PicklistVal;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String TC9884MultiPickVal; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String TC9884NamenValue[][] = {{}, // add picklist or multi-picklist options -- add name here
			{}}; // // add picklist  or multi-picklist options -- add Value here
		public static String TC9884DefaultVal; // Select default value for picklist and multi-picklist
		public static String TC9884DependencyValue ;  // Select dependency value , It should be in NamenValue list
		public static String TC9884NewFeature; // it's created for feature purpose, now leave it.



		/************** TP Compliance Test Data **********************/

	 
		///////9827
//		TestData for TC9827
		public static boolean BPform_TC9827 = true; // Best practice form or not?
		public static int NoOfTabs_TC9827 = 2; // No of Tabs
		public static int NoOfSections_TC9827 = 4; // No of sections in each tab
		public static boolean generateServiceSection_TC9827 = false; // generate Service Section
		public static int NoOfQuestions_TC9827 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9827 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9827 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9827 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9827[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9827;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9827; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9827[][] = {{},{}}; // add picklist or multi-picklist options -- add name here
								  // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9827; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9827 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9827; // it's created for feature purpose, now leave it.
		public static String formNames_TC9827[] = {"AutomationTestForm"+d}; //New Added

	////9833
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
		
		//9875
		
		public static boolean BPform_9875 = false; // Best practice form or not?
		public static int NoOfTabs_9875 = 1; // No of Tabs
		public static int NoOfSections_9875 = 1; // No of sections in each tab
		public static boolean generateServiceSection_9875 = false; // generate Service Section
		public static int NoOfQuestions_9875 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_9875 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9875 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9875 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9875[] = { "text","checkbox", "date", "datetime","multi-picklist","radio","upload"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9875 = "boolean";  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9875= "chemicals"; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9875[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9875; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9875 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9875; // it's created for feature purpose, now leave it.


		//9871
		public static  boolean BPform_9871 = false; // Best practice form or not?
		public static int NoOfTabs_9871 = 1; // No of Tabs
		public static int NoOfSections_9871 = 1; // No of sections in each tab
		public static boolean generateServiceSection_9871 = true; // generate Service Section
		public static int NoOfQuestions_9871 = 0; // No of Questions in each Section
		public static int NoOfLinkedQuest_9871 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9871 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9871 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9871[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9871="";  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9871=""; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9871[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9871=""; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9871="" ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9871; // it's created for feature purpose, now leave it.
	 

		//9883
		
		public static boolean BPform_9883= false; // Best practice form or not?
		public static int NoOfTabs_9883 = 1; // No of Tabs
		public static int NoOfSections_9883 = 1; // No of sections in each tab
		public static boolean generateServiceSection_9883 = false; // generate Service Section
		public static int NoOfQuestions_9883 = 1; // No of Questions in each Section
		public static int NoOfLinkedQuest_9883 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9883 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9883 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9883[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9883;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9883; // If answer type is Multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9883[][] = {};
		public static String defaultVal_9883; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9883 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9883; // it's created for feature purpose, now leave it. 
		
		//TC9829
		 
		 
		 public static boolean BPform_TC9829 = true; // Best practice form or not?
		 public static int NoOfTabs_TC9829 = 4; // No of Tabs
		 public static int NoOfSections_TC9829 = 8; // No of sections in each tab
		 public static boolean generateServiceSection_TC9829 = false; // generate Service Section
		 public static int NoOfQuestions_TC9829 = 4; // No of Questions in each Section
		 public static int NoOfLinkedQuest_TC9829 = 0; // No of Linked Questions
		 public static int NoOfReqQuest_TC9829 = 0; // No of Mandatory fields Questions in Total questions 
		 public static int NoOfReadOnlyQuest_TC9829 = 0; // No of Read Only Questions in Total questions 
		 public static String ansType_TC9829[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		 public static String picklistVal_TC9829;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String MultiPickVal_TC9829; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String NamenValue_TC9829[][] = {{},{}}; // add picklist or multi-picklist options -- add name here
		         // // add picklist  or multi-picklist options -- add Value here
		 public static String defaultVal_TC9829; // Select default value for picklist and multi-picklist
		 public static String dependencyValue_TC9829 ;  // Select dependency value , It should be in NamenValue list
		 public static String newFeature_TC9829; // it's created for feature purpose, now leave it.
		 public static String formNames_TC9829[] = {"AutomationTestForm"+d}; //New Added
		
		
		//TC9826
		
		public static boolean BPform_9826 = true; // Best practice form or not?
		public static int NoOfTabs_9826 = 1; // No of Tabs
		public static int NoOfSections_9826 = 1; // No of sections in each tab
		public static boolean generateServiceSection_9826 = false; // generate Service Section
		public static int NoOfQuestions_9826 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_9826 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9826 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9826 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9826[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9826;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9826; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9826[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9826; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9826 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9826; // it's created for feature purpose, now leave it. 
		public static String formNames_9826[] = {"AutomationTestForm"+d}; //New Added
		
		//9828
		public static boolean BPform_9828 = true; // Best practice form or not?
		public static int NoOfTabs_9828 = 3; // No of Tabs
		public static int NoOfSections_9828 = 6; // No of sections in each tab
		public static boolean generateServiceSection_9828 = false; // generate Service Section
		public static int NoOfQuestions_9828 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_9828 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9828 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9828 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9828[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9828;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9828; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9828[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9828; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9828 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9828; // it's created for feature purpose, now leave it. 
		public static String formNames_9828[] = {"AutomationTestForm"+d}; //New Added
		
		//TC9846
		 
		 
		 public static boolean BPform_TC9846 = false; // Best practice form or not?
		 public static int NoOfTabs_TC9846 = 2; // No of Tabs
		 public static int NoOfSections_TC9846 = 4; // No of sections in each tab
		 public static boolean generateServiceSection_TC9846 = false; // generate Service Section
		 public static int NoOfQuestions_TC9846 = 4; // No of Questions in each Section
		 public static int NoOfLinkedQuest_TC9846 = 0; // No of Linked Questions
		 public static int NoOfReqQuest_TC9846 = 0; // No of Mandatory fields Questions in Total questions 
		 public static int NoOfReadOnlyQuest_TC9846 = 0; // No of Read Only Questions in Total questions 
		 public static String ansType_TC9846[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		 public static String picklistVal_TC9846;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String MultiPickVal_TC9846; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String NamenValue_TC9846[][] = {{}, // add picklist or multi-picklist options -- add name here
		        {}}; // // add picklist  or multi-picklist options -- add Value here
		 public static String defaultVal_TC9846; // Select default value for picklist and multi-picklist
		 public static String dependencyValue_TC9846 ;  // Select dependency value , It should be in NamenValue list
		 public static String newFeature_TC9846; // it's created for feature purpose, now leave it.
		 public static String formNames_TC9846[] =FormBuilderTestData.formName; //New Added
	
		 
		//TC9876
		 public static boolean BPform_TC9876 = false; // Best practice form or not?
		 public static int NoOfTabs_TC9876 = 1; // No of Tabs
		 public static int NoOfSections_TC9876 = 1; // No of sections in each tab
		 public static  boolean generateServiceSection_TC9876 = false; // generate Service Section
		 public static int NoOfQuestions_TC9876 = 5; // No of Questions in each Section
		 public static int NoOfLinkedQuest_TC9876 = 0; // No of Linked Questions
		 public static int NoOfReqQuest_TC9876 = 0; // No of Mandatory fields Questions in Total questions 
		 public static int NoOfReadOnlyQuest_TC9876 = 0; // No of Read Only Questions in Total questions 
		 public static String ansType_TC9876[] = {"number","radio","long text","upload","search"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		 public static String picklistVal_TC9876;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String MultiPickVal_TC9876; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String NamenValue_TC9876[][] = {{}, // add picklist or multi-picklist options -- add name here
		        {}}; // // add picklist  or multi-picklist options -- add Value here
		 public static String defaultVal_TC9876; // Select default value for picklist and multi-picklist
		 public static String dependencyValue_TC9876 ;  // Select dependency value , It should be in NamenValue list
		 public static String newFeature_TC9876; // it's created for feature purpose, now leave it.
		 public static String formNames_TC9876[] =FormBuilderTestData.formName; //New Ad
		 
		 
		//9871
		

		String requesterUserType = null;	

		public static boolean BPform_TC9871 = false; // Best practice form or not?
		public static int NoOfTabs_TC9871 = 1; // No of Tabs
		public static int NoOfSections_TC9871 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9871 = true; // generate Service Section
		public static int NoOfQuestions_TC9871 = 0; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9871 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9871 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9871 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9871[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9871;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9871; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9871[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9871; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9871 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9871; // it's created for feature purpose, now leave it.
		public static String formNames_TC9871[] =FormBuilderTestData.formName; //New Added

	//TC9884
		
		public static boolean BPform_TC9884 = true; // Best practice form or not?
		public static int NoOfTabs_TC9884 = 1; // No of Tabs
		public static int NoOfSections_TC9884 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9884 = false; // generate Service Section
		public static int NoOfQuestions_TC9884 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9884 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9884 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9884 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9884[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9884;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9884; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9884[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9884; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9884 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9884; // it's created for feature purpose, now leave it.
		
		public static String formNames_TC9884[] =FormBuilderTestData.formName; //New Added
		
		//Tc9885
		public static boolean BPform_TC9885 = false; // Best practice form or not?
		public static int NoOfTabs_TC9885 = 1; // No of Tabs
		public static int NoOfSections_TC9885 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9885 = false; // generate Service Section
		public static int NoOfQuestions_TC9885 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9885 = 2; // No of Linked Questions
		public static int NoOfReqQuest_TC9885 = 2; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9885 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9885[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9885;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9885; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9885[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9885; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9885 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9885; // it's created for feature purpose, now leave it.
		
		public static String formNames_TC9885[] =FormBuilderTestData.formName; //New Added


	//TC9890
		
		public static boolean BPform_TC9890 = false; // Best practice form or not?
		public static int NoOfTabs_TC9890 = 1; // No of Tabs
		public static int NoOfSections_TC9890 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9890 = false; // generate Service Section
		public static int NoOfQuestions_TC9890 = 20; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9890 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9890 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9890 = 5; // No of Read Only Questions in Total questions 
		public static String ansType_TC9890[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9890;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9890; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9890[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9890; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9890 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9890; // it's created for feature purpose, now leave it.
		public static String formNames_TC9890[] =FormBuilderTestData.formName; //New Added

	//TC9891
		public static  boolean BPform_TC9891= false; // Best practice form or not?
		public static  int NoOfTabs_TC9891 = 1; // No of Tabs
		public static  int NoOfSections_TC9891 = 1; // No of sections in each tab
		public static  boolean generateServiceSection_TC9891 = false; // generate Service Section
		public static  int NoOfQuestions_TC9891 = 1; // No of Questions in each Section
		public static  int NoOfLinkedQuest_TC9891 = 0; // No of Linked Questions
		public static  int NoOfReqQuest_TC9891 = 0; // No of Mandatory fields Questions in Total questions 
		public static  int NoOfReadOnlyQuest_TC9891 = 0; // No of Read Only Questions in Total questions 
		public static  String ansType_TC9891[] = {"multi-picklist"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static  String picklistVal_TC9891 ;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static  String MultiPickVal_TC9891; // If answer type is Multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		
		public static  String NamenValue_TC9891[][] = {{"Name1","Name2","Name3"},
								{"Value1","Value2","Value3"}	
								};
		public static  String defaultVal_TC9891 = "Value2";
		public static  String dependencyValue_TC9891 ;  // Select dependency value , It should be in NamenValue list
		public static  String newFeature_TC9891; // it's created for feature purpose, now leave it.
		public static  String formNames_TC9891[] =FormBuilderTestData.formName; //New Added

	//TC9892
		
		
		public static  boolean BPform_TC9892 = false; // Best practice form or not?
		public static int NoOfTabs_TC9892 = 1; // No of Tabs
		public static int NoOfSections_TC9892 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9892 = false; // generate Service Section
		public static int NoOfQuestions_TC9892 = 1; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9892 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9892 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9892 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9892[] = {"picklist"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9892 ;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9892 = "chemicals"; // If answer type is Multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		
		public static String NamenValue_TC9892[][] = {{"Name1","Name2","Name3"},
								{"Value1","Value2","Value3"}	
								};
		public static String defaultVal_TC9892 = "Value2";
		public static String dependencyValue_TC9892 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9892; // it's created for feature purpose, now leave it.
		public static  String formNames_TC9892[] =FormBuilderTestData.formName; //New Added


	//TC9878
		 	
		
		public static boolean BPform_TC9878 = false; // Best practice form or not?
		public static int NoOfTabs_TC9878 = 2; // No of Tabs
		public static int NoOfSections_TC9878 = 2; // No of sections in each tab
		public static boolean generateServiceSection_TC9878 = false; // generate Service Section
		public static int NoOfQuestions_TC9878 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9878 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9878 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9878 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9878[] = { "upload","search","radio","email address"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9878 = "boolean";  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9878= "chemicals"; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9878[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9878; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9878 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9878; // it's created for feature purpose, now leave it.
		public static  String formNames_TC9878[] =FormBuilderTestData.formName; //New Added
		
		
		//TC9879
		public static boolean BPform_TC9879 = false; // Best practice form or not?
		public static int NoOfTabs_TC9879 = 1; // No of Tabs
		public static int NoOfSections_TC9879 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9879 = false; // generate Service Section
		public static int NoOfQuestions_TC9879 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9879 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9879 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9879 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9879[] = { "upload","search","radio","email address"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9879 = "boolean";  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9879= "chemicals"; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9879[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9879; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9879 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9879; // it's created for feature purpose, now leave it.
		public static  String formNames_TC9879[] =FormBuilderTestData.formName; //New Added
		
		//TC9880
		
		public static boolean BPform_TC9880 = false; // Best practice form or not?
		public static int NoOfTabs_TC9880 = 1; // No of Tabs
		public static int NoOfSections_TC9880 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9880 = false; // generate Service Section
		public static int NoOfQuestions_TC9880 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9880 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9880 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9880 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9880[] = { "upload","search","multi-search","radio","email address"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9880 = "boolean";  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9880= "chemicals"; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9880[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9880; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9880 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9880; // it's created for feature purpose, now leave it.
		public static  String formNames_TC9880[] =FormBuilderTestData.formName; //New Added
		
		
		



	//TC9847

		public static boolean BPform_TC9847 = false; // Best practice form or not?
		public static int NoOfTabs_TC9847 = 3; // No of Tabs
		public static int NoOfSections_TC9847 = 6; // No of sections in each tab
		public static boolean generateServiceSection_TC9847 = false; // generate Service Section
		public static int NoOfQuestions_TC9847 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9847 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9847 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9847 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9847[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9847;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9847; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9847[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9847; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9847 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9847; // it's created for feature purpose, now leave it.
		public static  String formNames_TC9847[] =FormBuilderTestData.formName; //New Added

	//TC9872
		public static  boolean BPform_TC9872 = false; // Best practice form or not?
		public static  int NoOfTabs_TC9872 = 1; // No of Tabs
		public static  int NoOfSections_TC9872 = 1; // No of sections in each tab
		public static  boolean generateServiceSection_TC9872 = false; // generate Service Section
		public static  int NoOfQuestions_TC9872 = 5; // No of Questions in each Section
		public static  int NoOfLinkedQuest_TC9872 = 0; // No of Linked Questions
		public static  int NoOfReqQuest_TC9872 = 0; // No of Mandatory fields Questions in Total questions 
		public static  int NoOfReadOnlyQuest_TC9872 = 0; // No of Read Only Questions in Total questions 
		public static  String ansType_TC9872[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static  String picklistVal_TC9872; // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static  String MultiPickVal_TC9872; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static  String NamenValue_TC9872[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static  String defaultVal_TC9872; // Select default value for picklist and multi-picklist
		public static  String dependencyValue_TC9872 ;  // Select dependency value , It should be in NamenValue list
		public static  String newFeature_TC9872; // it's created for feature purpose, now leave it.
		public static  String formNames_TC9872[] =FormBuilderTestData.formName; //New Added

		
		//TC9886
		public static boolean BPform_TC9886 = false; // Best practice form or not?
		public static int NoOfTabs_TC9886 = 2; // No of Tabs
		public static int NoOfSections_TC9886 = 4; // No of sections in each tab
		public static boolean generateServiceSection_TC9886 = false; // generate Service Section
		public static int NoOfQuestions_TC9886 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9886 = 4; // No of Linked Questions
		public static int NoOfReqQuest_TC9886 = 2; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9886 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9886[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9886;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9886; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9886[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9886; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9886 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9886; // it's created for feature purpose, now leave it.
		public static String formNames_TC9886[] =FormBuilderTestData.formName; //New Added

		//TC9887
		public static boolean BPform_TC9887 = false; // Best practice form or not?
		public static int NoOfTabs_TC9887 = 4; // No of Tabs
		public static int NoOfSections_TC9887 = 4; // No of sections in each tab
		public static boolean generateServiceSection_TC9887 = false; // generate Service Section
		public static int NoOfQuestions_TC9887 = 3; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9887 = 4; // No of Linked Questions
		public static int NoOfReqQuest_TC9887 = 2; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9887 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9887[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9887;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9887; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9887[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9887; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9887 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9887; // it's created for feature purpose, now leave it.
		public static String formNames_TC9887[] =FormBuilderTestData.formName;
		
		//TC9888
		public static boolean BPform_TC9888 = false; // Best practice form or not?
		public static int NoOfTabs_TC9888 = 6; // No of Tabs
		public static int NoOfSections_TC9888 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9888 = false; // generate Service Section
		public static int NoOfQuestions_TC9888 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9888 = 2; // No of Linked Questions
		public static int NoOfReqQuest_TC9888 = 2; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9888 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9888[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9888;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9888; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9888[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9888; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9888 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9888; // it's created for feature purpose, now leave it.
		public static String formNames_TC9888[] =FormBuilderTestData.formName;
		//TC9832
		public static boolean BPform_TC9832 = true; // Best practice form or not?
		public static int NoOfTabs_TC9832 = 1; // No of Tabs
		public static int NoOfSections_TC9832 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9832 = false; // generate Service Section
		public static int NoOfQuestions_TC9832 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9832 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9832 = 4; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9832 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9832[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9832;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9832; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9832[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9832; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9832 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9832; // it's created for feature purpose, now leave it.
		public static String formNames_TC9832[] =FormBuilderTestData.formName; //New Added
		
		
		//TC9903
		public static boolean BPform_TC9903 = true; // Best practice form or not?
		public static int NoOfTabs_TC9903 = 1; // No of Tabs
		public static int NoOfSections_TC9903 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9903 = true; // generate Service Section
		public static int NoOfQuestions_TC9903 = 0; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9903 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9903 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9903 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9903[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9903;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9903; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9903[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9903; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9903 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9903; // it's created for feature purpose, now leave it.
		public static String formNames_TC9903[] =FormBuilderTestData.formName; //New Added
		
		//TC9908
		public static boolean BPform_TC9908 = true; // Best practice form or not?
		public static int NoOfTabs_TC9908 = 1; // No of Tabs
		public static int NoOfSections_TC9908 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9908 = false; // generate Service Section
		public static int NoOfQuestions_TC9908 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9908 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9908 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9908 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9908[] = {"text","checkbox", "date", "datetime","radio"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9908= "chemicals";  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9908 ="boolean"; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9908[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9908; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9908 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9908; // it's created for feature purpose, now leave it.
		public static String formNames_TC9908[] =FormBuilderTestData.formName; //New Added
		
		//TC9909
		public static boolean BPform_TC9909 = true; // Best practice form or not?
		public static int NoOfTabs_TC9909 = 2; // No of Tabs
		public static int NoOfSections_TC9909 = 1; // No of sections in each tab
		public static  boolean generateServiceSection_TC9909 = false; // generate Service Section
		public static int NoOfQuestions_TC9909 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9909 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9909 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9909 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9909[] = {"number","picklist","long text","upload","search"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9909= "chemicals";  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9909 ="boolean"; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9909[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9909; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9909 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9909; // it's created for feature purpose, now leave it.
		public static String formNames_TC9909[] =FormBuilderTestData.formName; //New Ad
	//TC9910
			

		public static boolean BPform_TC9910 = true; // Best practice form or not?
		public static int NoOfTabs_TC9910 = 1; // No of Tabs
		public static int NoOfSections_TC9910 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9910 = false; // generate Service Section
		public static int NoOfQuestions_TC9910 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9910 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9910 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9910 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9910[] = {"upload","search","multi-search","radio","email address"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9910;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9910; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9910[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9910; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9910 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9910; // it's created for feature purpose, now leave it.
		public static String formNames_TC9910[] =FormBuilderTestData.formName; //New Ad


	//TC9912
		public static boolean BPform_TC9912 = true; // Best practice form or not?
		public static int NoOfTabs_TC9912 = 1; // No of Tabs
		public static int NoOfSections_TC9912 = 2; // No of sections in each tab
		public static boolean generateServiceSection_TC9912 = false; // generate Service Section
		public static int NoOfQuestions_TC9912 = 10; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9912 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9912 = 10; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9912 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9912[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9912;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9912; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9912[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9912; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9912 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9912; // it's created for feature purpose, now leave it.
		public static String formNames_TC9912[] =FormBuilderTestData.formName; //New Ad	

	//TC9913
		public static boolean BPform_TC9913 = false; // Best practice form or not?
		public static int NoOfTabs_TC9913 = 1; // No of Tabs
		public static int NoOfSections_TC9913 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9913 = false; // generate Service Section
		public static int NoOfQuestions_TC9913 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9913 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC9913 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9913 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC9913[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9913;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9913; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9913[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9913; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9913 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9913; // it's created for feature purpose, now leave it. 
		public static String formNames_TC9913[] =FormBuilderTestData.formName; //New Ad

	//TC10855
		public static boolean BPform_TC10855 = false; // Best practice form or not?
		public static int NoOfTabs_TC10855 = 1; // No of Tabs
		public static int NoOfSections_TC10855 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC10855 = false; // generate Service Section
		public static int NoOfQuestions_TC10855 = 3; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC10855 = 0; // No of Linked Questions
		public static int NoOfReqQuest_TC10855 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC10855 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_TC10855[] = {"picklist","text","checkbox"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC10855;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC10855; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC10855[][] = {{"Name1","Name2","Name3"}, // add picklist or multi-picklist options -- add name here
								 {"Value1","Value2","Value3"}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC10855; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC10855 = "Value2" ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC10855; // it's created for feature purpose, now leave it. 
		public static String formNames_TC10855[] =FormBuilderTestData.formName; //New Ad
		
		//Tc9672
		public static boolean BPform_TC9672 = true; // Best practice form or not?
		public static int NoOfTabs_TC9672 = 1; // No of Tabs
		public static int NoOfSections_TC9672 = 1; // No of sections in each tab
		public static boolean generateServiceSection_TC9672 = false; // generate Service Section
		public static int NoOfQuestions_TC9672 = 2; // No of Questions in each Section
		public static int NoOfLinkedQuest_TC9672 = 1; // No of Linked Questions
		public static int NoOfReqQuest_TC9672 = 1 ;// No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_TC9672 = 1; // No of Read Only Questions in Total questions 
		public static String ansType_TC9672[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_TC9672;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_TC9672; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_TC9672[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_TC9672; // Select default value for picklist and multi-picklist
		public static String dependencyValue_TC9672 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_TC9672; // it's created for feature purpose, now leave it. 
		public static String formNames_TC9672[] =FormBuilderTestData.formName; //New Ad
		
		
	
		
		
		//9830
		
		public static boolean BPform_9830= false; // Best practice form or not?
		public static int NoOfTabs_9830 = 5; // No of Tabs
		public static int NoOfSections_9830 = 10; // No of sections in each tab
		public static boolean generateServiceSection_9830 = false; // generate Service Section
		public static int NoOfQuestions_9830 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_9830 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9830 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9830 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9830[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9830;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9830; // If answer type is Multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9830[][] = {};
		public static String defaultVal_9830; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9830 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9830; // it's created for feature purpose, now leave it. 
		
		//9881
		
		public static boolean BPform_9881= false; // Best practice form or not?
		public static int NoOfTabs_9881 = 5; // No of Tabs
		public static int NoOfSections_9881 = 10; // No of sections in each tab
		public static boolean generateServiceSection_9881 = false; // generate Service Section
		public static int NoOfQuestions_9881 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_9881 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9881 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9881 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9881[] = {"upload","search","multi-search","radio","email address"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9881;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9881; // If answer type is Multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9881[][] = {};
		public static String defaultVal_9881; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9881 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9881; // it's created for feature purpose, now leave it. 
		//9877
		public static boolean BPform_9877= false; // Best practice form or not?
		public static int NoOfTabs_9877 = 1; // No of Tabs
		public static int NoOfSections_9877 = 1; // No of sections in each tab
		public static boolean generateServiceSection_9877 = false; // generate Service Section
		public static int NoOfQuestions_9877 = 5; // No of Questions in each Section
		public static int NoOfLinkedQuest_9877 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9877 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9877 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9877[] = {"upload","search","radio","email address"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9877;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9877; // If answer type is Multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9877[][] = {};
		public static String defaultVal_9877; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9877 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9877; // it's created for feature purpose, now leave it. 
		
		public static boolean BPform_9834 = true; // Best practice form or not?
		public static int NoOfTabs_9834 = 4; // No of Tabs
		public static int NoOfSections_9834 =16 ; // No of sections in each tab
		public static boolean generateServiceSection_9834 = false; // generate Service Section
		public static int NoOfQuestions_9834 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_9834 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9834 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9834 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9834[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9834;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9834; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9834[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9834; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9834 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9834; // it's created for feature purpose, now leave it. 
		public static String formNames_9834[] = {"AutomationTestForm"+d}; //New Added
		
		//9842
		
		public static boolean BPform_9842 = true; // Best practice form or not?
		public static int NoOfTabs_9842 = 5; // No of Tabs
		public static int NoOfSections_9842 = 5; // No of sections in each tab
		public static boolean generateServiceSection_9842 = false; // generate Service Section
		public static int NoOfQuestions_9842 = 18; // No of Questions in each Section
		public static int NoOfLinkedQuest_9842 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9842 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9842 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9842[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9842;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9842; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9842[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9842; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9842 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9842; // it's created for feature purpose, now leave it. 
		public static String formNames_9842[] = {"AutomationTestForm"+d}; //New Added
		
		
		//9845
		
		public static boolean BPform_9845 = true; // Best practice form or not?
		public static int NoOfTabs_9845 = 1; // No of Tabs
		public static int NoOfSections_9845 = 1; // No of sections in each tab
		public static boolean generateServiceSection_9845 = false; // generate Service Section
		public static int NoOfQuestions_9845 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_9845 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9845 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9845 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9845[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9845;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9845; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9845[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9845; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9845 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9845; // it's created for feature purpose, now leave it. 
		public static String formNames_9845[] = {"AutomationTestForm"+d}; //New Added
		
		
		//9848
		public static boolean BPform_9848 = true; // Best practice form or not?
		public static int NoOfTabs_9848 = 10; // No of Tabs
		public static int NoOfSections_9848 = 20; // No of sections in each tab
		public static boolean generateServiceSection_9848 = false; // generate Service Section
		public static int NoOfQuestions_9848 = 4; // No of Questions in each Section
		public static int NoOfLinkedQuest_9848 = 0; // No of Linked Questions
		public static int NoOfReqQuest_9848 = 0; // No of Mandatory fields Questions in Total questions 
		public static int NoOfReadOnlyQuest_9848 = 0; // No of Read Only Questions in Total questions 
		public static String ansType_9848[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		public static String picklistVal_9848;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String MultiPickVal_9848; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		public static String NamenValue_9848[][] = {{}, // add picklist or multi-picklist options -- add name here
								 {}}; // // add picklist  or multi-picklist options -- add Value here
		public static String defaultVal_9848; // Select default value for picklist and multi-picklist
		public static String dependencyValue_9848 ;  // Select dependency value , It should be in NamenValue list
		public static String newFeature_9848; // it's created for feature purpose, now leave it. 
		public static String formNames_9848[] = {"AutomationTestForm"+d}; //New Added
		
		//TC9845
		 public static boolean BPform_TC9845 = false; // Best practice form or not?
		 public static int NoOfTabs_TC9845 = 1; // No of Tabs
		 public static int NoOfSections_TC9845 = 1; // No of sections in each tab
		 public static boolean generateServiceSection_TC9845 = false; // generate Service Section
		 public static int NoOfQuestions_TC9845 = 1; // No of Questions in each Section
		 public static int NoOfLinkedQuest_TC9845 = 0; // No of Linked Questions
		 public static int NoOfReqQuest_TC9845 = 0; // No of Mandatory fields Questions in Total questions 
		 public static int NoOfReadOnlyQuest_TC9845 = 0; // No of Read Only Questions in Total questions 
		 public static String ansType_TC9845[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
		 public static String picklistVal_TC9845;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String MultiPickVal_TC9845; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
		 public static String NamenValue_TC9845[][] = {{}, // add picklist or multi-picklist options -- add name here
		        {}}; // // add picklist  or multi-picklist options -- add Value here
		 public static String defaultVal_TC9845; // Select default value for picklist and multi-picklist
		 public static String dependencyValue_TC9845 ;  // Select dependency value , It should be in NamenValue list
		 public static String newFeature_TC9845; // it's created for feature purpose, now leave it.
		 public static String formNames_TC9845[] =FormBuilderTestData.formName; //New Added
		 
		 
//TC9733
		 public static boolean BPform_TC9733 = false; // Best practice form or not?
			public static int NoOfTabs_TC9733 = 1; // No of Tabs
			public static int NoOfSections_TC9733 = 1; // No of sections in each tab
			public static boolean generateServiceSection_TC9733 = false; // generate Service Section
			public static int NoOfQuestions_TC9733 = 1; // No of Questions in each Section
			public static int NoOfLinkedQuest_TC9733 = 0; // No of Linked Questions
			public static int NoOfReqQuest_TC9733 = 0; // No of Mandatory fields Questions in Total questions 
			public static int NoOfReadOnlyQuest_TC9733 = 0; // No of Read Only Questions in Total questions 
			public static String ansType_TC9733[] = {"text"}; // for different answer type, available types text,checkbox, date, datetime,multi-picklist, number,picklist,long text,upload,search,multi-search,radio,email address
			public static String picklistVal_TC9733;  // If answer type is picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
			public static String MultiPickVal_TC9733; // If answer type is multi-picklist then set values available types boolean,chemicals,countries,currencies,ingredients,microbiological,months
			public static String NamenValue_TC9733[][] = {{},{}}; // add picklist or multi-picklist options -- add name here
									  // // add picklist  or multi-picklist options -- add Value here
			public static String defaultVal_TC9733; // Select default value for picklist and multi-picklist
			public static String dependencyValue_TC9733 ;  // Select dependency value , It should be in NamenValue list
			public static String newFeature_TC9733; // it's created for feature purpose, now leave it.
			public static String formNames_TC9733[] = {"AutomationTestForm"+d}; //New Added
	
}
