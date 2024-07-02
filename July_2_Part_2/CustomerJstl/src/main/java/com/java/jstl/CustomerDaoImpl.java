package com.java.jstl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {

	Connection connection;
	PreparedStatement pst;
	
	public int getCustomerId() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Customer";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		int custId=0;
		while(rs.next()) {
			custId = rs.getInt("custId");
		}
		return custId;
	}
	@Override
	public String addCustomerDao(Customer customer) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		customer.setCustStatus(1);
		String otp = OtpGen.genrateOtp();
		String cmd = "Insert into Customer(CustName,CustUserName,CustEmail,custPhoneNo,CustStatus) "
				+ "values(?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, customer.getCustName());
		pst.setString(2, customer.getCustUserName());
		pst.setString(3, customer.getCustEmail());
		pst.setString(4, customer.getCustPhoneNo());
		pst.setInt(5, customer.getCustStatus());
		pst.executeUpdate();
		int custId = getCustomerId();
		cmd = "Insert into OTP(CustID,OtpCode,OtpPurpose) values(?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, custId);
		pst.setString(2, otp);
		pst.setString(3,"Creating Account Purpose");
		pst.executeUpdate();
		String body = "Your Otp Generated for Password Creation..." +otp;
		SendMail.mail(customer.getCustEmail(), "Otp for Password Creation", body);
		return "Account Created and shared Otp By Email...";
	}

}
