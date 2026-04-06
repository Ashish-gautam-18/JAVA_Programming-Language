package com.oop.block;

public class InstanceBlock {

	InstanceBlock(){
		System.out.println("hii am constructor..");
	}
	
	{
		int a=10;
		String s="ashish";
		System.out.println(a + "  "+s);
	}
	
	public static void main(String[] args) {

		InstanceBlock r = new InstanceBlock();
                    		// 10  ashish
		                    // hii am constructor..

		                  
	}

}
