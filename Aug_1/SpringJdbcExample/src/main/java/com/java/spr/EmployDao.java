package com.java.spr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String updateEmployDao(Employ employUpdated) {
		String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? Where Empno = ?";
		jdbcTemplate.update(cmd, new Object[] { employUpdated.getName(), employUpdated.getGender(), 
				employUpdated.getDept(), employUpdated.getDesig(), employUpdated.getBasic(),
				employUpdated.getEmpno()
			});
	return "Employ Record Updated...";
	}
	
	public String addEmployDao(Employ employ) {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {employ.getEmpno(), employ.getName(), employ.getGender(), 
					employ.getDept(), employ.getDesig(), employ.getBasic()
				});
		return "Employ Record Inserted...";
	}
	
	public String deleteEmployDao(int empno) {
		String cmd = "Delete From Employ Where Empno = ?";
		jdbcTemplate.update(cmd, new Object[] {empno});
		return "Employ Record Deleted...";
	}
	public Employ searchEmployDao(int empno) {
		List<Employ> employList = null;
		employList = jdbcTemplate.query("select * from Employ where empno = ?", new Object[] {empno}, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});

		if (employList.size() ==1) {
			return employList.get(0);
		} 
		return null;
	}
	
	public List<Employ> showEmployDao() {
		List<Employ> employList = null;
		employList = jdbcTemplate.query("select * from Employ", new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setGender(rs.getString("gender"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getDouble("basic"));
				return employ;
			}
		});
		return employList;
	}
}
