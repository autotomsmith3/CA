//package test1;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	public class sortXML {
		public static int firstHead=1000000;
		public static int lastTail;
		public String q;
		public String p;
		public String retriveOneSetOfString(String originalString, String prixString, String postString, int startFrom, int latest){
			int firstPosition, lastPostion, lastStringLenth;
			String wholeString;		
//			totalLenth=originalString.length();
			firstPosition=originalString.indexOf(prixString, startFrom);
			lastPostion=originalString.indexOf(postString, firstPosition+prixString.length());
			if ((firstPosition==-1)||(lastPostion==-1))
			{
//				System.out.println("Warning!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!  String = "+prixString+"..."+postString+"dosen't exist in original output!");
				return "";
			}
			else
			{	
				if (firstHead>=firstPosition){
					firstHead=firstPosition;
				}
				lastTail=lastPostion+postString.length();
			lastStringLenth=postString.length();
			wholeString=originalString.substring(firstPosition, lastPostion+lastStringLenth);
			latest=lastPostion+lastStringLenth;
			return wholeString;
			}
		}
	public String readFile(String path) throws IOException{
		String sCurrentLine;
		            StringBuilder sb = new StringBuilder();
		            
		    try (BufferedReader br = new BufferedReader(new FileReader(path))){
//		    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"))){ // this works but need write in UTF-8 first
		        
		    	while (( sCurrentLine = br.readLine()) != null) {
		            sb.append(sCurrentLine);
		        }
		    }
		          return sb.toString();
		    }
	public String stringBeforeSorted(String head,String tail,String filePath) throws IOException{
		List<String> list = new ArrayList<>();
		String temp="";
		String unsortedString="";
		int fr,ed, count=0;
		sortXML testfile=new sortXML();
		String orginalText=testfile.readFile(filePath); //QA Old
		fr=orginalText.indexOf(head);
		ed=orginalText.indexOf(tail);
		if (fr==-1){
			System.out.println("The head is not found in the String.");
			return "";
			}else if (ed==-1){
				System.out.println("The tail is not found in the String.");
				return "";
			}
		while (fr==-1||ed==-1){
			fr=orginalText.indexOf(head,fr);
			ed=orginalText.indexOf(tail,fr);
		}
		do {
			temp=testfile.retriveOneSetOfString(orginalText, head, tail, fr,ed);
			if (!temp.equalsIgnoreCase("")){
				count++;
				list.add(temp);
			}
			fr=fr+temp.length();
		} while (!(temp.equalsIgnoreCase("")));
		unsortedString="";
		for (String str : list) {
			unsortedString=unsortedString+str+"\n";
		}
		System.out.println("Unsorted total items = "+count+"\n");
		return unsortedString;
	}
	public String stringAfterSorted(String head,String tail,String orginalText) throws IOException{
		List<String> list = new ArrayList<>();
		String temp="";
		String sortedString="";
		int fr,ed,count=0;
		sortXML testfile=new sortXML();
//		String orginalText=testfile.readFile(filePath); //QA Old
		fr=orginalText.indexOf(head);
		ed=orginalText.indexOf(tail);
		if (fr==-1){
			System.out.println("The head is not found in the String.");
			return "";
			}else if (ed==-1){
				System.out.println("The tail is not found in the String.");
				return "";
			}

		while (fr==-1||ed==-1){
			fr=orginalText.indexOf(head,fr);
			ed=orginalText.indexOf(tail,fr);
		}
		do {
			temp=testfile.retriveOneSetOfString(orginalText, head, tail, fr,ed);
			if (!temp.equalsIgnoreCase("")){
				count++;
				list.add(temp);
			}
			fr=fr+temp.length();
		
		} while (!(temp.equalsIgnoreCase("")));
		Collections.sort(list, new MyStrComparable());
		sortedString="";
		for (String str : list) {
			sortedString=sortedString+str+"\n";
		}
		System.out.println("After sorted total items = "+count+"\n");
		return sortedString;
	}
	public String sortString (String origianlS,String head, String tail) throws IOException {
		String sortedText="";
		String apiName1, apiName2, wholeSortedXML1="";
		sortXML testFiel=new sortXML();
		sortedText=testFiel.stringAfterSorted(head, tail, origianlS);
		if (!(sortedText.equalsIgnoreCase(""))){
		String subStringFromoriginalText1=origianlS.substring(firstHead, lastTail);
		wholeSortedXML1=origianlS.replace(subStringFromoriginalText1,sortedText);
		}
		return wholeSortedXML1;	
}
}


