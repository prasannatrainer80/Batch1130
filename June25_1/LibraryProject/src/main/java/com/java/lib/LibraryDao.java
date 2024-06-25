package com.java.lib;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDao {
	String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException;
	int authenticateUser(String userName, String passCode) throws ClassNotFoundException, SQLException;
	List<Books> showBooks(String type, String value) throws ClassNotFoundException, SQLException;
	String issueBook(String user, int bookId) throws ClassNotFoundException, SQLException;
	List<TranBook> showBooksByUser(String user) throws ClassNotFoundException, SQLException;
	String returnBook(String user, int bookId) throws SQLException, ClassNotFoundException;
	List<TransReturn> showReturnedBooks(String user) throws ClassNotFoundException, SQLException;
}
