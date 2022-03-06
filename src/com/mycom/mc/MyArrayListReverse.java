package com.mycom.mc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
 
public class MyArrayListReverse {
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        
        Collections.sort(list);
        System.out.println("Sorted Result   "+list);
        
        Collections.reverse(list);        
        System.out.println("Reversed Result   "+list);
        
            ListIterator itr = list.listIterator();
            while(itr.hasNext()){
            	String st=(String) itr.next();
            	if(st.contentEquals("Play")){
            		  itr.add("r");
            		   itr.previous();
            		   itr.add("kk");
            		  
                }
            }
            System.out.println("Reversed Result   "+list); 
            
    }
}