package com.java.bank;

import java.sql.Date;

public class Trans {

	private int accountNo;
	private double transAmount;
	private Date transDate;
	private String transType;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public Trans() {
		// TODO Auto-generated constructor stub
	}
	public Trans(int accountNo, double transAmount, Date transDate, String transType) {
		this.accountNo = accountNo;
		this.transAmount = transAmount;
		this.transDate = transDate;
		this.transType = transType;
	}
	@Override
	public String toString() {
		return "Trans [accountNo=" + accountNo + ", transAmount=" + transAmount + ", transDate=" + transDate
				+ ", transType=" + transType + "]";
	}
	
	
}
