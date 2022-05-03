package com.org.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

@WebServlet("/setnewpassword")
public class SetNewPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		String password = request.getParameter("pass");
		String password1 = request.getParameter("pass1");

		try {
			if (password.equals(password1)) {
				int id = (int) request.getSession().getAttribute("uid");
				session.beginTransaction();

				PreparedStatement stmt = conn.prepareStatement("update Users set password=? where User_Id=?");
				stmt.setString(1, password);
				stmt.setInt(2, id);

				int x = stmt.executeUpdate();

				if (x > 0) {
					out.print("<body style='background-color: yellow;'>");
					out.print("<h2 style='text-align: center;'>Password updated successfully</h2>");
					out.print("<div style='text-align: center;'>");
					out.print("<a href='login.jsp'>Login</a>");
					out.print("</div>");
					out.print("</body>");
				} else {
					out.print("<body style='background-color: yellow;'>");
					out.print("<h2 style='text-align: center;'>Error while updating password</h2>");
					out.print("</body>");
				}

				session.getTransaction().commit();
				session.close();
			} else {
				out.print("<body style='background-color: yellow;'>");
				out.print("<h2 style='text-align: center;'>Password don't match, please try again</h2>");
				out.print("<div style='text-align: center;'>");
				out.print("<a href='setpwd.jsp'>Set Password</a>");
				out.print("</div>");
				out.print("</body>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
