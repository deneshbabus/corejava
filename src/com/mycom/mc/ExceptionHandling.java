package com.mycom.mc;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        methodWithThrow();
    }
 
    static void methodWithThrow()
    {
        /*try
        {*/
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly
 
            //throw ex;        //throwing NumberFormatException object explicitly using throw keyword
            throw new RuntimeException();
        /*}*/
        /*catch(NumberFormatException ex)
        {
            System.out.println("explicitly thrown NumberFormatException object will be caught here..");
        }*/
    }
}
