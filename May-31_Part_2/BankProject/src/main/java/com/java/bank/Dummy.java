package com.java.bank;

import java.sql.SQLException;

public class Dummy {

	public static void main(String[] args) {
		BankDaoImpl dao = new BankDaoImpl();
		try {
			System.out.println(dao.generateAccountNo());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
