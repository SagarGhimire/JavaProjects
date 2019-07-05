package com.cerotid.bank.model;

public class Address {
	private String streetName;
	private String zipCode;
	private String city;
	private String stateCode;
	
	public Address(String streetName, String zipCode, String city, String stateCode) {
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.city =city;
		this.stateCode =stateCode;
	}
	public String getStreetName() {
		return streetName;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", zipCode=" + zipCode + ", city=" + city + ", stateCode="
				+ stateCode + "]";
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

}
