package com.java.lib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryDaoImpl implements LibraryDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException {
		String encrCode = EncryptPassword.getCode(libUsers.getPassWord());
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into LibUsers(UserName, Password) values(?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, libUsers.getUserName());
		pst.setString(2, encrCode);
		pst.executeUpdate();
		return "User Account Created Successfully...";
	}

	@Override
	public int authenticateUser(String userName, String passCode) throws ClassNotFoundException, SQLException {
		String encrCode = EncryptPassword.getCode(passCode);
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from LibUsers Where UserName = ? AND Password = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, userName);
		pst.setString(2, encrCode);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		return cnt;
	}

	@Override
	public List<Books> showBooks(String type, String value) throws ClassNotFoundException, SQLException {
		boolean flag = true;
		String cmd = "";
		if (type.equals("id")) {
			cmd = "select * from Books where id = ?";
		} else if(type.equals("bookname")) {
			cmd = "select * from Books Where Name = ?";
		} else if (type.equals("dept")) {
			cmd = "select * from Books where dept = ?";
		} else if (type.equals("authorname")) {
			cmd = "select * from Books where author = ?";
		} else {
			flag = false;
			cmd = "select * from Books";
		}
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		if (flag==true) {
			pst.setString(1, value);
		}
		ResultSet rs = pst.executeQuery();
		List<Books> booksList = new ArrayList<Books>();
		Books books = null;
		while(rs.next()) {
			books = new Books();
			books.setId(rs.getInt("id"));
			books.setName(rs.getString("name"));
			books.setDept(rs.getString("dept"));
			books.setAuthor(rs.getString("author"));
			books.setEdition(rs.getString("edition"));
			books.setTotalBooks(rs.getInt("totalBooks"));
			booksList.add(books);
		}
		return booksList;
	}

}
