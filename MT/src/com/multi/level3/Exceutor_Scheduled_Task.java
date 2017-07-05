package com.multi.level3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exceutor_Scheduled_Task {

	public static void main(String[] args) {

		Runnable task = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + "-> Task-start");
			try {
				Thread.sleep(6 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "-> Task-end");
		};

		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
		// executorService.schedule(task, 2, TimeUnit.SECONDS);
		executorService.scheduleWithFixedDelay(task, 0, 5, TimeUnit.SECONDS);
		// executorService.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);

	}

}
