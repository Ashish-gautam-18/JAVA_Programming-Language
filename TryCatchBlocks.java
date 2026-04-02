package com.exception;

    // if there is no exception in try block then catch block are not execute....  
public class TryCatchBlocks {
public static void main (String [] arg) {
	
	try {
		System.out.println("Ashish");
	}
	catch (NullPointerException e)
	{
		System.out.println(10/0);
		       // if in try block has exception and try block also exception then nothing print in output 
	}
	System.out.println("rest of the application");
	
	                    //Ashish
	                   //rest of the application
}
}
	
	
	     



















