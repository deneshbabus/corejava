package com.mycom.mc.thread;

class Shared
{
    StringBuffer i;
 
    void SharedMethod()
    {
        i = new StringBuffer("10");
        System.out.println(i.toString());
        i = new StringBuffer("20");
        System.out.println(i);
        i = new StringBuffer("30");
        System.out.println(i);
    }
}
 
public class ThreadsInterference	
{
    public static void main(String[] args)
    {
        final Shared s1 = new Shared();
 
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                s1.SharedMethod();
            }
        };
 
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s1.SharedMethod();
            }
        };
 
        t1.start();
 
        t2.start();
    }
}