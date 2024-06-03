package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Employee> showEmployee() throws ClassNotFoundException, SQLException {
		String cmd = "select * from EMPLOYEE";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException {
		String cmd = "select * from Employee WHERE Emp_ID = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		if (rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
		}
		return employee;
	}

	
}
