package com.qsp.app.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import com.qsp.app.dao.BookDAO;
import com.qsp.app.dto.searchbook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/searchbook")
public class searchbook1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDAO dao =new BookDAO();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		String bs= req.getParameter("booksearch");
		
		int booksearch = Integer.parseInt(bs);
		
		searchbook dto = new searchbook(booksearch);
		
		try {
			if(dao.search(dto))
			{
				pw.println("<h2>Book founded successful.....<a href='homepage.html'Home</a></h2>");
			}
			else
			{
				pw.println("<h2>Book founded unsuccessful.....<a href='homepage.html'Home</a></h2>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
