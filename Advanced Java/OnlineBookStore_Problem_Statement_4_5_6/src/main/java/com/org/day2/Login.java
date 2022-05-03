package com.org.day2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String name = request.getParameter("uname");
		String password = request.getParameter("pass");
		int flag = 0;

		List<Users> list = session.createQuery("from Users").list();
		for (Users u : list) {
			if (name.equals(u.getUser_name()) && password.equals(u.getPassword())) {
				flag = 1;
				response.sendRedirect("blist");
				return;
			}
		}

		if (flag == 0) {
			response.sendRedirect("error.jsp");
			return;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
