import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class masterFeatures {
static String dw;
static String dc;
static String scratchSave;
static String previousState;
static String Acode;
static String wsName;
static String tc; 
static String tcSpiraId;
static String pXMLURL;

public static void getRestore(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2) throws Exception{
	//14G. getRestore	
	String acode,lanCode,showDelta,submitType,transactionId,scratchSaveString,getSaveXML;
	String urlParametersString;
	wsName="getRestore";
	LoadWebServiceChryslerCA getRestore = new LoadWebServiceChryslerCA();
	getRestore.SetFolderName(dwc);
	getRestore.dataDir=getRestore.GetFolderName();
	getRestore.SetFolderName(env1);
	getRestore.firstEnvName=getRestore.GetFolderName();
	getRestore.SetFolderName(env2);
	getRestore.secondEnvName=getRestore.GetFolderName();
	tc="14G_1";
	tcSpiraId="TC098082";
	//This API used to be done by QTP script
	
	acode="CAC50DOS041B2";
	lanCode="EN";
	showDelta="N";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";

	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
//	Passed above. Failed to match manual test below with scratchSave. Haven't figured out why???
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
//	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&submitType="+submitType+"&data="+getSaveXML;

	//	System.out.println(getRestore.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
	
	
	tc="2";
	tcSpiraId="TC098083";
	acode="CAC50DOS041B2";
	lanCode="FR";
	showDelta="N";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";
	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
	
	tc="3";
	tcSpiraId="TC098084";
	acode="CAC60RMT111B2";
	lanCode="EN";
	showDelta="Y";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";
	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
	
	tc="4";
	tcSpiraId="TC098085";
	acode="CAC60RMT111B2";
	lanCode="FR";
	showDelta="Y";
	submitType="POST";
	transactionId="";
	scratchSaveString="";
	getSaveXML="";
	scratchSaveString=getRestore.getScratchFromConfigVehicle(qaOnePrefix, acode, "false", "false", "", "", "", "", "", "", "", "", "1");
	getSaveXML=getRestore.getXMLFromGetSaveXML(qaOnePrefix, lanCode, acode, "", scratchSaveString, transactionId);	
	pXMLURL="getrestore.xml";
	urlParametersString="acode="+acode+"&language="+lanCode+"&showdelta="+showDelta+"&transactionId="+transactionId+"&data="+getSaveXML+"&submitType="+submitType;
	System.out.println(tcSpiraId+" Please Wait...getRestore");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	getRestore.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	getRestore.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	getRestore.compare(wsName,true);	
}
public static void daaSearchNewInventory(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2) throws Exception{

	//34. daaSearchNewInventory	
	String urlParametersString;
	wsName="daaSearchNewInventory";
	LoadWebServiceChryslerCA daaSearchNewInventory = new LoadWebServiceChryslerCA();
	daaSearchNewInventory.SetFolderName(dwc);
	daaSearchNewInventory.dataDir=daaSearchNewInventory.GetFolderName();
	daaSearchNewInventory.SetFolderName(env1);
	daaSearchNewInventory.firstEnvName=daaSearchNewInventory.GetFolderName();
	daaSearchNewInventory.SetFolderName(env2);
	daaSearchNewInventory.secondEnvName=daaSearchNewInventory.GetFolderName();
	tc="51";
	tcSpiraId="TC134116 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A2&acodes=CAC50DOV171A5&acodes=CAC50DOV171A6&language=EN&postalCode=T5V1K8&ipAddress=&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=5&transactionId=12";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="52";
	tcSpiraId="TC134117 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A2&acodes=CAC50DOV171A5&acodes=CAC50DOV171A6&language=FR&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="53";
	tcSpiraId="TC134118 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=EN&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="54";
	tcSpiraId="TC134119 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=FR&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
		tc="59";
	tcSpiraId="TC134124 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=H9B1Z9&ipAddress=&radius=300&dealerCode=C4688&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="60";
	tcSpiraId="TC134125 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=FR&postalCode=V9L3R7&ipAddress=&radius=300&dealerCode=C4570&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="61";
	tcSpiraId="TC134126 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=H7T2H6&ipAddress=&radius=300&dealerCode=C4582&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="62";
	tcSpiraId="TC134127 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=FR&postalCode=G4R3G7&ipAddress=&radius=300&dealerCode=C4502&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="64";
	tcSpiraId="TC134129 Fiat CCP-6443";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC40FIC041B0&language=EN&postalCode=G7A4G3&ipAddress=&radius=300&dealerCode=C3284&optionCodes=PW3,RA3,B7&packageCode=21D&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
		
}
public static void masterFeature(String dwc, String prodPrefix, String qaOnePrefix, String env1, String env2) throws Exception{

	//34. daaSearchNewInventory	
	String urlParametersString;
	wsName="daaSearchNewInventory";
	LoadWebServiceChryslerCA daaSearchNewInventory = new LoadWebServiceChryslerCA();
	daaSearchNewInventory.SetFolderName(dwc);
	daaSearchNewInventory.dataDir=daaSearchNewInventory.GetFolderName();
	daaSearchNewInventory.SetFolderName(env1);
	daaSearchNewInventory.firstEnvName=daaSearchNewInventory.GetFolderName();
	daaSearchNewInventory.SetFolderName(env2);
	daaSearchNewInventory.secondEnvName=daaSearchNewInventory.GetFolderName();
	tc="51";
	tcSpiraId="TC134116 Dodge_KZ";
//	pXMLURL="daasearchnewinventory.xml";
	
	
	prodPrefix="";
	pXMLURL="master-feature-orchestration/rest/vehicle/features/";
	urlParametersString="vin=\"3GCPCREC3FG408056\"&used=true&unstructuredText=tires: p245/35r20 performance summer&unstructuredText=auto-dimming interior mirror w/homelink/compass&unstructuredText=power w/tilt down heated mirrors";
	System.out.println(urlParametersString);
//	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
//	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
//	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	
	prodPrefix="http://lnoc-q1cp-xws1.autodatacorp.org:8080/";
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	
	
	
	
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="52";
	tcSpiraId="TC134117 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A2&acodes=CAC50DOV171A5&acodes=CAC50DOV171A6&language=FR&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="53";
	tcSpiraId="TC134118 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=EN&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	
	tc="54";
	tcSpiraId="TC134119 Dodge_KZ";
	pXMLURL="daasearchnewinventory.xml";
	urlParametersString="acodes=CAC50DOV171A1&acodes=CAC50DOV171A3&acodes=CAC50DOV171A4&language=FR&postalCode=T5V1K8&ipAddress=173.178.183.115&radius=&dealerCode=C8552&optionCodes=&packageCode=&maxResultSet=&transactionId=";
	System.out.println(daaSearchNewInventory.getSourceCode(urlParametersString, qaOnePrefix, pXMLURL));
	System.out.println(tcSpiraId+" Please Wait...daasearchnewinventory");	
	System.out.println("OK let's get started comparing ws output against this site: " + prodPrefix);
	daaSearchNewInventory.loadURLProd(tcSpiraId,tc,urlParametersString,prodPrefix,pXMLURL);
	daaSearchNewInventory.loadURLQA(tcSpiraId,tc,urlParametersString,qaOnePrefix,pXMLURL);
	daaSearchNewInventory.compare(wsName,true);	

		
}


protected static String getDWEnvURL(String envir1) {
	String Prefix;
	if (envir1.equalsIgnoreCase("prod")){
		Prefix = "http://ccdw.chryslercanada.ca/asiautos/"; //PROD - DW - PubliC
//		Prefix = "http://66.240.181.131/asiautos/"; //PROD 131
//		Prefix = "http://66.240.181.132/asiautos/"; //PROD 132		
//		Prefix = "http://66.240.181.133/asiautos/"; //PROD 133	
//		Prefix = "http://172.16.147.56:8080/asiautos/"; //John's local for testing p
//		Prefix = "http://ln-dv-chca-ci01/asiautos/";	//John's env for testing p
	}else if (envir1.equalsIgnoreCase("Prod-prod")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-prod/"; //PROD - DW - PubliC EID 9090
	}else if (envir1.equalsIgnoreCase("QA9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos/"; //PROD - DW - PubliC EID 9090
//		prodPrefix = "http://ln-qa-chca-was1:9090/asiautos-order/"; //PROD - DW - PubliC EID 9090
	}else if (envir1.equalsIgnoreCase("prod-prod9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos-prod/"; //PROD build and QA data - DW - PubliC
	}else if (envir1.equalsIgnoreCase("uat")){
		Prefix =  "http://69.10.228.103:80/asiautos/";     //UAT- DW - PubliC
	}else if (envir1.equalsIgnoreCase("qa")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos/";   //QA - DW - Public -Marked with Monentum
	}else if (envir1.equalsIgnoreCase("qa-pr")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-pr/";   //QA pr build and QA data - DW - Public -Marked with Monentum
	}else if (envir1.equalsIgnoreCase("preprod")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-preprod/";   //QA pr build and QA data - DW - Public -Marked with Monentum
	}else{
		Prefix = "";
		System.out.println(envir1+" is wrong!");	
		return Prefix;
	}
	return Prefix;
}
protected static String getDCEnvURL(String envir) {
	String Prefix;
	if (envir.equalsIgnoreCase("prod")){
		Prefix = "http://66.240.181.139:80/asiautos/"; //PROD - DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("Prod-prod")){
		Prefix = "http://ln-qa-chca-was2:80/asiautos-prod/"; //PROD build and QA data - DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("QA9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos/"; //PROD - Use DW - PubliC EID 9090 - Do not have DC 9090 URL here
	}else if (envir.equalsIgnoreCase("prod-prod9090")){
		Prefix = "http://ln-qa-chca-was1:9090/asiautos-prod/"; //PROD build and QA data - Use DW - PubliC - Do not have DC 9090 URL here
	}else if (envir.equalsIgnoreCase("uat")){
		Prefix = "http://66.240.181.143:80/asiautos/";	  //UAT- DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("qa")){
		Prefix = "http://ln-qa-chca-was2:80/asiautos/";   //QA - DC - marked (QEP, CK,DIM) 
	}else if (envir.equalsIgnoreCase("qa-pr")){
		Prefix = "http://ln-qa-chca-was3:80/asiautos-pr/";   //QA pr build and QA data - DW - Public -Marked with Monentum
	}else if (envir.equalsIgnoreCase("preprod")){
		Prefix = "http://ln-qa-chca-was2:80/asiautos-preprod/";   //QA preprod build and QA data - DC - marked (QEP, CK,DIM) 
	}else{
		Prefix = "";
		System.out.println(envir+" is wrong!");	
		return Prefix;
	}
	return Prefix;
}
public static void RunInDWPubilc(String envir1,String envir2 ){
	String prodPrefix, qaOnePrefix;
	prodPrefix = getDWEnvURL(envir1);
	qaOnePrefix = getDWEnvURL(envir2);
//////***************DW**************************************************************************************************************
////34. daaSearchNewInventory	 	 DW 
		try {
			masterFeature(dw,prodPrefix, qaOnePrefix, envir1, envir2);
//			daaSearchNewInventory(dw,prodPrefix, qaOnePrefix, envir1, envir2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
////******************************************DW***********************************************************************************
	System.out.println("Chrysler CA in DW STOP here!!!");		
	System.out.println("Done...");	
}

public static void RunInDC(String envir1,String envir2 ){
	String prodPrefix, qaOnePrefix;
	prodPrefix = getDCEnvURL(envir1);
	qaOnePrefix = getDCEnvURL(envir2);
//////***********************DC******************************************************************************************************

////14G. 	getRestoreVehicle		DC - 
// This one cannot be used. It fails to match manual test with scratchSave. Haven't figured out why??? Will investigate later.
	try {
		getRestore(dc, prodPrefix, qaOnePrefix, envir1, envir2);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
////33.	getWindowStickerXML (used to be 25) 	
//	getWindowStickerXML(dc, prodPrefix, qaOnePrefix, envir1, envir2);
//////*****************DC************************************************************************************************************	
	System.out.println("Chrysler CA in DC STOP here!!!");		
	System.out.println("Done...");	
}
	public static void main (String args[]) throws IOException  {
		//PROD,Prod-prod, Prod-Prod9090, UAT, QA, QA9090, QA-pr	
		System.out.println("Starting....\n");
		PrintStream original = System.out;
		String ConsoleLogfile="TestConsoleLog.txt";
		String firstEnv="";
		String secondEnv="";
	 	try {
		Properties testprop = new Properties();
//		testprop.load(new FileInputStream("data/test.properties"));
//		testprop.load(Controller_Chrysler_CA_Save_SystemOut.class.getClassLoader().getResourceAsStream("data/test.properties"));
		testprop.load(masterFeatures.class.getClassLoader().getResourceAsStream("data/test.properties"));
		
//        String test1 = testprop.getProperty("admin.firstPage");
//        System.out.println("admin.firstPage="+test1);
	 	} catch (IOException ex) {
	        ex.printStackTrace();
	    }
	 	try {
			readPropertiesFile readPropValues=new readPropertiesFile();
			firstEnv=readPropValues.getFirstEnv();
			secondEnv=readPropValues.getSecondEnv();
			dw=readPropValues.getDWfilePaht();
			dc=readPropValues.getDCfilePaht();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Comment below if you want console info show running status
//		System.setOut(new PrintStream(new FileOutputStream(dw+ConsoleLogfile)));
	
		RunInDWPubilc(firstEnv,secondEnv); 
		
	 	try {
			readPropertiesFile readPropValues=new readPropertiesFile();
			firstEnv=readPropValues.getFirstEnv();
			secondEnv=readPropValues.getSecondEnv();
			dw=readPropValues.getDWfilePaht();
			dc=readPropValues.getDCfilePaht();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Comment below if you want console info show running status
		System.setOut(new PrintStream(new FileOutputStream(dc+ConsoleLogfile)));
		
//		RunInDC(firstEnv,secondEnv); 
		
		System.setOut(original);
		System.out.println("The end!");	
}
		
	
}	