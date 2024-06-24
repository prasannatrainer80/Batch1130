package com.java.lib;

public class Books {

	private int id;
	private String name;
	private String author;
	private String edition;
	private String dept;
	private int totalBooks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getTotalBooks() {
		return totalBooks;
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	public Books() {
		// TODO Auto-generated constructor stub
	}
	public Books(int id, String name, String author, String edition, String dept, int totalBooks) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.edition = edition;
		this.dept = dept;
		this.totalBooks = totalBooks;
	}
	
	
}
