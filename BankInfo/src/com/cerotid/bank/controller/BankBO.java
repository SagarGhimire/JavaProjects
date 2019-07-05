package com.cerotid.bank.controller;

import java.util.List;

import com.cerotid.bank.model.*;

public interface BankBO {
	public void addCustomer(Customer customer);
	public boolean openAccount(Customer customer, Account account);
	public void sendMoney(Customer customer, Transaction transaction);
	public void depositMoneyInCustomerAccount(Customer customer);
	public void editCustomerInfo(Customer customer);
	public Customer getCustomerInfo(String ssn);
	public void printBankStatus();
	public void serializeBank();
	public List<Customer> getCustomersByState(String StateCode);

}
