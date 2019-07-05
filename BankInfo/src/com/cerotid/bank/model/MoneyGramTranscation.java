package com.cerotid.bank.model;

public class MoneyGramTranscation extends Transaction {
	private deliveryOptions deliOps;
	private String destinationCountry;
	public deliveryOptions getDeliOps() {
		return deliOps;
	}
	public void setDeliOps(deliveryOptions deliOps) {
		this.deliOps = deliOps;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	

}
