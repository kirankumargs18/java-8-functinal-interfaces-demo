package com.kirangs;

/**
 * Runnable : Functional Interface
 * 
 * When an object implementing interface <code>Runnable</code> is used
 * to create a thread, starting the thread causes the object's
 * <code>run</code> method to be called in that separately executing
 * thread.
 */

/**
 * Traditional way
 * */
class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Started....");
		
	}
	
}
public class RunnableFunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		//traditional way
		
		Thread thread=new Thread(new ThreadDemo());
		thread.start();
		
		//lambda
		
		Runnable runnable=()->System.out.println("Started....");
		Thread thread2=new Thread(runnable);
		thread2.start();
		
	}

}
