package com.java.lib;

import java.sql.Date;

public class TransReturn {

	private String userName;
	private int bookId;
	private Date fromDate;
	private Date toDate;
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
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "TransReturn [userName=" + userName + ", bookId=" + bookId + ", fromDate=" + fromDate + ", toDate="
				+ toDate + "]";
	}
	public TransReturn() {
		// TODO Auto-generated constructor stub
	}
	public TransReturn(String userName, int bookId, Date fromDate, Date toDate) {
		this.userName = userName;
		this.bookId = bookId;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	
}
