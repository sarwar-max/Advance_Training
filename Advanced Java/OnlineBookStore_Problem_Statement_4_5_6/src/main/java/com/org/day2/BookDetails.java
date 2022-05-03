package com.org.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

@WebServlet("/details")
public class BookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();

		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");

		try {

			PreparedStatement stmt = conn.prepareStatement("select * from Books where Book_Id=?");
			stmt.setInt(1, Integer.parseInt(id));
			ResultSet result = stmt.executeQuery();

			out.print("<body style='background-color: yellow;'>");
			out.print("<h1 style='text-align: center;'>SHOPPING CART FOR BOOK SHOP</h1>");
			out.print("<h3 style='text-align: center;'>Selected Book Details are displayed</h3>");
			while (result.next()) {
				out.print("<div style='text-align: center;'>");
				out.print("Book Id: " + result.getInt(1) + "<br>");
				out.print("Book Name: " + result.getString(2) + "<br>");
				out.print("Author: " + result.getString(3) + "<br>");
				out.print("Price: " + result.getBigDecimal(4) + "<br>");
				out.print("<form action='confirmorder' method='post'>");
				out.print("Enter Quantity:" + "<input type='text' name='quantity'><br>");
				out.print("<input type='submit' value='Submit'/><br>");
				out.print("<a href='blist'>Cancel</a>");
				out.print("</div>");

			}
			out.print("</body>");

			request.getSession().setAttribute("bid", id);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
