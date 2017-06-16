package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//-------------------------------------------------------------------
enum NewGender {
	MALE, FEMALE
}

class Person {

	private String firstName;
	private String lastName;
	private LocalDate dob;
	private NewGender gender;

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender
				+ "]";
	}

	public Person(String firstName, String lastName, LocalDate dob, NewGender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public NewGender getGender() {
		return gender;
	}

	public void setGender(NewGender gender) {
		this.gender = gender;
	}

	public static List<Person> getPersons() {

		ArrayList<Person> persons = new ArrayList<>();

		Person person1 = new Person("Naga", "N", LocalDate.of(1983, 10, 05), NewGender.MALE);
		Person person2 = new Person("Abc", "A", LocalDate.of(1973, 10, 05), NewGender.MALE);
		Person person3 = new Person("Indu", "I", LocalDate.of(1993, 10, 05), NewGender.FEMALE);

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		return persons;
	}

}

// ----------------------------------------------------------------------------------

// util/library to manage users/products/customer

class UtilLib {

	// display
	public static <T> void forEach(List<T> list, Consumer<T> action) {
		for (T item : list) {
			action.accept(item);
		}
	}

	// filter

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {

		List<T> filteredList = new ArrayList<>();
		for (T item : list) {
			if (predicate.test(item)) {
				filteredList.add(item);
			}
		}
		return filteredList;
	}

	// map
	public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
		List<R> mappedList = new ArrayList<>();
		for (T item : list) {
			mappedList.add(mapper.apply(item));
		}
		return mappedList;
	}

}

// ----------------------------------------------------------------------------------

public class FI_Practical_Ex {

	public static void main(String[] args) {

		List<Person> list = Person.getPersons();

		// ----------------------------------------------

		// UtilLib.forEach(list, (item) -> {
		// System.out.println(item.getFirstName());
		// });

		// ----------------------------------------------

		// List<Person> malePersons = null;
		// malePersons = UtilLib.filter(list, item -> item.getGender() ==
		// NewGender.MALE);
		// UtilLib.forEach(malePersons, (item) -> {
		// System.out.println(item.getFirstName());
		// });

		// ----------------------------------------------

		List<String> strings = UtilLib.map(list, item -> item.getFirstName());
		List<LocalDate> dates = UtilLib.map(list, item -> item.getDob());

	}

}
