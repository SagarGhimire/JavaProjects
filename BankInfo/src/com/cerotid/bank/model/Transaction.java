package com.cerotid.bank.model;

public class Transaction {
	private double amount;
	private double fee;
	private String firstName;
	private String lastName;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
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
	public void createTransaction() {
		//TODO
	}
	public double deductAccountBalance() {
		//TODO
		return -1;
	}
	

}
