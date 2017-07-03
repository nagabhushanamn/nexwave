package com;

import java.util.function.*;

interface I {

	void a();

	void b();

	default void defaultMethod() {
		// default logic....
	}

	static void staMethod() {
		// ...........
	}
}

interface II {
	default void defaultMethod() {
	}

}

interface III {
	boolean equals(Object o);
}

class Impl3 implements III {
}

class Impl1 implements I, II {

	@Override
	public void a() {

	}

	@Override
	public void b() {

	}

	@Override
	public void defaultMethod() {
		I.super.defaultMethod();
		II.super.defaultMethod();
	}

}

class Impl2 implements I {

	@Override
	public void a() {

	}

	@Override
	public void b() {

	}

}

public class New_Syntax_To_Interface {

	public static void main(String[] args) {

		I.staMethod();

		I i = new Impl1();
		i.defaultMethod();

	}

}
