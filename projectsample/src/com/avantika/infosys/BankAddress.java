package com.avantika.infosys;

public class BankAddress {
public String  branchName;
public String locationName;
public String district;
public String state;
public int pinCode;
public BankAddress(String branchName, String locationName, String district, String state, int pinCode) {
	super();
	this.branchName = branchName;
	this.locationName = locationName;
	this.district = district;
	this.state = state;
	this.pinCode = pinCode;
}
@Override
public String toString() {
	return "BankAddress [branchName=" + branchName + ", locationName=" + locationName + ", district=" + district
			+ ", state=" + state + ", pinCode=" + pinCode + "]";
}

 
}
