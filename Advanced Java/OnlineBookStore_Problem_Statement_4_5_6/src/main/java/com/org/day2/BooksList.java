package com.org.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/blist")
public class BooksList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		PrintWriter out = response.getWriter();
		List<Books> list = session.createQuery("from Books").list();

		out.print("<head>");
		out.print("<style>");

		out.print("table, th, td {border: 1px solid black; border-collapse: collapse;}");
		out.print("table.center {margin-left: auto; margin-right: auto;}");

		out.print("</style>");
		out.print("</head>");
		out.print("<body style='background-color: yellow;'>");
		out.print("<h1 style='text-align: center;'>SHOPPING CART FOR ONLINE BOOK SHOPS</h1>");
		out.print("<h3 style='text-align: center;'>LIST OF BOOKS</h3>");
		out.println("<table class='center'>");
		out.println("<tr><th>Book Id</th><th>Book Name</th><th>Author</th><th>Price</th><tr>");
		for (Books b : list) {
			out.print("<tr>");
			out.print("<td>" + "<a href='details?id=" + b.getBook_Id() + "'>" + b.getBook_Id() + "</a>" + "</td>");
			out.print("<td>" + b.getBook_Name() + "</td>");
			out.print("<td>" + b.getAuthor() + "</td>");
			out.print("<td>" + b.getPrice() + "</td>");
		}
		out.print("</table>");
		out.print("<br><br><div style='text-align: center;'>");
		out.print("<a href='logout'>Logout</a>");
		out.print("</div>");
		out.print("</body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
