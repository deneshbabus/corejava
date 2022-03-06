package com.mycom.mc;

class Multi extends Thread{  
public void run(){  
	for(int i= 0 ;i<=10;i++){
		System.out.println("thread is running..."+i);
		//t1.sleep(100); 
	}
  
}
public static void main(String args[]) throws InterruptedException{  
	Multi mt1=new Multi();  
	mt1.start(); 
	MutliRunnable mr = new MutliRunnable();
	Thread t1 = new Thread(mr);
	t1.start();
	Thread t2 = new Thread(mr);
	t2.start();
 }  
} 
class MutliRunnable implements Runnable{
	public void run(){
		for(int i= 0 ;i<=10;i++){
			System.out.println("runnable is running..."+i);
			//t1.sleep(100); 
		}
	}
	
	}
