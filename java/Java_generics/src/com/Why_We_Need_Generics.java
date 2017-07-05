package com;

interface Language {
}

class Subject {
}

class Java extends Subject implements Language {
}

class JS extends Subject implements Language {
}

class Trainer<T extends Subject & Language> {

	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

class ClassRoomTrainer extends Trainer<Java> {

}

class OnlineTrainer {

}

public class Why_We_Need_Generics {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<Java>();
		javaTrainer.setSubject(new Java());

		Trainer<JS> jsTrainer = new Trainer<>();

		// Trainer<String> trainer = new Trainer<>();

		// --------------------------------------------
		// javaTrainer.setSubject(new JS()); //
		// -------------------------------------------

		// Object object = javaTrainer.getSubject();
		// Java java = (Java) object;

		Java java = javaTrainer.getSubject();

		System.out.println("Happy learning with javaTrainer");

	}

}
