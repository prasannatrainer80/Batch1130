package com.java.spr;

public class Product {

	private String productName;
	private int quantityAvail;
	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", quantityAvail=" + quantityAvail + "]";
	}

	
}
