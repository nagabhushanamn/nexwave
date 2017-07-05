package com.pm.web;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pm.model.Product;
import com.pm.model.ProductType;
import com.pm.repository.HibProductRepositoryImpl;
import com.pm.repository.ProductRepository;

@WebServlet(urlPatterns = { "/pm", "/save-product", "/delete-product" })
public class ProductController extends HttpServlet {

	private ProductRepository productRepo;

	@Override
	public void init(ServletConfig config) throws ServletException {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		productRepo = new HibProductRepositoryImpl(sessionFactory);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	} 

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String reqPath = req.getRequestURI();
		String path = reqPath.substring(reqPath.lastIndexOf("/"));

		RequestDispatcher rd = null;

		if (path.equals("/pm")) {
			List<Product> products = productRepo.findAll();
			req.setAttribute("allProducts", products);
			rd = req.getRequestDispatcher("pm.jsp");
			rd.forward(req, resp);
		}

		if (path.equals("/delete-product")) {
			productRepo.delete(Integer.parseInt(req.getParameter("id")));
			resp.sendRedirect("pm");
		}

		if (path.equals("/save-product")) {

			//
			String name = req.getParameter("name");
			String price = req.getParameter("price");
			String type = req.getParameter("type");
			String makeDate = req.getParameter("makeDate");
			String description = req.getParameter("description");

			// Input Conversion & Validation

			// map req-params to model-object

			Product product = new Product();
			product.setName(name);
			product.setPrice(Double.parseDouble(price));
			product.setType(ProductType.valueOf(type));
			product.setDescription(description);

			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

			try {
				System.out.println(df.parse(makeDate));
				product.setMakeDate(df.parse(makeDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			productRepo.save(product);

			// rd = req.getRequestDispatcher("pm.jsp");
			// rd.forward(req, resp);

			resp.sendRedirect("pm");

		}

	}

	@Override
	public void destroy() {
	}

}
