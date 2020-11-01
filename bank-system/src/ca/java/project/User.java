package ca.java.project;

import java.util.ArrayList;

public class User {
	
	private String firstName;
	private String lastName;
	private String postalCode;
	private String phoneNum;
	
	
	private ArrayList<BankAccount> accounts;
	 
	public User(String firstName, String lastName, String postalCode, String phoneNum) {
		setFirstName(firstName);
		setLastName(lastName);
		setPostalCode(postalCode);
		setPhoneNum(phoneNum);
		this.accounts = new ArrayList<BankAccount>();
		
	}
	
	/*
	 * @param BankAccount b to populate the ArrayList accounts
	 */
	public void addBankAccount(BankAccount b) {
		this.accounts.add(b);
	}
	
	/*
	 * @return ArrayList<BankAccount> accounts
	 */
	public ArrayList<BankAccount> getAccounts() {
		return accounts;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		if (!postalCode.isEmpty() && !postalCode.equalsIgnoreCase(null)) {
			this.postalCode = postalCode;
		} else {
			this.postalCode = "Unknown";
		}
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		if (!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
		} else {
			this.postalCode = "Unknown";
		}
	}
	
	@Override
	public String toString() {
		return "User Information \nFirst Name : " + firstName + 
				"\nLast Name : " + lastName +
				"\nPostal Code : " + postalCode +
				"\nPhone Number : " + phoneNum;
	}
	
}
