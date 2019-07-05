package com.cerotid.bank.controller;

import java.util.ArrayList;
import java.util.List;

import com.cerotid.bank.model.Account;
import com.cerotid.bank.model.Customer;
import com.cerotid.bank.model.*;

public class BankBOImpl implements BankBO {
	private static Bank bank;
	static {
		bank = new Bank();
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		bank.getCustomers().add(customer);

	}

	@Override
	public boolean openAccount(Customer customer, Account account) {
		// TODO Auto-generated method stub
		if (bank.getCustomers().contains(customer)) {
			int idx = bank.getCustomers().indexOf(customer);
			bank.getCustomers().get(idx).addAccount(account);
			return true;
		} else {
			System.out.println("Given customer doesn't exists");
			return false;
		}
	}

	@Override
	public void sendMoney(Customer customer, Transaction transaction) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositMoneyInCustomerAccount(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editCustomerInfo(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getCustomerInfo(String ssn) {
		// TODO Auto-generated method stub
		return bank.getCustomer(ssn);
	}

	@Override
	public void printBankStatus() {
		// TODO Auto-generated method stub
		System.out.println(bank);

	}

	@Override
	public void serializeBank() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> getCustomersByState(String StateCode) {
		ArrayList<Customer> custList = null;
		for (Customer c : bank.getCustomers()) {
			if (c.getCustAddress(c, StateCode) != null) { //Checkthis one
				custList.add(c);
			}
		}
		return custList;
	}

}
