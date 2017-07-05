package com.multi.level3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_API {

	// private static Object lock = new Object();

	private static Lock lock = new ReentrantLock();
	
	private static Condition notEmpty = lock.newCondition();
	private static Condition notFull = lock.newCondition();

	private static int[] buffer;
	private static int count;

	static class Producer {

		void produce() {
			try {
				lock.lock();
				if (isFull(buffer)) {
					try {
						notEmpty.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("produced : >>>>");
				buffer[count++] = 1;
				notFull.signal();
			} finally {
				lock.unlock();
			}
		}

	}

	static class Consumer {

		void consume() {
			try {
				lock.lock();
				if (isEmpty(buffer)) {
					try {
						notFull.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[--count] = 0;
				System.out.println("consumed : <<<<");
				notEmpty.signal();
			} finally {
				lock.unlock();
			}
		}
	}

	static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	public static void main(String[] args) throws InterruptedException {

		buffer = new int[5];
		count = 0;

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable produceTask1 = () -> {
			for (int i = 0; i < 5; i++) {
				producer.produce();
			}
			System.out.println("Done producing");
		};
		Runnable produceTask2 = () -> {
			for (int i = 0; i < 5; i++) {
				producer.produce();
			}
			System.out.println("Done producing");
		};

		Runnable consumeTask = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(10*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				consumer.consume();
			}
			System.out.println("Done consuming");
		};

		ExecutorService executorService = Executors.newFixedThreadPool(20);
		executorService.execute(produceTask1);
		executorService.execute(produceTask2);
		executorService.execute(consumeTask);

		executorService.shutdown();

	}

}
