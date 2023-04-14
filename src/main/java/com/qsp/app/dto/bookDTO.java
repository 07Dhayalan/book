package com.qsp.app.dto;

public class bookDTO 
{
	int Bid;
	String Bname;
	String author;
	int price;
	int Quantity;
	
	public bookDTO(int bid, String bname, String author, int price, int quantity) {
		super();
		Bid = bid;
		Bname = bname;
		this.author = author;
		this.price = price;
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
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	

}
