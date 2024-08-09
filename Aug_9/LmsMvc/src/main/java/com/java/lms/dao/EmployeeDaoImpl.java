package com.java.lms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.java.lms.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDaoImpl(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}
	
	@Override
	public List<Employee> showEmployeeDao() {
		String cmd = "select * from Employee";
		List<Employee> employList = jdbcTemplate.query(cmd, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("EmpId"));
				employee.setEmpName(rs.getString("EmpName"));
				employee.setEmpEmail(rs.getString("EmpEmail"));
				employee.setMobileNo(rs.getString("MobileNo"));
				employee.setDateOfJoin(rs.getDate("DateOfJoin"));
				employee.setManagerId(rs.getInt("ManagerId"));
				employee.setLeaveAvail(rs.getInt("LeaveAvail"));
				return employee;
			}
			
		});
		return employList;
	}

	@Override
	public Employee searchEmployeeDao(int empId) {
		String cmd = "select * from Employee WHERE EMPID = ?";
		List<Employee> employList = jdbcTemplate.query(cmd, new Object[] {empId}, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("EmpId"));
				employee.setEmpName(rs.getString("EmpName"));
				employee.setEmpEmail(rs.getString("EmpEmail"));
				employee.setMobileNo(rs.getString("MobileNo"));
				employee.setDateOfJoin(rs.getDate("DateOfJoin"));
				employee.setManagerId(rs.getInt("ManagerId"));
				employee.setLeaveAvail(rs.getInt("LeaveAvail"));
				return employee;
			}
			
		});
		return employList.get(0);
	}

}
