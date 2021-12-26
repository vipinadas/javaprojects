package com.avantika.infosy;

public class CloningClass {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Address address=new Address(1025,"Koonthalloor","Chirayinkeezhu",695304);
		Employee1 e1=new Employee1(101, 10000,"Nakul",address);
	
		Employee1 e2=(Employee1) e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		e1.setEmpId(106);
		System.out.println(e1);
	   e2.getAddress().setCity("Mandya");
		System.out.println(e1.getAddress()==e2.getAddress());
		System.out.println("e1 is" + e1);
		System.out.println("e2 is" + e2);
		
	}

}
