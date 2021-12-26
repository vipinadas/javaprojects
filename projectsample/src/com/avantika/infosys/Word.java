package com.avantika.infosys;

public class Word {
int SINo;
String wrd;

public Word( int sINo,String wrd) {
	SINo = sINo;

	this.wrd = wrd;
	}

@Override
public String toString() {
	return "Word [SINo=" + SINo + ", wrd=" + wrd + "]";
}
}
