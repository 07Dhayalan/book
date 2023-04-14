package com.qsp.app.controller;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.PrintWriter;
import java.sql.SQLException;

import com.qsp.app.dao.UserDAO;
import com.qsp.app.dto.SearchUserDTO;


@WebServlet("/SearchUser")
public class SearchUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO dao=new UserDAO();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("Username");
		int username = Integer.parseInt(name);
		
		SearchUserDTO dto = new SearchUserDTO(username);
		
		try {
			
			if(dao.search(dto))
			{
				pw.println("<h2>User identified successful.....<a href='homepage.html'Home</a></h2>");
			}
			else
			{
				pw.println("<h2>User unidentified unsuccessful.....<a href='homepage.html'Home</a></h2>");
			}
		 
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	}


}
