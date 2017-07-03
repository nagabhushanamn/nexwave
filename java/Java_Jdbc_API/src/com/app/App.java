package com.app;

import java.util.Date;
import java.util.List;

import com.app.dao.ProductDAO;
import com.app.model.Product;
import com.app.model.ProductType;

public class App {

	public static void main(String[] args) {

		ProductDAO productDAO = new ProductDAO();

		// Product product = new Product();
		// product.setName("Mobile");
		// product.setPrice(18000.00);
		// product.setMakeDate(new Date());
		// product.setType(ProductType.ELEC);
		// product.setDescription("New Mac pro");
		//
		// productDAO.save(product);

		// -------------------------------------------

		// productDAO.update(1,80000.00);

		// --------------------------------------------
		//
		// Product product = productDAO.find(2);
		// System.out.println(product);

		// ---------------------------------------------

		// List<Product> products = productDAO.findAll();
		// for (Product product : products) {
		// System.out.println(product);
		// }

		// -------------------------------------------------

		productDAO.delete(2);
		System.out.println("deleted..");

	}

}
