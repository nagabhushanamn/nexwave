package com.app.serv;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Dog;
import com.app.model.Person;

/**
 * Servlet implementation class PersonController
 */
@WebServlet("/person-det")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// load person det from db
		Person person = new Person();
		person.setId(123);
		person.setName("Nag");
		person.setAge(33);

		Dog dog = new Dog();
		dog.setName("puppy");

		person.setDog(dog);

		request.setAttribute("person", person);
		request.getRequestDispatcher("person-det.jsp").forward(request, response);
	}

}
