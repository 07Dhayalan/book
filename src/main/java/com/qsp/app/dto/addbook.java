package com.qsp.app.dto;

public class addbook 
{
	int Bid;
	String Bname;
	String Author;
	double Price;
	int Quantity;
	
	addbook()
	{
		
	}
	
	public addbook(int bid, String bname, String author, double price, int quantity) {
		super();
		Bid = bid;
		Bname = bname;
		Author = author;
		Price = price;
		Quantity = quantity;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
    
	
	

}
