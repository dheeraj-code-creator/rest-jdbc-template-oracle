package com.rest.jpa.oracle.entity;

public class Demo {

	private int userId;
	private String userName;
	private int userMonthlySalry;
	private int userAnnualSalry;
	private String userAddress;
	private String userCompany;
	
	public int getUserAnnualSalry() {
		return userAnnualSalry;
	}
	public void setUserAnnualSalry(int userAnnualSalry) {
		this.userAnnualSalry = userAnnualSalry;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserCompany() {
		return userCompany;
	}
	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserMonthlySalry() {
		return userMonthlySalry;
	}
	public void setUserMonthlySalry(int userMonthlySalry) {
		this.userMonthlySalry = userMonthlySalry;
	}
}
