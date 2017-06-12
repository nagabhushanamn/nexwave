package com.multi.level1;

/*
 * 
 * sleep()
 * join()
 * 
 */

public class Basic_Scheduling {

	public static void main(String[] args) throws InterruptedException {
		
		//
		// System.out.println("step-1");
		// Thread.sleep(5000, 1000);
		// System.out.println("step-2");

//		Thread tnrThread = new Thread(() -> {
//			System.out.println("Tnr working on prob..");
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("This is soln..");
//		});
//
//		Thread empThread = new Thread(() -> {
//			String name = Thread.currentThread().getName();
//			System.out.println(name + " working on program");
//			System.out.println(name + " got doubt");
//			tnrThread.start();
//			try {
//				tnrThread.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			System.out.println("emp cont... with tnr soln");
//
//		}, "EMP");
//
//		empThread.start();

		
		//--------------------------------------------------
//		
//		Thread thread=new Thread(()->{System.out.println("imp-work..");});
//		thread.setPriority(Thread.MAX_PRIORITY);
//		
		
		//-------------------------------------------------------
		
		
		Thread.yield();
		
		
	}

}
