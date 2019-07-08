package com.cerotid.bank.model;

import java.util.ArrayList;

public class Bank {
	private final String bankName = "US BANK";
	private ArrayList<Customer> customers;

	public Bank() {
		this.customers = new ArrayList<Customer>();
	}

	public String getBankName() {
		return bankName;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public void printBankName() {
		System.out.println(getBankName());

	}

	public void printBankDetails() {
		System.out.println(toString());

	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", customers=" + customers + "]";
	}

	public Customer getCustomer(String ssn) {
		// TODO Auto-generated method stub
		for (Customer c : customers) {
			if (c.getSsn().equals(ssn)) {
				return c;
			}
		}
		return null;
	}

}
