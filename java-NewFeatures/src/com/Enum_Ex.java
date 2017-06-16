package com;
//

//interface Gender {

//	String MALE = "male";
//	String FEMALE = "female";
//}

enum Gender {

	MALE(11), FEMALE(12);

	private int v;

	Gender(int v) {
		this.setV(v);
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

}

class Employee {
	String name;
	Gender gender; // MALE | FEMALE
}

public class Enum_Ex {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.gender = Gender.FEMALE;

		// -------------------------------------------

		// System.out.println(Gender.MALE.getV());
		// System.out.println(Gender.FEMALE.getV());

		// ---------------------------------------------
		//
		// for (Gender gender : Gender.values()) {
		// System.out.println(gender);
		// }

		// --------------------------------------------------

		Gender gender = Gender.MALE;
		switch (gender) {
		case MALE:

			break;

		default:
			break;
		}
		// ---------------------------------------------------

		Employee emp = new Employee();
		// emp.gender=Gender.valueOf("MALE");

		System.out.println(emp.gender);

	}

}
