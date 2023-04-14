package com.qsp.app.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.qsp.app.dto.addbook;
import com.qsp.app.dto.deletebook;

import com.qsp.app.dto.searchbook;
import com.qsp.app.util.DataBaseUtil1;

public class BookDAO 
{
	public boolean add(addbook dto) throws SQLException
	{
		boolean res=true;
		Connection con=DataBaseUtil1.getconnection();
		try
		{
		PreparedStatement pstmt=con.prepareStatement("insert into book values(?,?,?,?)");
		
		pstmt.setInt(1, dto.getBid());
		pstmt.setString(2, dto.getBname());
		pstmt.setString(3, dto.getAuthor());
		pstmt.setDouble(4, dto.getPrice());
		pstmt.setInt(1, dto.getQuantity());
		
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
	public boolean search(searchbook dto) throws SQLException
	{   
		boolean res=true;
		Connection con = DataBaseUtil1.getconnection();
		try
		{
		PreparedStatement pstmt= con.prepareStatement("select * from book where Bid(?)");
		
		pstmt.setInt(1, dto.getBid());
		
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
	   
		return false;
	}
		
		return res;
	}
	
	public boolean delete1(deletebook dto) throws SQLException
	{
		boolean res=true;
		Connection con = DataBaseUtil1.getconnection();
		try
		{
		PreparedStatement pstmt = con.prepareStatement("delete from book where Bid(?)");
		
        pstmt.setInt(1, dto.getBid());
		
		int norow = pstmt.executeUpdate();
		
		if(norow==1)
		{
			System.out.println("Student delete is succesfully....!!!!");
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
	


