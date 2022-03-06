package com.mycom.mc.thread;

class Shared2
{
    int i;
 
    synchronized void SharedMethod() throws InterruptedException
    {
        Thread t = Thread.currentThread();
 
        for(i = 0; i <= 10; i++)
        {
            System.out.println(t.getName()+" : "+i);
            Thread.sleep(1000);
        }
    }
}
 
public class ThreadsSynchronized
{
    public static void main(String[] args) throws Exception
    {
        final Shared2 s1 = new Shared2();
 
        Thread t1 = new Thread("Thread - 1") 
        {
            @Override
            public void run() 
            {
                try {
					s1.SharedMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        };
 
        Thread t2 = new Thread("Thread - 2")
        {
            @Override
            public void run()
            {
                try {
					s1.SharedMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        };
 
        t1.start();
 
        t2.start();
        
        /*Thread t3 = new Thread(){
        	public void run(){
        		System.out.println("");
        	}
        };
        t3.start();*/
    }
}
