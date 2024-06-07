package com.java.junit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class LeaveDetails {

	private int leaveId;
	private int empId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private int noOfDays;
	private String leaveType;
	private String leaveStatus;
	private String leaveReason;
	private Date appliedOn;
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
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
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
	public Date getAppliedOn() {
		return appliedOn;
	}
	public void setAppliedOn(Date appliedOn) {
		this.appliedOn = appliedOn;
	}
	public LeaveDetails() {
		// TODO Auto-generated constructor stub
	}
	public LeaveDetails(int leaveId, int empId, Date leaveStartDate, Date leaveEndDate, int noOfDays, String leaveType,
			String leaveStatus, String leaveReason, Date appliedOn) {
		this.leaveId = leaveId;
		this.empId = empId;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.noOfDays = noOfDays;
		this.leaveType = leaveType;
		this.leaveStatus = leaveStatus;
		this.leaveReason = leaveReason;
		this.appliedOn = appliedOn;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "LeaveDetails [leaveId=" + leaveId + ", empId=" + empId + ", leaveStartDate=" + sdf.format(leaveStartDate)
				+ ", leaveEndDate=" + sdf.format(leaveEndDate) + ", noOfDays=" + noOfDays + ", leaveType=" + leaveType
				+ ", leaveStatus=" + leaveStatus + ", leaveReason=" + leaveReason + ", appliedOn=" + sdf.format(appliedOn) + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(appliedOn, empId, leaveEndDate, leaveId, leaveReason, leaveStartDate, leaveStatus,
				leaveType, noOfDays);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeaveDetails other = (LeaveDetails) obj;
		return Objects.equals(appliedOn, other.appliedOn) && empId == other.empId
				&& Objects.equals(leaveEndDate, other.leaveEndDate) && leaveId == other.leaveId
				&& Objects.equals(leaveReason, other.leaveReason)
				&& Objects.equals(leaveStartDate, other.leaveStartDate)
				&& Objects.equals(leaveStatus, other.leaveStatus) && Objects.equals(leaveType, other.leaveType)
				&& noOfDays == other.noOfDays;
	}
	
	
}
