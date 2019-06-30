package com.cerotid.bank.model;

public class Account {
	private String AccountType;

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	
	public void printAccountInfo() {
		System.out.println("AccountInfo " + getAccountType());
	}

}
