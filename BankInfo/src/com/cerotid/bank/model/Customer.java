package com.cerotid.bank.model;

import java.util.*;

public class Customer {
	private String firstName;
	private String lastName;
	private ArrayList<Account> accounts;
	private String ssn;
	private Address address;

	public Customer(String firstName, String lastName, ArrayList<Account> accounts, String ssn, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = accounts;
		this.ssn = ssn;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void printCustomerAccounts() {
		for (Account a : getAccounts()) {
			System.out.println(a + " ");
		}
	}

	public void printCustomerDetails() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", accounts=" + accounts + ", address="
				+ address + "]";
	}

	// Check It
	public void addAccount(Account account) {
		this.accounts.add(account);
		// TODO Auto-generated method stub
	}

	public Customer getCustAddress(Customer c, String state) {
		if (c.getAddress().getStateCode().equals(state)) {
			return c;
		} else {
			// System.out.println("No Customer found for the given State Code");
			return null;
		}

	}

}
