package com.java.jstl;

public class Customer {

	private int custId;
	private String custName;
	private String custUserName;
	private String custPassword;
	private String custEmail;
	private String custPhoneNo;
	private int custStatus;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustUserName() {
		return custUserName;
	}
	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPhoneNo() {
		return custPhoneNo;
	}
	public void setCustPhoneNo(String custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}
	public int getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(int custStatus) {
		this.custStatus = custStatus;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String custUserName, String custPassword, String custEmail,
			String custPhoneNo, int custStatus) {
		this.custId = custId;
		this.custName = custName;
		this.custUserName = custUserName;
		this.custPassword = custPassword;
		this.custEmail = custEmail;
		this.custPhoneNo = custPhoneNo;
		this.custStatus = custStatus;
	}
	
	
}
