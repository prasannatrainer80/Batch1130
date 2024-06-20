package com.java.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankDaoImpl implements BankDao {

	Connection connection;
	PreparedStatement pst;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) IS NULL THEN 1"
				+ " else max(accountNo)+1 end accno from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
	
	@Override
	public String createAccount(Bank bank) throws ClassNotFoundException, SQLException {
		int accno = generateAccountNo();
		bank.setAccountNo(accno);
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Bank(AccountNo, FirstName, LastName, City, State, Amount, CheqFacil, "
				+ "AccountType) values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, bank.getAccountNo());
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setDouble(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Hi " +bank.getFirstName() + " Your Account Created with Account No " +bank.getAccountNo();
	}

	@Override
	public Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Bank where AccountNo = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank = null;
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getDouble("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("accountType"));
			bank.setStatus(rs.getString("status"));
			bank.setDateOfOpen(rs.getDate("dateofOpen"));
		}
		return bank;
	}

	@Override
	public String updateAccount(int accountNo, String city, String state) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank==null) {
			return "Account No Not Found...";
		}
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Bank set city = ?, State = ? Where AccountNo = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, city);
		pst.setString(2, state);
		pst.setInt(3, accountNo);
		pst.executeUpdate();
		return "Account Details are Updated...";
	}

	@Override
	public String closeAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank==null) {
			return "Account No Not Found...";
		}
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Bank set status='inactive' Where AccountNo = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.executeUpdate();
		return "Your Account Closed...";
	}

	@Override
	public String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank==null) {
			return "Account No Not Found...";
		}
		if (bank.getStatus().toUpperCase().equals("INACTIVE")) {
			return "Account Closed No Transactions happens...";
		}
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Bank set Amount = Amount + ? Where AccountNo = ?";
		pst = connection.prepareStatement(cmd);
		pst.setDouble(1, depositAmount);
		pst.setInt(2, accountNo);
		pst.executeUpdate();
		cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setDouble(2, depositAmount);
		pst.setString(3, "C");
		pst.executeUpdate();
		return "Amount Credited...";
	}

	@Override
	public String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank==null) {
			return "Account No Not Found...";
		}
		if (bank.getStatus().toUpperCase().equals("INACTIVE")) {
			return "Account Closed No Transactions happens...";
		}
		if (bank.getAmount() - withdrawAmount < 1000) {
			return "Insufficient Funds...";
		}
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Bank set Amount = Amount - ? Where AccountNo = ?";
		pst = connection.prepareStatement(cmd);
		pst.setDouble(1, withdrawAmount);
		pst.setInt(2, accountNo);
		pst.executeUpdate();
		cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setDouble(2, withdrawAmount);
		pst.setString(3, "D");
		pst.executeUpdate();
		return "Amount Debited...";
		
	}

	@Override
	public List<Trans> miniStatement(int accountNo) throws ClassNotFoundException, SQLException {
		String cmd = "select * from trans WHERE accountNo=? order by transdate desc";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Trans trans = null;
		List<Trans> transList = new ArrayList<Trans>();
		while(rs.next()) {
			trans = new Trans();
			trans.setAccountNo(rs.getInt("accountNo"));
			trans.setTransAmount(rs.getDouble("TransAmount"));
			trans.setTransDate(rs.getDate("TransDate"));
			trans.setTransType(rs.getString("transType"));
			transList.add(trans);
		}
		return transList;
	}

}
