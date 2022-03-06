package com.mycom.mc;

public class ReverseStringWithoutRecursion {

	static String str = "JAVA DENESH";
	static String reStr = "";

	static String recursion(String str){
		if(str.length()<=1){
			return str;
		} else
		{
			System.out.println(str);
			// 1 
			return (recursion(str.substring(1))) + str.charAt(0);
			
			//2
			//reStr += str.charAt(str.length()-1) + recursion(str.substring(0, str.length()-1));
			//return reStr;
		}
	}
	
	
	
	public static void main(String[] args) {
		//without recursion
		for(int i=str.length()-1 ;i>=0;i--){
			reStr += str.charAt(i);
		}
		System.out.println("Revers String: "+reStr);
		reStr = "";
		
		//recursion
		System.out.println("Revers String: "+recursion(str));
		
		
		
		
	}

}
