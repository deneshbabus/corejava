package com.mycom.mc;
public class MyOwnException {
	public static void main(String[] ar){
		try{
			MyOwnException.myTest(null);
		} catch(MyAppException e){
			e.printStackTrace();
			System.out.println("Errr"+e.toString());   //  String s = getClass().getName();//  String message = getLocalizedMessage();//   return (message != null) ? (s + ": " + message) : s;
			System.out.println(e.getMessage());
			
		} catch(Exception e){
			System.err.println("Errr"+e.getLocalizedMessage());    //return getMessage();
		}
	}
	public static void myTest(String s) throws Exception{
		throw new MyAppException("TEST WERR MSG");
	}
}

class MyAppException extends Exception {
	private String message;
	public MyAppException(String s) {
		super(s);
		message = s; 
	}
	public MyAppException(){
		super();
	}
	public MyAppException(Throwable cause){
		super(cause);
	}
	/*@Override
	public String toString() {
		return "MyAppException [message=" + message + "]";
	}*/
	/*public String getMessage() {
		return message;
	}*/	
	
}