package com.java.nq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="validate",query = "from Users where userName=:userName AND passCode=:passCode")
})
@Entity
@Table(name="Users")
public class Users {

	@Id
	@Column(name="userName")
	private String userName;
	@Column(name="passCode")
	private String passCode;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(String userName, String passCode) {
		this.userName = userName;
		this.passCode = passCode;
	}
	
	
}
