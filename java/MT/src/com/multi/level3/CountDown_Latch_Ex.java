package com.multi.level3;

import java.util.concurrent.CountDownLatch;

public class CountDown_Latch_Ex {

	public static void main(String[] args) {

		CountDownLatch countDownLatch = new CountDownLatch(5);

		TechLead techLead1 = new TechLead(countDownLatch, "first");
		TechLead techLead2 = new TechLead(countDownLatch, "second");
		TechLead techLead3 = new TechLead(countDownLatch, "third");

		techLead1.start();
		techLead2.start();
		techLead3.start();

		try {
			System.out.println("HR Manager waiting for recruitment to complete...");

			countDownLatch.await();

			System.out.println("Distribute Offer Letter");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static class TechLead extends Thread {

		CountDownLatch countDownLatch;

		public TechLead(CountDownLatch countDownLatch, String name) {
			super(name);
			this.countDownLatch = countDownLatch;

		}

		@Override
		public void run() {
			try {
				// countDownLatch.countDown();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName() + " : recruted");

			countDownLatch.countDown();
		}

	}

}
