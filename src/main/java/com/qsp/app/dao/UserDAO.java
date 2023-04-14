package com.qsp.app.dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qsp.app.dto.AddUserDTO;
import com.qsp.app.dto.DeleteDTO;
import com.qsp.app.dto.SearchUserDTO;

import com.qsp.app.util.DataBaseUtil1;
public class UserDAO 
{
	public boolean add(AddUserDTO dto) throws SQLException
	{
		boolean res=true;
		Connection con=DataBaseUtil1.getconnection();
		try
		{
		PreparedStatement pstmt=con.prepareStatement("insert into buser values(?,?,?,?)");
		
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getPassword());
		pstmt.setInt(3, dto.getCno());
		pstmt.setString(4, dto.getEmail());
		
		int norow = pstmt.executeUpdate();
		
		if(norow==1)
		{
			System.out.println("Student added Succesfully....!!!!!!");
		}
		}
         catch(SQLException e)
		{
        	 e.printStackTrace();
        	 res=false;
		}
		return res;
		
	}
	
	public boolean search(SearchUserDTO dto) throws SQLException
	{   
		boolean res=true;
		Connection con = DataBaseUtil1.getconnection();
		try
		{
		PreparedStatement pstmt= con.prepareStatement("select * from buser where contact(?)");
		
		pstmt.setInt(3, dto.getcontactno());
		
		int norow = pstmt.executeUpdate();
		
		if(norow==1)
		{
			System.out.println("Student search is succesfully....!!!!");
		}
	    }
         catch(SQLException e)
	   {
   	      e.printStackTrace();
   	      res=false;
	   }
		
		return res;
	}
	
	public boolean delete1(DeleteDTO dto) throws SQLException
	{
		boolean res=true;
		Connection con = DataBaseUtil1.getconnection();
		try
		{
		PreparedStatement pstmt = con.prepareStatement("delete from buser where contact(?)");
		
        pstmt.setInt(1, dto.getContact());
		
		int norow = pstmt.executeUpdate();
		
		if(norow==1)
		{
			System.out.println("Student search is succesfully....!!!!");
		}
	    }
         catch(SQLException e)
	    {
   	       e.printStackTrace();
   	       res=false;
	     }
		return false;
	}


	

}
