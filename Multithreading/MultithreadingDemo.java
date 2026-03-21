package com.sathya.thread;

//Java code for thread creation by implementing
//the Runnable Interface
class MultithreadingDemo implements Runnable {
	public void run()
	{
		try {
			// Displaying the thread 
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception here
			System.out.println("Exception is caught");
		}
	}
}

// Here Main Class 
class Multithread {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object
				= new Thread(new MultithreadingDemo());
			object.start();
		}
	}
}
