package com.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingQueue_Ex {

	public static void main(String[] args) {

		BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

		Runnable readTask = () -> {
			for (int i = 0; i < 100; i++) {
				try {
					System.out.println(queue.take());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable writeTask = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("write<<<<");
				try {
					queue.offer("item-" + i, 2, TimeUnit.SECONDS);
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

			}
		};

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(writeTask);
		executorService.execute(readTask);

	}

}
