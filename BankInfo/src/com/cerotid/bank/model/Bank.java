package com.cerotid.bank.model;

import java.util.ArrayList;

public class Bank {
	private String bankName;
	private ArrayList<Customer> customers;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
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
		System.out.println("The customers in ");
		printBankName();
		for(Customer c : getCustomers()) {
			System.out.println(c);
		}
	}

}
