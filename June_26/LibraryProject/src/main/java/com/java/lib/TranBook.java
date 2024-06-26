package com.java.lib;

import java.sql.Date;

public class TranBook {

	private String userName;
	private int bookId;
	private Date fromDate;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public TranBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TranBook(String userName, int bookId, Date fromDate) {
		this.userName = userName;
		this.bookId = bookId;
		this.fromDate = fromDate;
	}
	@Override
	public String toString() {
		return "TranBook [userName=" + userName + ", bookId=" + bookId + ", fromDate=" + fromDate + "]";
	}
	
	
}
