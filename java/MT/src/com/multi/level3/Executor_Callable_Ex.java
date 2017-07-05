package com.multi.level3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_Callable_Ex {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();

		Callable<String> callableTask1 = () -> {
			System.out.println("requesting biryani......");
			Thread.sleep(5000);
			// if (1 == 1)
			// throw new Exception("Today monday , no biryani");
			return "Biryani";
		};

		Callable<String> callableTask2 = () -> {
			System.out.println("requesting beer......");
			return "BEER";
		};

		// Future<String> future = executorService.submit(callableTask);

		Collection<Callable<String>> tasks = new ArrayList<>();
		tasks.add(callableTask1);
		
		tasks.add(callableTask2);

		try {
			List<Future<String>> futures = executorService.invokeAll(tasks);

			for (Future<String> item : futures) {
				System.out.println(item.get());
			}

		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}
