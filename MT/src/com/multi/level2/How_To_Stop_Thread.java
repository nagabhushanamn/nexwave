package com.multi.level2;

import java.util.concurrent.TimeUnit;

class Server implements Runnable {

	private volatile boolean exit = false;

	public void run() {
		while (!exit) {
			System.out.println("Server is running.....");
		}
		System.out.println("Server is stopped....");
	}

	public void stop() {
		exit = true;
	}
}

public class How_To_Stop_Thread {

	public static void main(String args[]) throws InterruptedException {
		Server myServer = new Server();
		Thread t1 = new Thread(myServer, "T1");
		t1.start();

		System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
		myServer.stop();
		TimeUnit.MILLISECONDS.sleep(200);
		System.out.println(Thread.currentThread().getName() + " is finished now");
	}

}
