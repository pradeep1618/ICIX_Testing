package icix.TestData;

import java.util.Date;

public class TPGroupTestData {

	static Date d = new Date(System.currentTimeMillis());
	public static String containerName= "AutomationForm"+d;
	//Test data for TC10460
	public static String tpgName_TC10460 = "Tags Only TPG" + d; // Trading partner Group Name
	public static String tpgTags_TC10460[] = { "Organic"};  // Tag Names
	public static String tpgStatus_TC10460[]= {}; // tpg Status
	public static String tpgType_TC10460[] = {}; 
	
	//Test data for TC10462
	
	public static String tpgName_TC10462 = "Relationship Status Only " + d; // Trading partner Group Name
	public static String tpgTags_TC10462[] = {};  // Tag Names
	public static String tpgStatus_TC10462[]= {}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10462[] = {"Agent","Broker"}; // tpg Relationship types
	
	
	//Test data for TC10467
	public static String tpgName_TC10467 = "TPG_tag_status_and_Type " + d; // Trading partner Group Name
	public static String tpgTags_TC10467[] = {"Organic"};  // Tag Names
	public static String tpgStatus_TC10467[]= {"Active"}; // tpg Status, supported values are Active,Inactive,Pending and Suspended
	public static String tpgType_TC10467[] = {"Agent","Broker"}; // tpg Relationship types
	
	
}
