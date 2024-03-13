package com.java.jsp;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerCity;
	private String customerState;
	private double customerBill;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerState() {
		return customerState;
	}
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}
	public double getCustomerBill() {
		return customerBill;
	}
	public void setCustomerBill(double customerBill) {
		this.customerBill = customerBill;
	}
	public Customer() {

	}
	public Customer(int customerId, String customerName, String customerCity, String customerState,
			double customerBill) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerBill = customerBill;
	}
	
	
}
