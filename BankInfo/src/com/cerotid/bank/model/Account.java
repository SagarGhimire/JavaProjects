package com.cerotid.bank.model;

import java.util.Date;

public class Account {
	private AccountType accountType;
	private  Date accountOpenDate;
	private Date accountCloseDate;
	private double amount;
	private long accountNumber;
	
	
	public Account(AccountType accountType, Date accountOpenDate,double amount, long accountNumber) {
		this.accountType = accountType;
		this.accountOpenDate = accountOpenDate;
		//this.accountCloseDate = accountCloseDate;
		this.amount = amount;
		this.accountNumber = accountNumber;
	}

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

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public void printAccountInfo() {
		System.out.println(toString());
	}
	
	
    @Override
	public String toString() {
		return "Account [AccountType=" + this.accountType + ", accountOpenDate=" + accountOpenDate + ", accountCloseDate="
				+ accountCloseDate + ", amount=" + amount + ", accountNumber=" + accountNumber + "]";
	}

	public void sendMoney() {
		//TODO
    	
    }

}
