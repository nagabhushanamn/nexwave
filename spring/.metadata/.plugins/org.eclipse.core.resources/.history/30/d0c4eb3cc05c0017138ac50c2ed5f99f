package com.mts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mts.service.TxrService;

@WebServlet(urlPatterns = { "/txr" })
public class TxrController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fromAccNum = request.getParameter("fromAccNum");
		String toAccNum = request.getParameter("toAccNum");
		String amount = request.getParameter("amount");

		WebApplicationContext context = null;
		context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);

		PrintWriter out=response.getWriter();
		out.print("Txr success");

	}

}
