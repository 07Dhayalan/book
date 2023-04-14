package com.qsp.app.controller;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.qsp.app.dao.BookDAO;
import com.qsp.app.dto.deletebook;
import com.qsp.app.dto.searchbook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/deletebook1")
public class deletebook1 extends HttpServlet {
	BookDAO dao = new BookDAO();
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		String bd= req.getParameter("bookdelete");
		
		int bookid = Integer.getInteger(bd);
		
		deletebook dto = new deletebook(bookid);
		
		try {
			if(dao.delete1(dto))
			{
				pw.println("<h2>Book deleted successful.....<a href='homepage.html'Home</a></h2>");
			}
			else
			{
				pw.println("<h2>Book deleted unsuccessful.....<a href='homepage.html'Home</a></h2>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}


}
