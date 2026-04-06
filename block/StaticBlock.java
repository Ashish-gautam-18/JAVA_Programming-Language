package com.oop.block;

public class StaticBlock {

//	static {
//		System.out.println("Ashish jii..");
//	}
//	public static void main(String[] args) {
//		// without object creation static block are get excecute
//	}
//
//}
//
	
	
	StaticBlock(){
		System.out.println("hi i am constructor..");
	}
	
	{
		System.out.println("hii this is instance block... ");
	}
	
	static {
		System.out.println("hii this is static block ..");
	}
	   // if our public method will change into static method then first execute Static block 
	   //after that Static method then instance block and last one is constructor 
	public void show () {   // static
		System.out.println("this is normal method...");
	}
	public static void main(String[] args) {
		  //StaticBlock.show();
		 StaticBlock r = new StaticBlock();
		 r.show();
		
                //		hii this is static block ..
                //		hii this is instance block... 
                //		hi i am constructor..
                //		this is normal method...
          
	}
}
