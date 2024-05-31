package com.java.bank;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MiniStatement {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No   ");
		accountNo = sc.nextInt();
		BankDao dao = new BankDaoImpl();
		try {
			List<Trans> transList = dao.miniStatement(accountNo);
			for (Trans trans : transList) {
				System.out.println(trans);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
