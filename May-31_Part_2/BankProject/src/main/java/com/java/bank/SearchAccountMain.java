package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No    ");
		accountNo = sc.nextInt();
		BankDao dao = new BankDaoImpl();
		try {
			Bank bank = dao.searchAccount(accountNo);
			if (bank!=null) {
				System.out.println(bank);
			} else {
				System.out.println("Account No Not Found...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
