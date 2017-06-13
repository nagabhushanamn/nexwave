package com.multi.level3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Ex {

	public static void main(String[] args) {

		Runnable r = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " start working...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " stop work...");
		};

		// ----------------------------------------------

		// Thread thread = new Thread(r);
		// thread.start();

		// --------------------------------------------

		// ExecutorService executorService =
		// Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			executorService.execute(r);
		}

		executorService.shutdown();

	}

}
