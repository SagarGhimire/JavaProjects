package com.cerotid.bank.model;

public class ElectronicCheckTranscation extends Transaction{
	private typeOfCheck checkType;
	
	public ElectronicCheckTranscation(typeOfCheck checkType) {
		super();
		this.checkType = checkType;
	}

	public typeOfCheck getCheckType() {
		return checkType;
	}

	public void setCheckType(typeOfCheck checkType) {
		this.checkType = checkType;
	}

}
