package com.persistent.tourism.entities;

public class User {

	private String firstName;
	private String lastName;
	private long mobNo;
	private String password;
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", mobNo=" + mobNo + ", password=" + password
				+ "]";
	}
}
