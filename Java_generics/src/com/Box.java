package com;

public class Box<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U extends Number, V, W extends String> void inspect(U u, V v, W w) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}

	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer(10));

		integerBox.inspect(12.12, "hello", "World");
	}
}