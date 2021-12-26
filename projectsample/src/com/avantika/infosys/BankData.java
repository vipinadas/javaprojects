package com.avantika.infosys;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BankData {
	public static void main(String args[])
	{
IFSCode obj1=new IFSCode("CNRB100");
IFSCode obj2=new IFSCode("SB100");
IFSCode obj3=new IFSCode("CSRB100");
IFSCode obj4=new IFSCode("PNRB100");
IFSCode obj5=new IFSCode("CNRB100");
IFSCode obj6=new IFSCode("CRB100");
IFSCode obj7=new IFSCode("RBI100");
IFSCode obj8=new IFSCode("SNRB100");
IFSCode obj9=new IFSCode("CORB100");
IFSCode obj10=new IFSCode("CNPB100");
BankAddress bkcnrb=new BankAddress("Attingal", "Attingal", "TVM","Kerala",695501);
BankAddress bksbi=new BankAddress("Attingal", "Attingal", "TVM","Kerala",695501);
BankAddress bkpnb=new BankAddress("Attingal", "Attingal", "TVM","Kerala",695501);
BankAddress bkcsr=new BankAddress("Attingal", "Attingal", "TVM","Kerala",695501);
BankAddress bkbob=new BankAddress("chirayinkeezhu", "Attingal", "TVM","Kerala",695501);

	Map<IFSCode,BankAddress> bnk1=new HashMap<>();
	bnk1.put(obj1, bkcnrb);
	bnk1.put(obj2, bksbi);
	bnk1.put(obj3, bkpnb);
	bnk1.put(obj4, bkcsr);
	bnk1.put(obj5, bkbob);
	Iterator itr=bnk1.keySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(bnk1.get(itr.next()));
	}
	
	}
}
