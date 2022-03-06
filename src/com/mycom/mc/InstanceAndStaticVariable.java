package com.mycom.mc;



class SC{
	static int y= f1();
	
	static int f1(){
		System.out.println("static variable instanciated");
		return 20;
	}
}

public class InstanceAndStaticVariable {
	int x=f();
		int f(){
		System.out.println("non static variable instanciated");
		return 10;
	}
	
	public static void main(String args[]){
		System.out.println(" "+SC.y);
		String[] a= {};
		new InstanceAndStaticVariable().mainMethod(a);
	}
	public void mainMethod(String args[]){
		System.out.println(" "+x);
	}
}
