package com.qsp.app.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.PrintWriter;
import java.sql.SQLException;

import com.qsp.app.dao.BookDAO;
import com.qsp.app.dto.addbook;

@WebServlet("/addbook1")
public class addbook1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDAO dao= new BookDAO();
  

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter pw =  resp.getWriter();
		String bookid=req.getParameter("Bid");
		String bookname=req.getParameter("Bname");
		String bookauthor=req.getParameter("Author");
		String bookprice=req.getParameter("Price");
		String bookQuantity=req.getParameter("Quantity");
		
		int bid = Integer.parseInt(bookid);
		double bprice = Double.parseDouble(bookprice);
		int bquantity = Integer.parseInt(bookQuantity);
		
		addbook dto = new addbook(bid,bookname,bookauthor,bprice,bquantity);
		
		try {
			if(dao.add(dto))
			{
				pw.println("<h2>Register successful.....<a href=' homepage.html'Home</a></h2>");
			}
			else
			{
				pw.println("<h2>Register successful.....<a href='homepage.html'Home</a></h2>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
