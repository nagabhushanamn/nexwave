package com;

import java.util.ArrayList;
import java.util.List;

class Super {
	void abc() {

	}
}

class Sub extends Super {

	@Override
	void abc() {

	}

	@SuppressWarnings("rawtypes")
	public void collnMethod() {
		List list = new ArrayList();
	}

	@Deprecated
	public void method() {
		// ..
	}

	public void newM() {
		// ..
	}

}

public class Annotation_Demo {

	public static void main(String[] args) {

		Sub sub = new Sub();
		sub.method();

	}

}
