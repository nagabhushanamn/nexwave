package com.multi.level2;

class LongWrapper {
	private long longValue = 0;

	public void increment() {
		this.longValue = this.longValue + 1;
	}

	public long getValue() {
		return this.longValue;
	}
}

public class RaceCondition_Ex {

	public static void main(String[] args) throws InterruptedException {

		LongWrapper longWrapper = new LongWrapper();

		Thread[] threads = new Thread[1000];

		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				longWrapper.increment();
			}
		};

		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(runnable);
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		// -----------------------------------------------

		System.out.println(longWrapper.getValue()); // 1000 * 1000 ==> 1000000

	}

}
