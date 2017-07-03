package com.app.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.db.DBConnectionFactory;
import com.app.model.Product;

public class ProductDAO {

	public void save(Product product) {
		Connection connection = null;
		try {
			connection = DBConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "insert into pm.PRODUCTS(name,price,makeDate,type,description) values (?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, product.getName());
			ps.setDouble(2, product.getPrice());
			ps.setDate(3, new Date(product.getMakeDate().getTime()));
			ps.setInt(4, product.getType().ordinal());
			ps.setString(5, product.getDescription());

			// 4. execute statement
			int count = ps.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void update(int id, double price) {
		Connection connection = null;
		try {
			connection = DBConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "update pm.PRODUCTS set price=? where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setDouble(1, price);
			ps.setInt(2, id);

			// 4. execute statement
			int count = ps.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public Product find(int id) {
		Connection connection = null;
		Product product = null;
		try {
			connection = DBConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "select * from pm.PRODUCTS where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setMakeDate(rs.getDate(4));
				// product.setType();
				product.setDescription(rs.getString(6));
			}

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return product;

	}

	public List<Product> findAll() {
		Connection connection = null;
		List<Product> products = new ArrayList<Product>();
		try {
			connection = DBConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "select * from pm.PRODUCTS";
			PreparedStatement ps = connection.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setMakeDate(rs.getDate(4));
				// product.setType();
				product.setDescription(rs.getString(6));

				products.add(product);
			}

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return products;

	}

	public void delete(int id) {
		Connection connection = null;
		try {
			connection = DBConnectionFactory.getConnection();
			connection.setAutoCommit(false);

			// 3. create JDBC statements with SQL
			String sql = "delete from pm.PRODUCTS where id=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);

			// 4. execute statement
			int count = ps.executeUpdate();

			connection.commit();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
