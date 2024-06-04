package com.java.lms;

import java.sql.Date;

public class LeaveDetails {

	private int leaveId;
	private int empId;
	private int noOfDays;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private String leaveType;
	private String leaveStatus;
	private String leaveReason;
	private String managerComments;

	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public String getManagerComments() {
		return managerComments;
	}
	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}
	public LeaveDetails() {
		// TODO Auto-generated constructor stub
	}
	public LeaveDetails(int leaveId, int empId, int noOfDays, Date leaveStartDate, Date leaveEndDate, String leaveType,
			String leaveStatus, String leaveReason, String managerComments) {
		this.leaveId = leaveId;
		this.empId = empId;
		this.noOfDays = noOfDays;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.leaveType = leaveType;
		this.leaveStatus = leaveStatus;
		this.leaveReason = leaveReason;
		this.managerComments = managerComments;
	}

	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", empId=" + empId + ", noOfDays=" + noOfDays + ", leaveStartDate="
				+ leaveStartDate + ", leaveEndDate=" + leaveEndDate + ", leaveType=" + leaveType + ", leaveStatus="
				+ leaveStatus + ", leaveReason=" + leaveReason + ", managerComments=" + managerComments + "]";
	}
	
}
