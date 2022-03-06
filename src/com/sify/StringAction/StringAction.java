package com.sify.StringAction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

 class StringActionA {
	public String className = " StringActionA";
	void stringActionAFun(){
		System.out.println( "  className " + className);
	}
	
}
 
 class Person {
	 private int id;
	 private String name;
	 private List<Person> child;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getChild() {
		return child;
	}
	public void setChild(List<Person> child) {
		this.child = child;
	}
	 
	 public String toString(){
		return "id"+id;
		 
	 }
 }
 class StringActionB {
		public String className= "ab";
		public static String sts = new String("");
		void funcc(){
			System.out.println(className.indexOf("a"));
			System.out.println(" i value in static  :====>"+sts.length());
		}
		
	}

public class StringAction {
	static String original = "A-199, B-210, C-88";
	public static void main1(String[] args) {
		
		String[] orgArray = original.split(",");
		for(String eachValue: orgArray){
			String[] eachValueArr = eachValue.split("-");			
		}		
		System.out.println(original+"  sdgs  "+original.replaceAll("\\^([0-9]+)", "="));
		
		StringActionB s = new StringActionB();
		s.funcc();
		
		
		Person person = new Person();
		person.setId(8);
		person.setName("selvam");
		ArrayList<Person>  childs = new ArrayList<>();
		Person son= new Person();
		son.setId(18);
		son.setName("denesh");
		childs.add(son);
		Person son1= new Person();
		son1.setId(18);
		son1.setName("thina");
		childs.add(son1);
		person.setChild(childs);
		System.out.println(" Person :"+person);
	}

	public static void main(String[] args) {
		String str = "asgasgejweknksakdkn";		
		char[] charArr = str.toCharArray();
		HashMap<Character, Integer> cMap = new HashMap<>();		
		for(char  chr : charArr){								
			if(cMap.containsKey(chr)){
				cMap.put(chr, cMap.get(chr)+1);				
			} else {
				cMap.put(chr, 1);
			}
		}	
		
		Set cSet = cMap.keySet();
		Iterator itr = cSet.iterator();
		while(itr.hasNext()){
			Character key = (Character) itr.next();
			System.out.print(" "+key);
			/*if(key.equals('w')){
				cMap.remove(key);
			}*/
		}
		System.out.println("cMap "+cMap);
		
		StringBuilder sb= new StringBuilder();		
		TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>(cMap);	//order sort by asce
		System.out.println("treeMap "+treeMap);
		TreeMap<Character, Integer> revTreeMap2 = new TreeMap<>(Collections.reverseOrder());
		revTreeMap2.putAll(cMap);
		System.out.println("revTreeMap2 "+revTreeMap2);
		NavigableMap<Character, Integer> nav = treeMap.descendingMap();               //desc into navigable   
		for(Entry<Character, Integer> ent :nav.entrySet()){
			
			if(ent.getValue() == 1){
				sb.append(ent.getKey());
			} else{
				sb.append(ent.getKey()+""+ent.getValue());
			}				
		}
		System.out.println("nav "+nav);
		System.out.println("repeatedString with count:"+sb);
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
	    ht.put("1", "REPLACED !!");
	    ht.put("4", "Four");
	    Enumeration<String> htE=  ht.elements();
	    while (htE.hasMoreElements()) {
			String htKey = htE.nextElement();			
		}
	    System.out.println("ht "+ht);
		
		HashMap<String, String> hMap = new HashMap<String, String>();

	    hMap.put("1", "One");
	    hMap.put("2", "Two");
	    hMap.put("3", "Three");
	    ht.putAll(hMap);
	    System.out.println("hMap "+hMap);
	    System.out.println("ht "+ht);
	}
	
	
}
