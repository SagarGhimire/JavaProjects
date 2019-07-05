package com.cerotid.bank.model;

public class WireTransferTranscation extends Transaction {
	private String beneficiary_firstName;
	private String beneficiary_lastName;
	private String intermediaryBankSWIFTCode;
	private String beneficiaryBankName;
	private String beneficiaryAccNumber;
	
	public WireTransferTranscation(String beneficiary_firstName, String beneficiary_lastName,String intermediaryBankSWIFTCode,String beneficiaryBankName, String beneficiaryAccNumber) {
		super();
		this.beneficiary_firstName = beneficiary_firstName;
		this.beneficiary_lastName = beneficiary_lastName;
		this.beneficiaryAccNumber = beneficiaryAccNumber;
		this.intermediaryBankSWIFTCode = intermediaryBankSWIFTCode ;
		this.beneficiaryBankName = beneficiaryBankName;
	}
	
	public String getBeneficiary_firstName() {
		return beneficiary_firstName;
	}
	public void setBeneficiary_firstName(String beneficiary_firstName) {
		this.beneficiary_firstName = beneficiary_firstName;
	}
	public String getBeneficiary_lastName() {
		return beneficiary_lastName;
	}
	public void setBeneficiary_lastName(String beneficiary_lastName) {
		this.beneficiary_lastName = beneficiary_lastName;
	}
	public String getIntermediaryBankSWIFTCode() {
		return intermediaryBankSWIFTCode;
	}
	public void setIntermediaryBankSWIFTCode(String intermediaryBankSWIFTCode) {
		this.intermediaryBankSWIFTCode = intermediaryBankSWIFTCode;
	}
	public String getBeneficiaryBankName() {
		return beneficiaryBankName;
	}
	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}
	public String getBeneficiaryAccNumber() {
		return beneficiaryAccNumber;
	}
	public void setBeneficiaryAccNumber(String beneficiaryAccNumber) {
		this.beneficiaryAccNumber = beneficiaryAccNumber;
	}
	

}
