package com.cerotid.bank.model;

import java.util.*;

public class Customer {
	private String firstName;
	private String lastName;
	private ArrayList<Account> accounts;
	private String ssn;
	private Address address;

	public Customer(String firstName, String lastName, String ssn, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.address = address;
		this.accounts = new ArrayList<>();
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
		accounts.forEach(x->System.out.println(x));
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
	public ArrayList<Account> addAccount(Account account) {
		this.accounts.add(account);
		return accounts;
	}

}
