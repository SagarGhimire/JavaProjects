package com.cerotid.bank.controller;

import java.util.Scanner;

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
		if(bankInterface.getCustomersByState(stateCode)==null) {
			System.out.println("No Customer exists for the given StateCode");
		}
		else
			bankInterface.getCustomersByState(stateCode);
		}
		catch(Exception e) {
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
		Customer cust = new Customer(firstName,lastName,null,ssn,custAddress); //need to fix the null one
		bankInterface.addCustomer(cust);

	}

	private void addCustomerAccount() {
		// TODO Auto-generated method stub

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
		return new Address(streetName,zipCode,City,stateCode);
		
	}

	public static Scanner getScannerInstance() {
		return new Scanner(System.in);

	}

}
