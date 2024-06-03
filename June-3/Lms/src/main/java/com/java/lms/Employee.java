package com.java.lms;

import java.sql.Date;

public class Employee {

	private int empId;
	private String empName;
	private String empEmail;
	private String empMobNo;
	private Date empDtJoin;
	private String empDept;
	private int empMgrId;
	private int empAvailBal;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}
	public Date getEmpDtJoin() {
		return empDtJoin;
	}
	public void setEmpDtJoin(Date empDtJoin) {
		this.empDtJoin = empDtJoin;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpMgrId() {
		return empMgrId;
	}
	public void setEmpMgrId(int empMgrId) {
		this.empMgrId = empMgrId;
	}
	public int getEmpAvailBal() {
		return empAvailBal;
	}
	public void setEmpAvailBal(int empAvailBal) {
		this.empAvailBal = empAvailBal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empMobNo=" + empMobNo
				+ ", empDtJoin=" + empDtJoin + ", empDept=" + empDept + ", empMgrId=" + empMgrId + ", empAvailBal="
				+ empAvailBal + "]";
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empEmail, String empMobNo, Date empDtJoin, String empDept,
			int empMgrId, int empAvailBal) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empMobNo = empMobNo;
		this.empDtJoin = empDtJoin;
		this.empDept = empDept;
		this.empMgrId = empMgrId;
		this.empAvailBal = empAvailBal;
	}
	
	
}
