package com.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fail_Fast_Iteration_Ex {

	public static void main(String[] args) {

		List<String> list = new Vector<>();
		for (int i = 0; i < 100; i++) {
			list.add("item-" + i);
		}

		// ------------------------------------------

		Runnable readTask = () -> {
			for (String item : list) {
				System.out.println("read<<<<");
				System.out.println(item);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
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

		// --------------------------------------------

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(readTask);
		executorService.execute(writeTask);

		// ---------------------------------------------

	}

}
