package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class PracticeNew {


	

	public static void main(String[] args) {
		
		
		
		
		
		 
//		try {
//			System.out.println(10/0);
//		System.out.println("this is try block to cheak this code is run or not..");
//		}
//		catch(ArithmeticException e) {
//			System.out.println(10/0);
//			 System.out.println(" here handle the problem ...");
//			 System.out.println("this is for test..");
//		}
//		finally {
//			System.out.println("this is finally block ");
//		}
//              System.out.println("this is for test also out side of block..");        	 

		
		
	// 	 THIS IS HANDLED FILENOTFOUND EXCEPTION 
	
//	        try {
//	           FileInputStream obj =  new FileInputStream("Mark.txt");
//	           }
//	           catch(FileNotFoundException e)
//	            {
//		            System.out.println("file handaled........");
//	             } 	
//	       } 
//
//	     }

		
		
		   //	 OUT OF RANGE Exception
//		
//		    int [] arr = new int [10000000000000000000000];
//		   // System.out.println(arr);
//		
//	}
//	}
//		
		
		
		
		
		
                             // IT'S LOOPING EROR OUTCOMES		
		
//		  void m2 () {
//			  m1();
//		  }
//		  void m1() {
//			  m2();
//		  }
//		   
//		  public static void main(String[] args) {
//			new PracticeNew().m1();
//		}
//}	
//		
		
	
		
		
		
		  // java.lang.ArithmeticException  (IF YOU ARE NOT WRITE WRON EXCEPTION THEN IT WILL PRINT NORMAL TERMINAL )
		
//		try {
//			System.out.println(10/0);
//		
//		}
//		catch(NullPointerException e) {
//			System.out.println("is it work the print me .....");
//		}
//		System.out.println(" it is rest of code ...");
//		
//	}}
		
		
		
		
		

		   
		
		
//		try {
//			System.out.println("this is always printabel ...");
//                                           // this is always print .............
//			
//			int a = 10;
//			int b = 0;
//			int c ;
//			c= a/b;
//			System.out.println(" great not at all problem in this ...");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("is this printebble .. yessssssssssss");
//			                       // this is always print ...........
//			System.out.println(10/0);
//			 System.out.println("ohh.. no it's not divide by zero ");
//		}
//		finally {
//			          
//			System.out.println("so its also always printalble .. yes it is ...ohooo");
//			                        // this above line alwys print ........
//			System.out.println("Ashish".charAt(13));
//			System.out.println("always execute finnaly block.. but above not line was not eror ");
//		}
//		System.out.println(" out side of block ...");
//	}
//}
//		
		
		
		
		   // multiple catch block
		  // here acording to exception catch block excute their own exception
		
//		       try {
//		    	         // ArithmeticException
//		    	   int a =10/2;
//		    	   System.out.println(a);
//	                      // out of bond exception
//	                System.out.println("Ashish".charAt(4));
//	                            //NullPointerException
//		             String c =null;
//		             System.out.println(c.toUpperCase());
//		       } 
//		       
//		       
//		    catch (NullPointerException e) {
//		    	System.out.println("this is ctach block" + e);
//		    }
//		       catch(ArithmeticException b){
//		    	   System.out.println("this is second catch block.." + b);		    	   
//		        }
//		           catch(StringIndexOutOfBoundsException a) {
//		    	      System.out.println("this is third catch block .." + a);   
//		            }
//		       
//	}
//}
                      		

		
		
		
		
		           // here we can use multiple try block but every try block have own catch.
		           // but we can use also try block with finally block
		
//                try {
//                	
//                	System.out.println( 10/0 + "  " + "this is first try block... and no problem");
//                    
//                	try {
//                		System.out.println(10/0 +"this is secod second try block..");
//                	}
//                     catch(ArithmeticException e) {
//                    	 System.out.println("this is catch block of second try block .....");
//                    	
//                     }
//                }  // this is closing of first try block ....  
//                catch(ArithmeticException a) {
//                	System.out.println("this is second catch block of first try block.." + "    " + a);
//                }
//                
//                finally {
//                	System.out.println(" there no catch block of first try block");
//                }                              	
//              
//	     }
//      }
		
		
		

		//  this is arithmetcexception only for cheak
		
		
//		System.out.println(10/0);
//        try {
//        	System.out.println( "this is first try block... and no problem");
//        }  
//        catch(ArithmeticException a) {
//        	System.out.println("this is second catch block of first try block.." + "    " + a);
//        }
//        
//        finally {
//        	System.out.println(" there no catch block of first try block");
//        }                              	
//      
// }
//}
		
		
		
		
		
		
		
		// just test to check code abnormal or normal with new statement..
		
//        try {
//        	
//        	System.out.println(10/0 +"this is first try block");
//          
//           System.exit(0);
//                        // here system.exit(0) to will stop and not execute other code...
//        }
//        catch (ArithmeticException e) {
//        	System.out.println("handaled".charAt(34));
//        }
//        finally {
//        	          
//        	System.out.println(10/2+ " this is finally block ");
//        }   
//        System.out.println("randomly rest of application");
//      
// }
//}
		
		
		
		
		
		
		
		
		  // nested finally block  
		  // also check some technique , how its working...
		
//		try {
//			System.out.println(10/0 +"hiii");
//		}
//		catch(ArithmeticException e) {
//			System.out.println(10/0 +"hii  2");
//		}
//		finally {
//			System.out.println("finally ha ha hahah ha");
//		
//		try {
//			System.out.println(10/0 + "hii  3");
//		}
//		catch(ArithmeticException a) {
//			System.out.println(10/0 +"hiii 4 ");	
//		}
//		finally {
//			System.out.println("this is finally 2");
//		}
//		}
//		
	}
}
		

		
		
		
		