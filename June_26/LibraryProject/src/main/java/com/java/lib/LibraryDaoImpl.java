package com.java.lib;

import java.sql.Connection;
import java.sql.Date;
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

	public int isIssuedOrNot(String user, int bookId) throws ClassNotFoundException, SQLException {
		String cmd = "select count(*) cnt from TranBook where UserName = ? AND bookId = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}
	@Override
	public String issueBook(String user, int bookId) throws ClassNotFoundException, SQLException {
		if (isIssuedOrNot(user, bookId)==1) {
			return "Book with Id " +bookId + " Already issued to You...";
		}
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into TranBook(userName,bookId,fromDate) values(?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		pst.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
		pst.executeUpdate();
		cmd = "Update Books Set TotalBooks = TotalBooks - 1 where Id = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, bookId);
		pst.executeUpdate();
		return "Book with Id " +bookId + " Issued Successfully...";
	}

	@Override
	public List<TranBook> showBooksByUser(String user) throws ClassNotFoundException, SQLException {
		String cmd = "select * from TranBook where UserName = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		ResultSet rs = pst.executeQuery();
		TranBook tranBook = null;
		List<TranBook> listTranBook = new ArrayList<TranBook>();
		while(rs.next()) {
			tranBook = new TranBook();
			tranBook.setBookId(rs.getInt("bookId"));
			tranBook.setUserName(rs.getString("userName"));
			tranBook.setFromDate(rs.getDate("fromDate"));
			listTranBook.add(tranBook);
		}
		return listTranBook;
	}

	@Override
	public String returnBook(String user, int bookId) throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String cmd1 = "select * from TranBook WHERE UserName = ? AND BookID = ?";
		pst = connection.prepareStatement(cmd1);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		Date fromDate = rs.getDate("FromDate");
		String cmd = "Update Books Set TotalBooks = TotalBooks + 1 where Id = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, bookId);
		pst.executeUpdate();
		cmd = "Delete from TranBook where UserName = ? AND BookID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		pst.executeUpdate();
		
		cmd = "Insert into TransReturn(UserName, BookId,FromDate, ToDate) "
				+ " values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setInt(2, bookId);
		pst.setDate(3, fromDate);
		pst.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
		pst.executeUpdate();
		return "Book With Id " +bookId + " From User " +user + " Returned Successfully...";
	}

	@Override
	public List<TransReturn> showReturnedBooks(String user) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from TransReturn Where UserName = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		ResultSet rs = pst.executeQuery();
		TransReturn transReturn = null;
		List<TransReturn> listTrans = new ArrayList<TransReturn>();
		while(rs.next()) {
			transReturn = new TransReturn();
			transReturn.setBookId(rs.getInt("bookId"));
			transReturn.setUserName(rs.getString("userName"));
			transReturn.setFromDate(rs.getDate("fromDate"));
			transReturn.setToDate(rs.getDate("toDate"));
			listTrans.add(transReturn);
		}
		return listTrans;
	}

}
