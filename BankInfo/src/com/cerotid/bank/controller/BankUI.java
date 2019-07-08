package com.cerotid.bank.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import com.cerotid.bank.model.*;

public class BankUI {
	private BankBO bankInterface;

	public BankBO getBankInterface() {
		return bankInterface;
	}

	public void setBankInterface(BankBO bankInterface) {
		this.bankInterface = bankInterface;
	}

	public static void main(String[] args) {
		BankUI bankUI = new BankUI();
		bankUI.setBankInterface(new BankBOImpl());
		while (true) {
			displayOption();
			bankUI.performMenuAction();
		}
	}

	private static void displayOption() {
		System.out.println("Choose from the menu below:\r\n" + " 1. Add Customer\r\n" + " 2. Add Account\r\n"
				+ " 3. Send Money\r\n" + " 4. Print Bank Status\r\n" + " 5. Print All Customers By State\r\n"
				+ " 6. Exit");
	}

	private void performMenuAction() {
		try {
			int choice = getScannerInstance().nextInt();

			switch (choice) {
			case 1:
				addCustomer();
				break;

			case 2:
				addCustomerAccount();
				break;
			case 3:
				sendMoney();
				break;
			case 4:
				bankInterface.printBankStatus();
				break;
			case 5:
				printCustomersByState();
				break;
			case 6:
				System.out.println("Thank you for choosing our bank");
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter the valid choice");
				break;
			}
		} catch (Exception e) {
			System.out.println("Please Enter an Integer");
		}

	}

	private void printCustomersByState() {
		try {
			System.out.println("Enter the stateCode for the list of customers");
			String stateCode = getScannerInstance().next();
			List<Customer> customers = new ArrayList<Customer>();
			customers = bankInterface.getCustomersByState(stateCode);
			if (customers == null) {
				System.out.println("No Customer exists for the given StateCode");
			} else {
				for (Customer c : customers)
					System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println("Please Enter valid String Value");
		}

	}

	private void sendMoney() {
		// TODO Auto-generated method stub

	}

	private void addCustomer() {
		System.out.println("Enter the Customer first Name");
		String firstName = getScannerInstance().next();
		System.out.println("Enter the Customer Last Name");
		String lastName = getScannerInstance().next();
		System.out.println("Enter the Customer SSN");
		String ssn = getScannerInstance().next();
		Address custAddress = getAddress();
		Customer cust = new Customer(firstName, lastName, ssn, custAddress);
		bankInterface.addCustomer(cust);

	}

	public void addCustomerAccount() {
		try {
			Customer cust = getCustomerInfo();
			if (cust != null) {
				Account account = new Account(getCustomerAccountType(), new Date(), getOpeningBalance(),
						getAccountNumber());
				cust.addAccount(account);
			} else {
				System.out.println("No Customer found for the given SSN");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private long getAccountNumber() {
		Random rand = new Random();
		long x = (long) (rand.nextDouble() * 10000000000000000L);
		return x;
	}

	private double getOpeningBalance() {
		Scanner val = getScannerInstance();
		System.out.println("Please Enter the opening balance for the account ");
		double balance = val.nextDouble();
		return balance;

	}

	private AccountType getCustomerAccountType() {
		System.out.println("Please Enter Integer for Account Type from below: ");
		System.out.println("1. Checking");
		System.out.println("2. Saving");
		System.out.println("3. Business_Checking");
		AccountType accountType = AccountType.Checking; // bydefault
		try {
			int choice = getScannerInstance().nextInt();
			switch (choice) {
			case 1:
				System.out.println("Checking selected");
				accountType = AccountType.Checking;
				break;
			case 2:
				accountType = AccountType.Saving;
				break;
			case 3:
				accountType = AccountType.Business_Checking;
				break;

			default:
				System.out.println("Please Enter valid Integer");
				break;
			}
		} catch (Exception e) {
			System.out.println("You have got the following exception " + e);
		}
		System.out.println("Account Type at end " + accountType);
		return accountType;
	}

	private Customer getCustomerInfo() {
		System.out.println("Enter the customer SSN for Account Info ");
		String ssn = getScannerInstance().next();
		return bankInterface.getCustomerInfo(ssn);
	}

	private Address getAddress() {
		System.out.println("Enter the Customer streetName");
		String streetName = getScannerInstance().next();
		System.out.println("Enter the Customer zipCode");
		String zipCode = getScannerInstance().next();
		System.out.println("Enter the Customer city");
		String City = getScannerInstance().next();
		System.out.println("Enter the Customer StateCode");
		String stateCode = getScannerInstance().next();
		return new Address(streetName, zipCode, City, stateCode);

	}

	public static Scanner getScannerInstance() {
		return new Scanner(System.in);

	}

}
