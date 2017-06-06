package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 *  Rules for Anonymous Inner class
 *  
 *  --> No Name
 *  --> Must implement/Extend
 *  --> we can create only one instance
 *  --> create instance then define class
 *  
 *  
 *  use :
 *  
 *    --> to create functional instances in .java-lang
 * 
 */

class Work implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}

public class AnonmousInnerClass_Learn {

	public static void main(String[] args) {

		Work work = new Work();
		Thread thread = new Thread(work);

		// ------------------------------------------

		Runnable r = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		};
		Thread thread2 = new Thread(r);

		// --------------------------------------------

		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

			}
		});

		// ------------------------------------------------

		ArrayList<String> items = new ArrayList<>();
		items.add("idly");
		items.add("vada");

		Collections.sort(items, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});

		// ------------------------------------------------

		Runnable runnable = () -> {
		};
		Comparator<String> comparator = (o1, o2) -> {
			return o1.compareTo(o2);
		};

		// ------------------------------------------------------------------

	}

}
