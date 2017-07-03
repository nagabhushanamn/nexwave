package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/hello" })
public class HelloServlet extends HttpServlet {

	// @Override
	// public void init(ServletConfig arg0) throws ServletException {
	// System.out.println("HelloServlet :: init()");
	// }

	// @Override
	// public void service(ServletRequest arg0, ServletResponse arg1) throws
	// ServletException, IOException {
	// System.out.println("HelloServlet :: service()");
	// }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Input
		String name = req.getParameter("userName");

		// Process
		String message = " hello " + name + " Welcome to jungle";

		req.setAttribute("msg", message);

		// Output
		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);

	}

	// @Override
	// public void destroy() {
	// System.out.println("HelloServlet :: destroy()");
	// }
	//
	// @Override
	// public ServletConfig getServletConfig() {
	// return null;
	// }
	//
	// @Override
	// public String getServletInfo() {
	// return null;
	// }

}
