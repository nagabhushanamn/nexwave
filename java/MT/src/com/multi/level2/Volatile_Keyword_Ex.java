package com.multi.level2;

public class Volatile_Keyword_Ex {

	private static int my_int = 0;

	static class ChangeListener extends Thread {
		@Override
		public void run() {
			int local_value = my_int;
			while (local_value < 5) {
				// System.out.println(my_int);
				if (local_value != my_int) {
					System.out.printf("Got Change for MY_INT : %d \n", my_int);
					local_value = my_int;
				}
			}
		}
	}

	static class ChangeMaker extends Thread {
		@Override
		public void run() {

			int local_value = my_int;
			while (my_int < 5) {
				System.out.printf("Incrementing MY_INT to %d \n", local_value + 1);
				my_int = ++local_value;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

}
