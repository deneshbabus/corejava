package com.mycom.mc;
 
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class DuplicateCharsInString {
 
    public void findDuplicateChars(String str){
         Map<String, Integer> charMap = new HashMap<>();
         String[] strArray = str.split(" ");  
         for(String c : strArray){
        	 if(charMap.containsKey(c)){
        		 charMap.put(c, charMap.get(c)+1);
        	 } else{
        		 charMap.put(c, 1);
        	 }
        	 
         }
         System.out.println("Rest   :"+charMap);
         
         Set<String> charSet = charMap.keySet();
        for(String c : charSet){
        	System.out.println(c+"-->"+charMap.get(c));
        	
        	
        	double num = 12345.336;
        	Double dub = 12345.336;
        	System.out.println("Doub :"+dub);
        	Double.toString(1212412);
        	Double.parseDouble("12124.2124");
        	dub.intValue();
        	int[] myArr = {3,2,56,12,98,23,56}; 
        	Arrays.sort(myArr); 
        	 String[] strArr = {"JAVA", "C++", "PERL", "STRUTS", "PLAY"};
            /* Arrays.sort(strArr,new Comparator<String>(){
      
                 @Override
                 public int compare(String o1, String o2) {
                     return o1.compareTo(o2);
                 }});*/
        	 Arrays.sort(strArr);
              
             for(String str1:strArr){
                 System.out.println(str1);
             }
        	
        	String numStr = Double.toString(num);
        	String reverseString ="";
        	for(int i=numStr.length()-1 ; i>=0; i-- ){        		
        		reverseString += numStr.charAt(i);
        	}
        	System.out.println("RRRRR"+reverseString);
        	
        	
        	
        }
         
      }
     
    
    static public int reverseInt(int no){
    	int re = 0;
    	while(no != 0){
    		System.out.println("sdgsdg   "+no+"  "+re);
    		re = (re*10) + (no%10);
    		no = no/10;
    	}
    	System.out.println("sdgsdg   "+re);
    	return re;
    	
    	
    }
    
    
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars(" as AABBCCDSBDSLDFD as sd AABBCCDSBDSLDFD");
        
        System.out.println("Reverse Int: "+reverseInt(12345));
    }
}