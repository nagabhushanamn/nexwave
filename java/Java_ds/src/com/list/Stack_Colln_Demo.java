package com.list;

import java.util.Stack;

public class Stack_Colln_Demo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		stack.push("B");
		stack.push("A");
		stack.push("D");
		stack.push("C");
		stack.add("D");

		// System.out.println(stack.peek());

		// System.out.println(stack.pop());

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		System.out.println(stack.pop());

	}

}
