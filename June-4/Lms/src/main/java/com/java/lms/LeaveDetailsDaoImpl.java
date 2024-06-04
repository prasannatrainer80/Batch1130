package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveDetailsDaoImpl implements LeaveDetailsDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public String applyLeaveDao(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException {
		java.util.Date d1 = new java.util.Date(leaveDetails.getLeaveStartDate().getTime());
		java.util.Date d2 = new java.util.Date(leaveDetails.getLeaveEndDate().getTime());
		
		Date today = new Date();
		
		long dif1 = (d1.getTime() - today.getTime())/(1000 * 60 * 60 * 24);
		int diff1 = (int)dif1;
		System.out.println(diff1);
		
		long dif2 = (d2.getTime() - today.getTime())/(1000 * 60 * 60 * 24);
		int diff2 = (int)dif2;
		System.out.println(diff2);
		long days = (d2.getTime() - d1.getTime())/(1000 * 60 * 60 * 24);
		days++;
		System.out.println(days);
		int noOfDays = (int)days;
		
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee employee = dao.searchEmployee(leaveDetails.getEmpId());
		int leaveAvail = employee.getEmpAvailBal();
		int di = leaveAvail - noOfDays;
		
		if (diff1 < 0) {
			return "Leave StartDate Cannot be Yesterday's Date...";
		} else if (diff2 < 0) {
			return "Leave EndDate Cannot be Yesterday's Date...";
		} else if (days < 0) {
			return "Leave StartDate Cannot be Greater Than Leave End Date...";
		} else if (di < 0) {
			return "Insufficient Leave Balance...";
		}
		
		String cmd = "Insert into Leave_History(Emp_Id,LEAVE_START_DATE,LEAVE_END_DATE,"
				+ "LEAVE_NO_OF_DAYS,LEAVE_TYPE,LEAVE_STATUS,LEAVE_REASON) values(?,?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveDetails.getEmpId());
		pst.setDate(2, leaveDetails.getLeaveStartDate());
		pst.setDate(3, leaveDetails.getLeaveEndDate());
		pst.setInt(4, noOfDays);
		pst.setString(5, leaveDetails.getLeaveType());
		pst.setString(6, "PENDING");
		pst.setString(7, leaveDetails.getLeaveReason());
		pst.executeUpdate();
		cmd = "Update employee set EMP_AVAIL_LEAVE_BAL = EMP_AVAIL_LEAVE_BAL - ? Where EMP_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, noOfDays);
		pst.setInt(2, leaveDetails.getEmpId());
		pst.executeUpdate();
		return "Leave Applied Successfully...";
	}

	@Override
	public List<LeaveDetails> showLeaveHistory(int empId) throws SQLException, ClassNotFoundException {
		String cmd = "select * from leave_history WHERE EMP_ID = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		LeaveDetails leaveDetails = null;
		List<LeaveDetails> listDetails = new ArrayList<LeaveDetails>();
		while(rs.next()) {
			leaveDetails = new LeaveDetails();
			leaveDetails.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveDetails.setEmpId(rs.getInt("EMP_ID"));
			leaveDetails.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveDetails.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveDetails.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveDetails.setLeaveType(rs.getString("LEAVE_TYPE"));
			leaveDetails.setLeaveStatus(rs.getString("LEAVE_STATUS"));
			leaveDetails.setLeaveReason(rs.getString("LEAVE_REASON"));
			leaveDetails.setManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			listDetails.add(leaveDetails);
		}
		return listDetails;
	}

	@Override
	public List<LeaveDetails> showPendingLeaves(int empId) throws ClassNotFoundException, SQLException {
		String cmd = "select * from leave_history WHERE EMP_ID = ? AND LEAVE_STATUS='PENDING'";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		LeaveDetails leaveDetails = null;
		List<LeaveDetails> listDetails = new ArrayList<LeaveDetails>();
		while(rs.next()) {
			leaveDetails = new LeaveDetails();
			leaveDetails.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveDetails.setEmpId(rs.getInt("EMP_ID"));
			leaveDetails.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveDetails.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveDetails.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveDetails.setLeaveType(rs.getString("LEAVE_TYPE"));
			leaveDetails.setLeaveStatus(rs.getString("LEAVE_STATUS"));
			leaveDetails.setLeaveReason(rs.getString("LEAVE_REASON"));
			leaveDetails.setManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			listDetails.add(leaveDetails);
		}
		return listDetails;
	}

	@Override
	public LeaveDetails searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException {
		String cmd = "select * from leave_history WHERE LEAVE_ID = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet rs = pst.executeQuery();
		LeaveDetails leaveDetails = null;
		if(rs.next()) {
			leaveDetails = new LeaveDetails();
			leaveDetails.setLeaveId(rs.getInt("LEAVE_ID"));
			leaveDetails.setEmpId(rs.getInt("EMP_ID"));
			leaveDetails.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveDetails.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveDetails.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveDetails.setLeaveType(rs.getString("LEAVE_TYPE"));
			leaveDetails.setLeaveStatus(rs.getString("LEAVE_STATUS"));
			leaveDetails.setLeaveReason(rs.getString("LEAVE_REASON"));
			leaveDetails.setManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
		}
		return leaveDetails;
	}

	@Override
	public String approveDeny(int leaveId, int managerId, String status, String mgrComments) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		LeaveDetails leaveDetails = searchByLeaveId(leaveId);
		Employee employee = new EmployeeDaoImpl().searchEmployee(leaveDetails.getEmpId());
		int mgrId = employee.getEmpMgrId();
		if (mgrId!=managerId) {
			return "You are unauthorized Manager...";
		}
		if (status.equals("YES")) {
			String cmd = "Update leave_history set LEAVE_STATUS='APPROVED', LEAVE_MNGR_COMMENTS = ?"
					+ " WHERE LEAVE_ID = ?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, mgrComments);
			pst.setInt(2, leaveId);
			pst.executeUpdate();
			return "Your Leave Approved...";
		}
		if (status.equals("NO")) {
			String cmd = "Update leave_history set LEAVE_STATUS='DENIED', LEAVE_MNGR_COMMENTS = ?"
					+ " WHERE LEAVE_ID = ?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, mgrComments);
			pst.setInt(2, leaveId);
			pst.executeUpdate();
			cmd = "Update employee set EMP_AVAIL_LEAVE_BAL = EMP_AVAIL_LEAVE_BAL + ? "
					+ " WHERE EMP_ID = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, leaveDetails.getNoOfDays());
			pst.setInt(2, leaveDetails.getEmpId());
			pst.executeUpdate();
			return "Your Leave Rejected...Balance Added Back...";
		}
		return "";
	}

}
