package com;

import java.sql.Connection;
import java.sql.SQLException;

class ConnectionPool {
	public static Connection getConnection(String url, String user, String password) throws Exception {
		// ...
		throw new SQLException();
	}
}

// --------------------------------------------------

// Data-layer ==> persisting

class ProductDAO {
	public String find(int id) {

		try {
			ConnectionPool.getConnection("", "", "");
		} catch (Exception e) {
			return "Connection Failed";
		}

		int v = 1;
		if (v == 3)
			throw new RuntimeException();
		return "laptop";
	}
}

// Service-layer ==> processing
class ProductService {
	public String service1(int id) {
		return new ProductDAO().find(id);
	}
}

// Web-layer ==> interact with HTTP class
class ProductController {
	public String get(int id) {
		try {
			return new ProductService().service1(id);
		} catch (Exception e) {
			return "No product";
		}
	}
}

// ---------------------------------------------------

public class Ex3 {

	public static void main(String[] args) {

		ProductController controller = new ProductController();
		System.out.println(controller.get(123));

	}

}
