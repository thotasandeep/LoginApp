  package com.sample.servlet;

im port java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.bean.User;
import com.sample.dao.UserDao;
import com.sample.dao.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	UserDao dao = new UserDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");

		User user = new User(uname, password);
		boolean valid = dao.validateUser(user);

		if (valid) {
			System.out.println("success");
			RequestDispatcher view = request.getRequestDispatcher("homepage.jsp");
			view.forward(request, response);

		} else {
			System.out.println("Invalid credentials");
			request.setAttribute("message",
					            "Please try again !! Your credentials are invalid!!");
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
			// response.sendRedirect("login.html");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("In doPost()");
		doGet(request, response);
	}

}
