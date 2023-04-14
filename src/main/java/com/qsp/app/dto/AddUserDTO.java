package com.qsp.app.dto;

public class AddUserDTO 
{
	String name;
	String email;
	int cno;
	String password;
	
	
	public AddUserDTO()
	{
		
	}
	
	public AddUserDTO(String name,String password , int cno,String email) {
		super();
		this.name = name;
		this.password = password;
		this.cno = cno;
		this.email = email;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
