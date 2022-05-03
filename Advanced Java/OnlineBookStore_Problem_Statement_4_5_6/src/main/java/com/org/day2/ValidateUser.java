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

@WebServlet("/validateuser")
public class ValidateUser<SessionFactory, Session> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String email = request.getParameter("email");
		String username = request.getParameter("uname");

		int flag = 0;

		List<Users> list = session.createQuery("from Users").list();
		for (Users u : list) {
			if (email.equals(u.getEmail()) && username.equals(u.getUser_name())) {
				flag = 1;
				request.getSession().setAttribute("uid", u.getUser_Id());
				response.sendRedirect("setpwd.jsp");
				return;
			}
		}

		if (flag == 0) {
			response.sendRedirect("err.jsp");
			return;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
