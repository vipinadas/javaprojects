package com.avantika.infosys;

public class IFSCode {
public String ifsc;

public IFSCode(String ifsc) {
	//super();
	this.ifsc = ifsc;
}

@Override
public String toString() {
	return "IFSCode [ifsc=" + ifsc + "]";
}

}
