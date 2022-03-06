package com.mycom.mc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class ExceptionTest {
	 public static void main() throws Throwable{
		 System.out.println(test());
		 
		 
	
		 
	 }
	
	 public static int test() throws Throwable{
		 try{
		int i= 1/0;
						if(i==0)throw new IOException();
						

			} catch( ArithmeticException e){
				return 2;
			} catch(IOException | FileNotFoundException e){
				return 2;
			}finally{
				//return 43;
			}
		 return 23;
	 }
	
}
