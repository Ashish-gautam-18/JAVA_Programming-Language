package com.throw_throws;

public class ThrowExample {

//	public static void main(String[] args) 
//	{
	
		
//		int age = 19;
//		if( age < 18) {
//			
//			throw new ArithmeticException (" can't elegible for vote ");
//		}
//		else {
//			System.out.println("elegible for vote..");
//		}
//	}
//
//}

		
		
		
		
		
		
		
		
//		System.out.println(10/0);
//		        // java.lang.ArithmeticException: / by zero
//		        //here JVM implicitly are working
//		
//		throw new ArithmeticException (" / by zero");
//		        //  java.lang.ArithmeticException:  / by zero
//		        // here user made object & exception and throw to JVM 









            // it is use of throw and throws 


	 
//    class InvalidAgeException extends Exception 
//{	
//	InvalidAgeException (int age){
//		//System.out.println("your age is" +"  "+ age);
//	}
//}
// class CheakAge{
//	 void age (int age) throws InvalidAgeException {
//		 if (age <18) {
//			 
//		   throw new InvalidAgeException(age);
//	 }
//	 }
// }
//   public class ThrowExample{
//	   public static void main(String[] args)
//	   {
//		   CheakAge ch= new CheakAge();
//		   try {
//			   ch.age(15); 
//			   System.out.println("you are eligible for vote");
//		   }
//		   catch(InvalidAgeException a) {
//			   System.out.println("wait for age at 18");
//		   }
//		   
//	   }
//
//   }








      



//	public static void main(String[] args) throws InterruptedException 
//	{
//           for (int i=1; i<=10;i++) {
//        	   System.out.println(i);
//        	   Thread.sleep(1000);
//        	       // if  throws not declare in main method Unhandled exception type InterruptedException
//        	       // if throws declare in main method then its succesfully run
//           }
//	}
//}                           *
//                            |
//                            |
//                            |
//                            |
//                            |
//                            |
//                            |
//		                      *

		  // But you know the best approuch is best that is use of try&catch block
		
//	           for (int i=1; i<=10;i++) {
//	        	   System.out.println(i);
//	        	   try {
//	        		   Thread.sleep(1000);
//	        	   }
//	        	   catch(InterruptedException e) {
//	        		   System.out.println(e);
//	        	       }
//	                   }   
//	                }
//        	     }		
		
		
		
		
		
		
		
		
//		 void div (int a, int b) throws ArithmeticException {
//			 if (b==0) {
//				 throw new ArithmeticException();
//			 }
//			 else {			 
//			      int c=a/b;
//				 System.out.println(c);
//			 }
//		 }
//		public static void main(String[] args) {
//			ThrowExample th = new ThrowExample();
//		 	//  th.div(20, 0);
//			       //   java.lang.ArithmeticException 
//			   th.div(20, 2);
//			       // 10 
//		}
//   }
// 
		
		
		
		
		
		
		
		
		
	
	
//	 void wait1() throws InterruptedException {
//		  for (int i=1; i<=10;i++) {
//       	   System.out.println(i);
//       	   
//       		   Thread.sleep(1000);
//       	   }
//		  }
//	 public static void main(String[] args) throws InterruptedException {
//		 ThrowExample th = new ThrowExample();
//	 
//	         th.wait1();
	               // success runing
//	         
//	}
//	 }
		
		
		
		
		
		
		
		
		
		
		
		
	void wait1() throws InterruptedException {
		  for (int i=1; i<=4;i++) {
			  System.out.println(i);
     	   	   
     		   Thread.sleep(1000);
     	   }
		  }
	 public static void main(String[] args) throws InterruptedException {
		 ThrowExample th = new ThrowExample();
	 
	         th.wait1();
	         //System.out.println(10/0);
	                    // ArithmeticException: / by zero
	         System.out.println("ashish");
	                            // ashish ( successfully )
	 } 
	 
	 }
		
		
		
		
		
		
		






