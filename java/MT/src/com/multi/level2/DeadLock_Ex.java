package com.multi.level2;

class R1 {

	Object key1;
	Object key2;

	public R1(Object key1, Object key2) {
		this.key1 = key1;
		this.key2 = key2;
	}

	public void m1(R2 r2) {
		synchronized (key1) {
			System.out.println("T1 having R1");
			System.out.println("T1 trying R2");
			r2.m2();
		}
	}

	public void m2() {
		synchronized (key2) {
			System.out.println("T2 also having R1");
		}
	}
}

class R2 {

	Object key1;
	Object key2;

	public R2(Object key1, Object key2) {
		this.key1 = key1;
		this.key2 = key2;
	}

	public void m1(R1 r1) {
		synchronized (key2) {
			System.out.println("T2 having R2");
			System.out.println("T2 trying R1");
			r1.m2();
		}
	}

	public void m2() {
		synchronized (key1) {
			System.out.println("T1 also having R2");
		}
	}
}

public class DeadLock_Ex {

	public static void main(String[] args) {

		Object key1 = new Object();
		Object key2 = new Object();

		R1 r1 = new R1(key1, key2);
		R2 r2 = new R2(key1, key2);

		Thread thread1 = new Thread(() -> {
			r1.m1(r2);
		});
		Thread thread2 = new Thread(() -> {
			r2.m1(r1);
		});

		thread1.start();
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		thread2.start();

	}

}
