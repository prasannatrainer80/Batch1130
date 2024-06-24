package com.java.lib;

import java.sql.SQLException;
import java.util.List;

public interface LibraryDao {
	String createUser(LibUsers libUsers) throws ClassNotFoundException, SQLException;
	int authenticateUser(String userName, String passCode) throws ClassNotFoundException, SQLException;
	List<Books> showBooks(String type, String value) throws ClassNotFoundException, SQLException;
}
