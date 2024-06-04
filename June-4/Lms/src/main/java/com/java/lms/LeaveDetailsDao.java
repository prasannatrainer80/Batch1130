package com.java.lms;

import java.sql.SQLException;
import java.util.List;

public interface LeaveDetailsDao {
	String applyLeaveDao(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException;
	List<LeaveDetails> showLeaveHistory(int empId) throws SQLException, ClassNotFoundException;
	List<LeaveDetails> showPendingLeaves(int empId) throws ClassNotFoundException, SQLException;
	LeaveDetails searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException;
	String approveDeny(int leaveId, int managerId, String status, String mgrComments) throws ClassNotFoundException, SQLException;
}
