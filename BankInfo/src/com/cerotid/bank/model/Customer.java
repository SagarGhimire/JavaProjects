package com.cerotid.bank.model;
import java.util.*;
public class Customer {
	private String firstName;
	private String lastName;
	private ArrayList<Account> accounts;
	private Address address;
	
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
	public void printCustomerAccounts() {
		for(Account a : getAccounts()) {
			System.out.println(a + " ");
		}
	}
	public void printCustomerDetails() {
		printCustomerAccounts();
		System.out.println("Name " + getFirstName()+" "+getLastName()+" "+getAddress());
	}
	
	

}
