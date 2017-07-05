package com.multi.level3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Read_Write_Lock_Ex {

	public static void main(String[] args) {

		// Map<String, String> map = new HashMap<>();
		List<String> list = new ArrayList<>();

		ReadWriteLock readWritelock = new ReentrantReadWriteLock();

		Runnable writeTask = () -> {
			Lock writeLock = readWritelock.writeLock();
			try {
				writeLock.lock();
				System.out.println("write - start");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// map.put("cookie1", "samosa");
				list.add("samosa");
				System.out.println("write - end");
			} finally {
				writeLock.unlock();
			}
		};

		Runnable readTask = () -> {
			Lock readLock = readWritelock.readLock();
			try {
				readLock.lock();
				System.out.println("read - start");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(list);
				System.out.println("read - end");
			} finally {
				readLock.unlock();
			}
		};

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(writeTask);
		executorService.execute(writeTask);
		executorService.execute(readTask);
		executorService.execute(readTask);
		executorService.execute(readTask);
		executorService.execute(readTask);

	}

}
