package com.java.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountNo;
		double depositAmount;
		System.out.println("Enter Account No ");
		accountNo = sc.nextInt();
		System.out.println("Enter Deposit Amount  ");
		depositAmount = sc.nextDouble();
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.depositAccount(accountNo, depositAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
