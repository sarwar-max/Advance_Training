package com.org.day2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/register")
public class Register extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();

			String name = request.getParameter("name");
			String address = request.getParameter("addr");
			String email = request.getParameter("email");
			String username = request.getParameter("uname");
			String password = request.getParameter("pass");
			SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd");
			Calendar calendar = Calendar.getInstance();

			Users u = new Users();
			u.setFirst_name(name);
			u.setAddress(address);
			u.setEmail(email);
			u.setUser_name(username);
			u.setPassword(password);
			u.setRegistration_date(d.format(calendar.getTime()));
			session.save(u);
			session.getTransaction().commit();
			session.close();
			response.sendRedirect("registersuccess.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
