package com;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

class MyResource implements Closeable {
	public void init() {
		System.out.println("init()");
	}

	public void use() {
		System.out.println("use()");
		throw new RuntimeException("ooops");
	}

	public void close() {
		System.out.println("close()");
	}
}

public class Ex2 {

	public static void main(String[] args) {

		// MyResource myResource = new MyResource();
		//
		// try {
		// myResource.init();
		// myResource.use();
		// return;
		// // myResource.close();
		// } catch (RuntimeException e) {
		// e.printStackTrace();
		// // myResource.close();
		// } finally {
		// myResource.close();
		// }

		// --------------------------------------------

		try (MyResource myResource = new MyResource()) {
			myResource.init();
			myResource.use();
		} catch (RuntimeException e) {
			e.printStackTrace();
			// myResource.close();
		}

		// --------------------------------------------
	}

}
