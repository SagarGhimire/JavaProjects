package com.cerotid.bank.model;

import java.util.Date;

public class Account {
	private AccountType AccountType;
	private  Date accountOpenDate;
	private Date accountCloseDate;
	private double amount;
	
	public Date getAccountOpenDate() {
		return accountOpenDate;
	}

	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public Date getAccountCloseDate() {
		return accountCloseDate;
	}

	public void setAccountCloseDate(Date accountCloseDate) {
		this.accountCloseDate = accountCloseDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	private int accountNumber;

	public AccountType getAccountType() {
		return AccountType;
	}

	public void setAccountType(AccountType accountType) {
		AccountType = accountType;
	}
	
	public void printAccountInfo() {
		System.out.println(toString());
	}
	
	
    @Override
	public String toString() {
		return "Account [AccountType=" + AccountType + ", accountOpenDate=" + accountOpenDate + ", accountCloseDate="
				+ accountCloseDate + ", amount=" + amount + ", accountNumber=" + accountNumber + "]";
	}

	public void sendMoney() {
    	
    }

}
