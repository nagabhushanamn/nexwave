package com.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sync_Wrapped_Colln_Ex {

	public static void main(String[] args) {

		// Map<String, String> hashMap = new HashMap<>();
		// hashMap = Collections.synchronizedMap(hashMap);

		// List<String> list = new ArrayList<>();
		List<String> list = Collections.synchronizedList(new ArrayList<>());
		for (int i = 0; i < 50; i++) {
			list.add("item-" + i);
		}

		// ------------------------------------------

		Runnable readTask = () -> {
			synchronized (list) {
				for (String item : list) {
					System.out.println("read<<<<");
					System.out.println(item);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable writeTask = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("write<<<<");
				list.add("item-" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(writeTask);
		executorService.execute(readTask);

	}

}
