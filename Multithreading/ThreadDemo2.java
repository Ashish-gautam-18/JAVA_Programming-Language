package com.sathya.thread;

class MytThrea extends Thread
{	@Override
	public void run() {
		for (int i = 1; i <= 10; i++){
			System.out.println("My number...."+i);
			try {
				   // here it's mean the output come after one second..
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
class ThreadDemo2
{	
   //main thread
	public static void main(String[] args) 
	{	MytThrea t1 = new MytThrea();
		t1.start();	// user thread 
	}
}
