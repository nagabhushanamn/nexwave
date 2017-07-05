package com;

import com.myutil.ArrayList;
import com.myutil.LinkedList;
import com.pm.ProductManager;

public class App {

	public static void main(String[] args) {

		ProductManager pm = new ProductManager();
		pm.manageProducts(new ArrayList());
		pm.manageProducts(new LinkedList());

		
		
	}

}
