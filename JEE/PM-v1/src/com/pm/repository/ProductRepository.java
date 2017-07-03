package com.pm.repository;

import java.util.List;

import com.pm.model.Product;

public interface ProductRepository {

	void save(Product product);

	void update(Product product);

	Product find(int id);

	List<Product> findAll();

	void delete(int id);

}
