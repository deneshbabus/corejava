package com.sify.test;

import java.math.BigInteger;
import java.sql.Connection;
abstract class InterA{
	abstract void fun1();
}
class ClassA extends InterA{
	String str = "A-199, B-210, C-88";  //Expected value "A-200, B-200, C-200"
	protected void fun1(){
		System.out.println(" a.fun1 ");
		
	}
	void fun2(){
		System.out.println(" a.fun2 ");
		
	}
	
}
class ClassB extends ClassA{
	
	public void fun1(){
		System.out.println(" b.fun1 ");
	}
	Integer fun2(int a1){
		System.out.println(" a.fun2 ");
		return a1;
	}
}
class ClassC extends ClassB{
	
	public void fun1(){         //protected -Cannot reduce the visibility of the inherited method from ClassB
		System.out.println(" c.fun1 ");
	}
	
}


public class AccessModifiersAndMethosBinding {
	static String original = "A-199, B-210, C-88";
	public static void main(String[] args) {
		
		ClassA obj = new ClassC();
		//System.out.println(obj.fun2());
		
		//Creating obj for annonimus inner class
		InterA in = new InterA() {
			
			@Override
			public void fun1() {
				System.out.println(" I.fun1 ");
				
			}
		};
		
		in.fun1();
		
	}

}
