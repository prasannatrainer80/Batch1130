package com.java.exam;

import java.util.Date;
import java.util.Objects;

public class Patient {

	private int patientId;
	private String patientName;
	private String city;
	private String zipcode;
	private int doctorId;
	private String doctorName;
	private String slotTime;
	private Date appointmentDate;
	private Date bookingDate;
	private String treamtmentReason;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSlotTime() {
		return slotTime;
	}
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getTreamtmentReason() {
		return treamtmentReason;
	}
	public void setTreamtmentReason(String treamtmentReason) {
		this.treamtmentReason = treamtmentReason;
	}
	public Patient() {

	}
	public Patient(int patientId, String patientName, String city, String zipcode, int doctorId, String doctorName,
			String slotTime, Date appointmentDate, Date bookingDate, String treamtmentReason) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.city = city;
		this.zipcode = zipcode;
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.slotTime = slotTime;
		this.appointmentDate = appointmentDate;
		this.bookingDate = bookingDate;
		this.treamtmentReason = treamtmentReason;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", city=" + city + ", zipcode="
				+ zipcode + ", doctorId=" + doctorId + ", doctorName=" + doctorName + ", slotTime=" + slotTime
				+ ", appointmentDate=" + appointmentDate + ", bookingDate=" + bookingDate + ", treamtmentReason="
				+ treamtmentReason + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(appointmentDate, bookingDate, city, doctorId, doctorName, patientId, patientName, slotTime,
				treamtmentReason, zipcode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(appointmentDate, other.appointmentDate) && Objects.equals(bookingDate, other.bookingDate)
				&& Objects.equals(city, other.city) && doctorId == other.doctorId
				&& Objects.equals(doctorName, other.doctorName) && patientId == other.patientId
				&& Objects.equals(patientName, other.patientName) && Objects.equals(slotTime, other.slotTime)
				&& Objects.equals(treamtmentReason, other.treamtmentReason) && Objects.equals(zipcode, other.zipcode);
	}
	
	
}
