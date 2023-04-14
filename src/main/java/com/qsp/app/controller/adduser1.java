package com.qsp.app.controller;

import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.qsp.app.dao.UserDAO;
import com.qsp.app.dto.AddUserDTO;




@WebServlet("/adduser1")
public class adduser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAO dao = new UserDAO();
 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("Username");
		String password=req.getParameter("Password");	
		String cno=req.getParameter("Contact no");
		String email=req.getParameter("Email");
		
		
		int contact = Integer.parseInt(cno);
		
		AddUserDTO dto = new AddUserDTO(name,password,contact,email);
		
		try {
			if(dao.add(dto))
			{
				pw.println("<h2>Register successful.....<a href='homepage.html'Home</a></h2>");
			}
			else
			{
				pw.println("<h2>Register unsuccessful.....<a href='homepage.html'Home</a></h2>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
