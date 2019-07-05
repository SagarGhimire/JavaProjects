package com.cerotid.bank.model;

public enum deliveryOptions {
	TEN_MINUTES("10M"), TWENTY_FOUR_HOURS("24H");
	
	private final String time;
	
	deliveryOptions(String time){
		this.time = time;
	}
	public String getTime() {
		return time;
	}

}
