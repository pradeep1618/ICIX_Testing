package icix.TestData;


import java.util.Date;

public class TPGroupComplianceTestData {

	static Date d = new Date(System.currentTimeMillis());
	
	
	public static String TC10758tpgName = "No Same requirement 2times" +d; 
	//public static String TC10758tpgTags[] = { "High Risk"}; // Tag Names  for KLRespStg@icix.com
	public static String TC10758tpgStatus[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String TC10758tpgType[] = {}; // tpg Relationship types
	//public static String formNames[]={"Automation"};
	public static String tpgTags_10758[] = { "Organic" };
	public static String saveOrSend_TC10758  = "btnSend";

	public static String requestType_TC10758[] = { "All" };
	
	//public static String containerName= "AutomationForm"+d;
	public static String tpgTags[] = {"Organic"};
	//Test data for TC9672
	public static String FormName_TC9672 = "BSE Statement";
	public static String[] formNames_TC9672 = {"Testing-Tr"};
	public static String RequestName_TC9672 = "AutoTest"+ d;
	public static boolean selectTP_TC9672 = true;
	public static String TradingPartnerName_TC9672 = "Day-Based QA Testing 02 SD"; //"sdd3v06";
	public static String ProductName_TC9672 = null;
	public static String DocumentName_TC9672 = "Dev PKG 02";
	public static String SendRequestComments_TC9672 = "Test comment";
	public static String ContainerName_TC9672 = "Testcontainer";
	public static String AttentionComments_TC9672 = "Request is sent..";
	public static String TestingFacility_TC9672 = null;

	//Test data for TC9666
	public static String tpgName_TC9666 = "VerifySendRequirement " +d; // Trading partner Group Name
	public static String tpgTags_TC9666[] = {"Organic"};  // Tag Names (New1) // Tag Names  for r3lqa03rk@icix.com
	public static String tpgStatus_TC9666[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC9666[] = {}; // tpg Relationship types
	public static String requestType_TC9666[] = {"All"};
	public static String saveOrSend_TC9666  = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	public static String searchKeyWord_TC9666 ="Automation";

	//Test data for TC10752
	public static String tpgName_TC10752 = "VerifySendReqAtRespSide " + d; // Trading partner Group Name
	public static String tpgTags_TC10752[] = {"Organic"};  // Tag Names
	public static String tpgStatus_TC10752[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10752[] = {}; // tpg Relationship types
	public static String requestType_TC10752[] = {"All"};
	public static String saveOrSend_TC10752  = "btnSend"; // save or send reqs, supported values are btnSave and btnSend 
	public static String tabName_TC10752 = "Requests";
	//public static String formNames_TC10752[]= {"Automation"};
	public static String searchKeyWord_TC10752 = FormBuilderTestData.containerName; //Should be same as formName



	//Test data for TC10753

	public static String tpgName_TC10753 = "reqGetsClosedAfterRemovingReq" +d; // Trading partner Group Name
	public static String tpgTags_TC10753[] = {"Organic"};  // Tag Names

	public static String tpgStatus_TC10753[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10753[] = {}; // tpg Relationship types

	public static String requestType_TC10753[] = {"All"};	
	//public static String btnClick = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	public static String tabName_TC10753 = "Workflows"; // on which object you want to search 
	public static boolean removeReqs_TC10753 = true; // remove requirements or not?
	public static String reqStatus_TC10753 = "Cancelled";
	// In Package 2.34 Workflow Status not geting Closed it still 'Open'
	public static String wfStatus_TC10753 = "Closed"; // Workflow status, supported values are Closed, Open.
	// Request Status , Supported values are New,Approved, Rejected, Cancelled etc..
	public static String saveOrSend_TC10753  = "btnSend";
	public static String formNames_TC10753[]={"Automation"};
	public static String searchKeyWord_TC10753 =FormBuilderTestData.containerName; // Requirement name or form name 


	//Test data for TC10759
	public static String tpgName_TC10759 = "SendReqToActiveStatusTPG" + d;
	public static String tpgTags_TC10759[] = {};  
	public static String tpgStatus_TC10759[]= {"Active"};
	public static String tpgType_TC10759[] = {}; 
	public static String requestType_TC10759[] = {"All"};
	public static String saveOrSend_TC10759 = "btnSend"; 
	//public static String formNames_TC10759[]={"Automation"};



	//Test data for TC10760

	public static String tpgName_TC10760 = "SendReqToInActiveStatusTPG" +d; // Trading partner Group Name
	public static String tpgTags_TC10760[] = {};  // Tag Names
	public static String tpgStatus_TC10760[]= {"Inactive"}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10760[] = {}; // tpg Relationship types
	public static String requestType_TC10760[] = {"All"};
	public static String saveOrSend_TC10760 = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	//public static String formNames =FormRepo.container_Name+date;


	//Test data for TC10761

	public static String tpgName_TC10761 = "SendReqToPendingStatusTPG" +d; // Trading partner Group Name
	public static String tpgTags_TC10761[] = {};  // Tag Names
	public static String tpgStatus_TC10761[]= {"Pending"}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10761[] = {}; // tpg Relationship types
	public static String requestType_TC10761[] = {"All"};
	public static String saveOrSend_TC10761 = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	//String formNames_TC10761[]={"Automation"};
	public static String tabName_TC10761 = "Trading Partner Groups"; // on which object you want to search








	//Test data for TC10771


	public static	String tpgName_TC10771 = "uneffectRemovingReqFromgroup1" + d; // Trading partner

	public static String tpgTags_TC10771[] = {"312"}; // Tag Names
	public static String tpgStatus_TC10771[] = {}; // tpg Status, supported values are
	// Active,Inactive,Pending and Suspended
	public static String tpgType_TC10771[] = {}; // tpg Relationship types

	public static String tpgName2_TC10771 = "uneffectRemovingReqFromgroup2" + d; // Trading partner

	public static String tpgTags2_TC10771[] = {"GFSI Certified"}; // Tag Names
	public static String tpgStatus2_TC10771[] = {}; // tpg Status, supported values are
	// Active,Inactive,Pending and Suspended
	public static String tpgType2_TC10771[] = {}; // tpg Relationship types

	public static String requestType_TC10771[] = { "All" };// Request type, supported values are All,
	// Audit, Product Spec, Form,Incident,
	// Partnership, Document

	public static String saveOrSend_TC10771 = "btnSend"; // save or send reqs, supported values are
	// btnSave and btnSend

	public static String tabName_TC10771 = "Workflows"; // on which object you want to search

	public static boolean removeReqs_TC10771 = true; // remove requirements or not?
	/*
	public static String reqStatus_TC10771 = "Open"; // Request Status , Supported values are

	public static String wfStatus_TC10771 = "Submitted by Requestor"; // Workflow status, supported
	 */
	public static String reqStatus_TC10771 = "Submitted by Requestor"; // Request Status , Supported values are

	public static String wfStatus_TC10771 = "Open";
	//	public static String[] formNames_TC10771 = {"Automation"};
	public static String searchKeyWord_TC10771 = FormBuilderTestData.containerName; // Requirement
	//public static int assertReqsSize_TC10771 = formNames.length; // No of Requirements for
	// Assert. i.e No of forms




	//Test data for TC10773

	public static String tpgName_TC10773 = "RemoveMemberFromGroup" + d; // Trading partner Group

	public static String tpgTags_TC10773[] = { "Organic" }; // Tag Names
	public static String tpgStatus_TC10773[] = {}; // tpg Status, supported values are

	public static String tpgType_TC10773[] = {}; // tpg Relationship types

	public static String requestType_TC10773[] = { "All" };// Request type, supported values are All,

	public static String saveOrSend_TC10773 = "btnSend"; // save or send reqs, supported values are
	// btnSave and btnSend

	public static String tabName_TC10773 = "Workflows"; // on which object you want to search

	//	public static String wfStatus_TC10773 = "Closed"; // Workflow status, supported values are Closed,
	//	public static String reqStatus_TC10773 = "Cancelled"; // Request Status , Supported values are
	// New,Approved, Rejected, Cancelled etc..
	public static String wfStatus_TC10773 = "Open"; // Workflow status, supported values are Closed,
	public static String reqStatus_TC10773 = "Cancelled";
	public static String editTags_TC10773[] = { "Organic", "NewTag" }; // Tpg tags for editing tpg
	//  public static String formNames[] = {"Automation"};
	public static String searchKeyWord_TC10773 = FormBuilderTestData.containerName; // Requirement




	//Test data for TC10774


	public static	String tpgName__TC10774 = "removeMemberWhichExistsInMultipleGroup1" + d; // Trading

	public static String tpgTags_TC10774[] = { "Organic" }; // Tag Names
	public static String tpgStatus_TC10774[] = {}; // tpg Status, supported values are
	// Active,Inactive,Pending and Suspended
	public static String tpgType_TC10774[] = {}; // tpg Relationship types

	public static String requestType_TC10774[] = { "All" };// Request type, supported values are All,

	public static String saveOrSend_TC10774 = "btnSend"; // save or send reqs, supported values are
	// btnSave and btnSend
	public static String tabName_TC10774 = "Requests"; // on which object you want to search

	public static String tpgName2_TC10774 = "removeMemberWhichExistsInMultipleGroup1" + d; // Trading
	// partner
	// Group
	// Name
	public static String tpgTags2_TC10774[] = { "Kosher" }; // Tag Names
	public static String tpgStatus2_TC10774[] = {}; // tpg Status, supported values are
	// Active,Inactive,Pending and Suspended
	public static String tpgType2_TC10774[] = {}; // tpg Relationship types

	public static String editTags_TC10774[] = { "Organic", "Kosher" }; // Tpg tags for editing
	// tpg

	public static String formNames_TC10774[] = {"Automation"};

	public static String reqStatus_TC10774 = "Open"; // Request Status , Supported values are
	// New,Approved, Rejected, Cancelled etc..
	public static String wfStatus_TC10774 = "Submitted by Requestor"; // Workflow status, supported
	// values are Closed, Open.
	public static String searchKeyWord_TC10774 = FormBuilderTestData.containerName; // Requirement



	//*********================  TC10806 =========== ****************


	public static String tpgName_TC10806 = "RemoveMemberApprovedReqReadd"+d; // Trading partner Group Name
	public static String tpgTags_TC10806[] = {"Organic"};  // Tag Names
	public static String tpgStatus_TC10806[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10806[] = {}; // tpg Relationship types
	public static String requestType_TC10806[] = {"All"};
	public static String btnClick_TC10806 = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	public static String tabName_TC10806 = "Workflows"; // on which object you want to search 
	public static String tabName1_TC10806 = "Trading Partner Groups"; // on which object you want to search 
	public static String searchKeyWord1_TC10806 =tpgName_TC10806;// name of the record
	public static String tabName2_TC10806 = "Workflows"; // on which object you want to search 
	public static boolean removeReqs_TC10806 = true; // remove requirements or not?
	public static String wfStatus_TC10806 = "Closed"; // Workflow status, supported values are Closed, Open.
	public static String reqStatus_TC10806 = "Approved"; // Request Status , Supported values are New,Approved, Rejected, Cancelled etc..
	public static String saveOrSend_TC10806 = "btnSend";
	public static String approveOrReject_TC10806 = "Approve"; // Approve or Reject request, supported values are Approve and Reject
	public static String editTags_TC10806[] = {"Organic"}; // Tpg tags for editing tpg
	//public static String TC10806formNames[] = { "Automation" };
	public static String searchKeyWord_TC10806 = FormBuilderTestData.containerName; // Requirement
	//	public static String editTags_TC10806[] = { "Organic", "Single Source" }; // Tpg tags for editing




	//*********================  TC10813 =========== ****************

	public static String tpgName_TC10813 = "RemoveReqAfterRespSubmitted"+d;
	public static String tpgTags_TC10813[] = {"Organic"};  
	public static String tpgStatus_TC10813[]= {}; 
	public static String tpgType_TC10813[] = {}; 
	public static String requestType_TC10813[] = {"All"};
	public static String saveOrSend_TC10813 = "btnSend"; 
	public static String tabName_TC10813 = "Workflows";
	public static String tabName1_TC10813 = "Trading Partner Groups"; 
	public static String searchKeyWord1_TC10813 =tpgName_TC10813;
	public static String tabName2_TC10813 = "Workflows"; 
	public static boolean removeReqs_TC10813 = true; 
	public static String wfStatus_TC10813 = "Open"; 
	public static String reqStatus_TC10813 = "Submitted by Requestor"; 
	public static String approveOrReject_TC10813 = "Reject"; 
	public static String formNames_TC10813[] = { "Automation" };
	public static String searchKeyWord_TC10813 =FormBuilderTestData.containerName; 



	//Test data for TC10814

	public static String tpgName_TC10814 = "RemoveRejectedMemberThenAddSameMember"+d; // Trading partner Group Name
	public static String tpgTags_TC10814[] = {"Organic"};  // Tag Names
	public static String tpgStatus_TC10814[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10814[] = {}; // tpg Relationship types
	public static String requestType_TC10814[] = {"All"};
	public static String btnClick_TC10814 = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	public static String tabNameForGlobalSearch_TC10814 = "Requests";
	public static String tabName_TC10814 = "Workflows"; // on which object you want to search 
	public static String searchKeyWord__TC10814=FormBuilderTestData.containerName;
	public static String tabName1_TC10814 = "Trading Partner Groups"; // on which object you want to search 
	public static String searchKeyWord1_TC10814 =tpgName_TC10814;// name of the record
	public static String tabName2_TC10814 = "Workflows"; // on which object you want to search 
	public static boolean removeReqs_TC10814 = true; // remove requirements or not?
	public static String wfStatus_TC10814 = "Open"; // Workflow status, supported values are Closed, Open.
	public static String reqStatus_TC10814 = "Submitted by Requestor"; // Request Status , Supported values are New,Approved, Rejected, Cancelled etc..
	public static String saveOrSend_TC10814 = "btnSend";
	public static String approveOrReject_TC10814 = "Reject"; // Approve or Reject request, supported values are Approve and Reject
	//String editTags[] = {"Organic"}; // Tpg tags for editing tpg
	public static String editTags_TC10814[] = { "Organic", "312" }; // Tpg tags for editing tpg
	//public static String formNames_TC10814[] = {"Automation"};
	//public static String searchKeyWord_TC10814 = "Automation"; // Requirement



	//*********================  TC10808 =========== ****************

	public static String tpgName_TC10808 = "SendSameReqDifferentTpg1" +d; // Trading partner Group Name
	public static String tpgTags_TC10808[] = {"Organic" };  // Tag Names
	public static String tpgStatus_TC10808[]= {}; // tpg Status
	public static String tpgType_TC10808[] = {}; // tpg Relationship types

	public static String tpgName2_TC10808 = "SendSameReqDifferentTpg2" +d;
	public static String tpgTags2_TC10808[] = {"Single Source" };  // Tag Names

	public static String requestType_TC10808[] = {"All"};
	public static String saveOrSend_TC10808 = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	public static String formNames_TC10808[] = null;
	//public static String searchKeyWord_TC10808 = "Automation"; // Requirement
	//Test data for TC10799
	public static String tpgName_TC10799 = "AutoReqCreationAddTP " + d; // Trading partner Group Name
	public static String tpgTags_TC10799[] = {"Kosher"};  // Tag Names
	public static String tpgStatus_TC10799[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10799[] = {}; // tpg Relationship types
	public static String requestType_TC10799[] = {"All"};
	public static String saveOrSend_TC10799  = "btnSave"; // save or send reqs, supported values are btnSave and btnSend
	public static String tabName_TC10799 = "Requests"; // on which object you want to search 
	public static String wfStatus_TC10799 = "Open"; // Workflow status, supported values are Closed, Open.
	public static String ReqStatus_TC10799 = "New"; // Request Status , Supported values are New,Approved, Rejected, Cancelled etc..
	public static String editTags_TC10799[] = {"Kosher","Organic"}; // Tpg tags for editing tpg
	public static String formNames_TC10799[] = { "Automation" };
	public static String searchKeyWord_TC10799 = "Automation"; // Requirement
	
	
	//Test data for TC9666
	public static String tpgName = "VerifySendRequirement " +d; // Trading partner Group Name
	 
	public static String tpgStatus[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType[] = {}; // tpg Relationship types
	public static String requestType[] = {"All"};
	public static String saveOrSend  = "btnSend"; // save or send reqs, supported values are btnSave and btnSend
	public static String searchKeyWord ="Automation";

}
