package com.nexwave.hr;

import com.nexwave.emp.Employee;

public class HR {

	public static void manageEmployees() {

		// create employees

		Employee.tnrName = "Nag";

		Employee e1 = new Employee();
		e1.id = 123;
		e1.name = "A";

		Employee e2 = new Employee();
		e2.id = 124;
		e2.name = "B";

		// doTrain
		Employee.doTrain();

		// doListen & get work..
		e1.doListenAndWork();
		e2.doListenAndWork();

	}

}
