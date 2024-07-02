package com.java.jstl;

import java.sql.SQLException;

public interface CustomerDao {
	String addCustomerDao(Customer customer) throws ClassNotFoundException, SQLException;
}
