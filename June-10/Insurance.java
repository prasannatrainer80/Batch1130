package com.java.junit;

import java.util.Date;
import java.util.Objects;

public class Insurance {

	private int insuranceId;
	private String insuranceName;
	private double insuranceAmount;
	private String payMode;
	private Date insuranceDate;
	private double installmentAmount;
	private Date paymentDate;
	private Date actualDate;
	private int tat;
	private String comments;
	private int status;
	public int getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public double getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public Date getInsuranceDate() {
		return insuranceDate;
	}
	public void setInsuranceDate(Date insuranceDate) {
		this.insuranceDate = insuranceDate;
	}
	public double getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Date getActualDate() {
		return actualDate;
	}
	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}
	public int getTat() {
		return tat;
	}
	public void setTat(int tat) {
		this.tat = tat;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Insurance() {
		// TODO Auto-generated constructor stub
	}
	public Insurance(int insuranceId, String insuranceName, double insuranceAmount, String payMode, Date insuranceDate,
			double installmentAmount, Date paymentDate, Date actualDate, int tat, String comments, int status) {
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceAmount = insuranceAmount;
		this.payMode = payMode;
		this.insuranceDate = insuranceDate;
		this.installmentAmount = installmentAmount;
		this.paymentDate = paymentDate;
		this.actualDate = actualDate;
		this.tat = tat;
		this.comments = comments;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceAmount="
				+ insuranceAmount + ", payMode=" + payMode + ", insuranceDate=" + insuranceDate + ", installmentAmount="
				+ installmentAmount + ", paymentDate=" + paymentDate + ", actualDate=" + actualDate + ", tat=" + tat
				+ ", comments=" + comments + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(actualDate, comments, installmentAmount, insuranceAmount, insuranceDate, insuranceId,
				insuranceName, payMode, paymentDate, status, tat);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Insurance other = (Insurance) obj;
		return Objects.equals(actualDate, other.actualDate) && Objects.equals(comments, other.comments)
				&& Double.doubleToLongBits(installmentAmount) == Double.doubleToLongBits(other.installmentAmount)
				&& Double.doubleToLongBits(insuranceAmount) == Double.doubleToLongBits(other.insuranceAmount)
				&& Objects.equals(insuranceDate, other.insuranceDate) && insuranceId == other.insuranceId
				&& Objects.equals(insuranceName, other.insuranceName) && Objects.equals(payMode, other.payMode)
				&& Objects.equals(paymentDate, other.paymentDate) && status == other.status && tat == other.tat;
	}
	
	
}
